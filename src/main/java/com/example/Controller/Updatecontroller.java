package com.example.Controller;

import com.example.Entity.Book;
import com.example.Entity.User;
import com.example.Mapper.Updatemapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class Updatecontroller {
    @Autowired
    Updatemapper updatemapper;
    @RequestMapping("/upname")
    public Integer upname(@RequestBody User user, HttpSession session){
        String oldusername=session.getAttribute("username").toString();
        updatemapper.upname(user.getUsername(),oldusername);
        return 1;
    }
    @RequestMapping("/uppassword")
    public Integer uppassword(@RequestBody User user,HttpSession session){
        String oldpassword=session.getAttribute("password").toString();
        String oldusername=session.getAttribute("username").toString();
        updatemapper.uppassword(user.getPassword(),oldpassword,oldusername);
        return 1;
    }
    @RequestMapping("/upmoney")
    public Integer upmoney(@RequestBody User user,HttpSession session){
        String username=session.getAttribute("username").toString();
        updatemapper.upmoney(username,user.getMoney());
        return 1;
    }
    @RequestMapping("/semoney")
    public Integer semoney(HttpSession session)
    {
        String username=session.getAttribute("username").toString();
        return updatemapper.semoney(username);
    }
    @RequestMapping("/likeadd")
    public Integer likeadd(@RequestBody Book book) {
        System.out.println(book);
        Book book2 = updatemapper.find(book.getName());
        if (book2 != null) {
            return 2;
        }
        updatemapper.likeadd(book);
        return 1;

    }

}
