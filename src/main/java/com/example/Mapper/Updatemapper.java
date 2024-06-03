package com.example.Mapper;

import com.example.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Updatemapper {
    @Update("update user set username=#{username} where username=#{oldusername}")
    Integer upname(String username,String oldusername);
    @Update("update user set password=#{password} where password=#{oldpassword} and username=#{oldusername}")
    Integer uppassword(String password,String oldpassword,String oldusername);
    @Update("update user set money=money+#{money} where username=#{username}")
    Integer upmoney(String username,Integer money);
    @Select("select money from user where username=#{username}")
    Integer semoney(String username);
    @Update("update book set islike=1 where name=#{name}")
    Integer likeadd(Book book);
    @Select("select * from book where name=#{name} and islike=1")
    Book find(String name);

}
