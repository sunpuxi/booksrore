package com.example.Controller;

import com.example.Entity.Book;
import com.example.Entity.Comment;
import com.example.Mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/book/select")
    public List<Book> selectbook(){
        return bookMapper.selectbook();
    }

    @RequestMapping("/selecttop")
    public List<Book> selecttop(){
        return bookMapper.selecttop();
    }

    @RequestMapping("/selectres")
    public List<Book> selectres(String wd){
        return bookMapper.selectres(wd);
    }

    @RequestMapping("/select_detail")
    public Book select_detail(int id){
        return bookMapper.select_detail(id);
    }

    @RequestMapping("/select_new")
    public List<Book> select_new(){
        return bookMapper.select_new();
    }
    @RequestMapping("insert_book1")
    public void insertbook(@RequestBody Book book){
        bookMapper.insertbook(book);
        System.out.println(book);
    }
    @RequestMapping("deletebybookname")
    public void delete(String name)
    {
        bookMapper.deletebybookname(name);
    }


    //  获取该本书的全部书评
    @RequestMapping("/select_shupin")
    public List<Comment> select_shupin(int id){
        Book book=bookMapper.select_detail(id);  //获取书本对象
        String bookname=book.getName();  //获取书名；
        return bookMapper.select_shupin(bookname);
    }
}

