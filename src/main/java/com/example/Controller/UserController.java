package com.example.Controller;

import com.example.Entity.User;
import com.example.Entity.code;
import com.example.Entity.loginv;
import com.example.Entity.tiezi;
import com.example.Mapper.RegMapper;
import com.example.Mapper.UserMapper;
import com.example.Service.MailService;
import com.example.tool.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

@RestController
public class UserController {
    @Autowired
    MailService mailService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    RegMapper regmapper;

    @RequestMapping("/login")
    public int login(@RequestBody loginv loginv, HttpSession session){
        User user1=userMapper.select_byname(loginv.getUser().getUsername());
        System.out.println(loginv);
        if (user1!=null){
            if (user1.getPassword().equals(loginv.getUser().getPassword())&& loginv.getCode().getInputcode().toLowerCase().equals(loginv.getCode().getCodetext().toLowerCase())){
                session.setAttribute("user",user1);
                session.setAttribute("username",user1.getUsername());
                session.setAttribute("password",user1.getPassword());
                return 1;  //代表登录成功
            }
            else if(!loginv.getCode().getInputcode().toLowerCase().equals(loginv.getCode().getCodetext().toLowerCase())){
                return 3;  //代表密码错误
            }
            else {
                return 4;
            }
        }
        else {
            return 2;  //2代表用户不存在
        }
    }


    //  发送验证码
    @RequestMapping("/mail")
    public String mail(@RequestBody User user) {
        String mailbox = user.getMail();
        System.out.println(mailbox);
        String code="";
        Random r = new Random();
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9);
            code+=a[i];
        }
        mailService.sendMail(mailbox, "注册验证码", code);
        return code;
    }

    @RequestMapping("/reg")
    public Integer insert(@RequestBody User user) {
        //  获取用户名
        String username1 = user.getUsername();
        User user2 = regmapper.find(username1);
        if (user2 != null) {
            return 2;
        }
        return regmapper.insert(user.getUsername(), user.getPassword(), user.getMail());
    }

    @RequestMapping("/delete_user")
    public void delete(@RequestBody User user){
        regmapper.delete(user.getUsername());
    }

    @RequestMapping("/selectcode")
    public code selectcode(){
        code code = new code(CodeUtil.getCode());
        return code;
    }

    @RequestMapping("/select_upper")
    public List<tiezi> select_upper(){
        return userMapper.select_upper();
    }

    @RequestMapping("/insert_upper")
    public Integer insert(String username,String text){
        System.out.println(username);
        System.out.println(text);
        return userMapper.insert(username,text);
    }
    @RequestMapping("/uptiezi")
    public Integer upload(String text,HttpSession session){
       String username=session.getAttribute("username").toString();
        //  插入成功则返回1；
        if (userMapper.upload(username,text)==1){
            return 1;
        }else {
            return 0;
        }
    }
}
