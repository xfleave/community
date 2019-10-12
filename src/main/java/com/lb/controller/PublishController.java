package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 李彪(libiao)
 * 2019/10/12   11:37
 */
@Controller
public class PublishController {
    @RequestMapping("/publish")
    public String publish(){
        return "publish";
    }
}
