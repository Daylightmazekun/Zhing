package com.nukezam.service.impl;

import com.nukezam.entity.JapaneseWord;
import com.nukezam.entity.User;
import com.nukezam.service.Japanese;
import org.springframework.stereotype.Service;

@Service
public class JapaneseImpl implements Japanese {
    @Override
    public JapaneseWord findJapaneseByUserId(User user) {
        return null;
    }
}
