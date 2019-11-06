package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Liu Zicheng at 2019/11/6 10:53
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        System.out.println("测试提交代码");
        return "index";
    }
}
