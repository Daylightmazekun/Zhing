package com.nukezam.mapper;


import com.nukezam.entity.JapaneseWord;
import com.nukezam.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FindJapaneseMapper extends MyMapper<JapaneseWord> {

    List<JapaneseWord> findJapaneseByUserId(@Param("userId") int userId);
}
