package com.enbo.web.controller;
/**
 * @author enbo.xie
 * @date 2020-01-31 10:14:54
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //跳转页面设置
     @RequestMapping("/{page}")
     public String showPage(@PathVariable String page){
         return page;
     }

}
