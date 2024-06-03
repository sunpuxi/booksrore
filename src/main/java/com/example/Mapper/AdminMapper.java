package com.example.Mapper;

import com.example.Entity.Admin;
import com.example.Entity.Book;
import com.example.Entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where adminname=#{adminname}")
    Admin select_byname(String adminname);

    @Insert("insert into book(id,name,url,catename,price,intro,jianjie,time) values(null,#{name},#{url},#{catename},#{price},#{intro},#{jianjie},#{time})")
    int insert_book(Book book);

    @Delete("delete from book where id=#{id}")
    void delete(int id);
    @Select("select * from user")
    List<User> select_user();

}

