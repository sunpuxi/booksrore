package com.example.Mapper;

import com.example.Entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegMapper {
    @Insert("insert into user(username,password,money,mail,id) values(#{username},#{password},0,#{mail},null)")
    Integer insert(String username,String password,String mail);
    @Select("select * from user where username=#{username}")
    User find(String username);

    @Delete("delete from user where username=#{username}")
    void delete(String username);
}
