package com.nukezam.security;

import com.nukezam.entity.User;
import com.nukezam.service.ValidateUser;
import com.nukezam.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
@EnableWebSecurity
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private User user;

    public CustomAuthenticationProvider(User user){
        this.user = user;
    }

    @Autowired
    private ValidateUser validateUser;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
        String username = token.getName();
        User userV = null;
        if (username != null) {
            userV = validateUser.loadUserByUsername(username);
        }
        else{
            userV = validateUser.loadUserByUsername(user.getUserName());
        }
        if (userV == null) {
            throw new UsernameNotFoundException("用户名/密码无效");
        } else if (userV.isEnabled()) {
            throw new DisabledException("用户已被禁用");
        }
//        } else if (user.isAccountNonExpired()) {
//            throw new AccountExpiredException("账号已过期");
//        } else if (user.isAccountNonLocked()) {
//            throw new LockedException("账号已被锁定");
//        } else if (user.isCredentialsNonExpired()) {
//            throw new LockedException("凭证已过期");
//        }
        //数据库用户的密码
        String password = userV.getPassWord();
        String pwdDigest = Md5Util.pwdDigest(token.getCredentials().toString());
        //与authentication里面的credentials相比较
        if (!password.equals(pwdDigest)) {

            throw new BadCredentialsException("Invalid username/password");
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("user",userV);
        //授权
        return new UsernamePasswordAuthenticationToken(userV, password, getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }
}
