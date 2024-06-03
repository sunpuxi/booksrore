package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class uploadController {
    @Value("C:/files")
    private String dirPath;
    @RequestMapping("/upload")
    public String upload(MultipartFile picFile) throws IOException
    {
        String filename = picFile.getOriginalFilename();/*过得后缀名*/
        String suffx=filename.substring(filename.lastIndexOf("."));
        filename = UUID.randomUUID()+suffx;
        File dirFile = new File(dirPath);
        if(!dirFile.exists())
        {
            dirFile.mkdir();
        }
        String filepath = dirPath+"/"+filename;
        picFile.transferTo(new File(filepath));
        return filename;
    }
    @RequestMapping("/remove")
            public  void remove(String name)
    {
        String filepath=dirPath+"/"+name;
        new File(filepath).delete();
    }
}
