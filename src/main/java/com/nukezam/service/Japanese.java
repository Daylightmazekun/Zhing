package com.nukezam.service;

import com.nukezam.entity.JapaneseWord;

import java.util.List;

public interface Japanese {

    List<JapaneseWord> findJapaneseByUserId(int userId);
}
