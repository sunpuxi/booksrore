package com.example.Mapper;

import com.example.Entity.Cate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CateMapper {
    @Select("select * from cate")
    List<Cate> selectcate();
}
