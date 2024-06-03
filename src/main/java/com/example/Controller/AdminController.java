package com.example.Controller;

import com.example.Entity.Admin;
import com.example.Entity.Book;
import com.example.Entity.User;
import com.example.Mapper.AdminMapper;
import com.example.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    UserMapper userMapper;


    @RequestMapping("/insert_book")
    public int insert_book(@RequestBody Book book){
        //  插入成功自动返回1，否则返回0；
        return adminMapper.insert_book(book);
    }

    @RequestMapping("/delete_book")
    public void delete(int id){
        adminMapper.delete(id);
    }
    @RequestMapping("/adminlogin")
    public int adminlogin(@RequestBody Admin admin, HttpSession session){
        Admin admin1= adminMapper.select_byname(admin.getAdminname());
        if (admin1!=null){
            if (admin1.getPassword().equals(admin.getPassword())){
                session.setAttribute("admin",admin1);
                /*String oldadminname = session.getAttribute("adminname").toString();*/

                return 1;  //代表登录成功
            }
            else {
                return 3;  //代表密码错误
            }
        }
        else {
            return 2;  //2代表用户不存在
        }
    }
    @RequestMapping("/select_user")
    public List<User> select_user(){
        return adminMapper.select_user();
    }
    @RequestMapping("deletebyname")
    public void delete(String username)
    {
        userMapper.deletebyname(username);
    }
}
