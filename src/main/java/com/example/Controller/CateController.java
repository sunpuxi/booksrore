package com.example.Controller;

import com.example.Entity.Cate;
import com.example.Mapper.CateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CateController {

    @Autowired
    CateMapper cateMapper;

    @RequestMapping("/cate/select")
    public List<Cate> selectcate(){
        return cateMapper.selectcate();
    }
}
