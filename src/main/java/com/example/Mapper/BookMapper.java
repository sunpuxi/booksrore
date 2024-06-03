package com.example.Mapper;

import com.example.Entity.Book;
import com.example.Entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> selectbook();

    @Select("select * from book order by intro desc limit 0,3")
    List<Book> selecttop();

    @Select("select * from book where name like concat('%',#{wd},'%')")
    List<Book> selectres(String wd);

    @Select("select * from book where id=#{id}")
    Book select_detail(int id);

    @Select("select * from book where time>2020")
   List<Book> select_new();
    @Insert("insert into book(id,name,url,catename,price,intro,jianjie,time) values(null,#{name},#{url},#{catename},#{price},#{intro},#{jianjie},#{time})")
    void insertbook(Book book);
    @Delete("delete from book where name=#{name}")
    void deletebybookname(String name);

    @Select("select * from comment where bookname=#{bookname}")
    List<Comment> select_shupin(String bookname);
}
