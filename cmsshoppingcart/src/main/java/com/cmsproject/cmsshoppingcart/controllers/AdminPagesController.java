package com.cmsproject.cmsshoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    @GetMapping
    public String idnex(){
        return "admin/pages/index";
    }
}
