package com.example.Mapper;
import com.example.Entity.User;
import com.example.Entity.tiezi;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    User select_byname(String username);

    @Select("select * from tiezi where text is not null ")
    List<tiezi> select_upper();

    @Update("update tiezi set text=#{text} where username=#{username}")
    Integer insert(String username, String text);
    @Delete("delete from user where username=#{username}")
    void deletebyname(String username);

    @Insert("insert into tiezi values(#{username},#{text})")
    Integer upload(String username,String text);
}
