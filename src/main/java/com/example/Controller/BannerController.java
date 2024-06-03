package com.example.Controller;

import com.example.Entity.Banner;
import com.example.Mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {

    @Autowired
    BannerMapper bannerMapper;

    @RequestMapping("/banner/select")
    public List<Banner> selectbanner(){
        return bannerMapper.selectbanner();
    }
}
