package com.nukezam.service;

import com.nukezam.entity.JapaneseWorld;
import com.nukezam.entity.User;

public interface Japanese {

    JapaneseWorld findJapaneseByUserId(User user);
}
