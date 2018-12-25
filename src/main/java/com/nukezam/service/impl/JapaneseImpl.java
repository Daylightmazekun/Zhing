package com.nukezam.service.impl;

import com.nukezam.entity.JapaneseWord;
import com.nukezam.mapper.FindJapaneseMapper;
import com.nukezam.service.Japanese;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JapaneseImpl implements Japanese {

    @Resource
    private FindJapaneseMapper findJapaneseMapper;

    @Override
    public List<JapaneseWord> findJapaneseByUserId(int userId) {
        return findJapaneseMapper.findJapaneseByUserId(userId);
    }
}
