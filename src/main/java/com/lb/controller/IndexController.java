package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李彪(libiao)
 * 2019/10/11   14:59
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String Index() {
        return "index";
    }
}
