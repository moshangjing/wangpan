package com.wangpan.netdisk.controller;

import com.wangpan.netdisk.model.UserInfo;
import com.wangpan.netdisk.service.UserInfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@CrossOrigin()
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoSer userInfoSer;

//    登录
    @RequestMapping(value="/login",method = {RequestMethod.POST})
    public Map login(
            @RequestParam(value="userName",required = false) String userName,
            @RequestParam(value="password",required = false) String password){
        return userInfoSer.login(userName,password);
    }

//    注册
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public Map register(
            @RequestParam(value = "userName",required = false) String userName,
            @RequestParam(value = "password",required = false) String password,
            @RequestParam(value = "userIcon",required = false) MultipartFile userIcon
            ){
        return userInfoSer.register(userName,password,userIcon);
    }

}
