package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public Test test() {
        Test test = new Test();
        test.setId(1212);
        test.setName("林嘉瑜");
        return test;
    }
}
