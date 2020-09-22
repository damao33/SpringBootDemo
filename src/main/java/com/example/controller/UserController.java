package com.example.controller;

import com.example.generate.Userlist;
import com.example.generate.UserlistDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    /**
     * 接受来自浏览器的findAllUser请求
     * @return
     */
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/findAllUser")
    public List<Userlist> findAllUser()
    {
        return userService.selectAll();
    }
}
