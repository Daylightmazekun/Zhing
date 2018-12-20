package com.nukezam.service;

import com.nukezam.entity.JapaneseWord;
import com.nukezam.entity.User;

public interface Japanese {

    JapaneseWord findJapaneseByUserId(User user);
}
