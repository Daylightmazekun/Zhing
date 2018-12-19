package com.nukezam.mapper;


import com.nukezam.service.Japanese;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FindJapaneseMapper {

    List<Japanese> findJapaneseByUserId(@Param("userId") String UserId);
}
