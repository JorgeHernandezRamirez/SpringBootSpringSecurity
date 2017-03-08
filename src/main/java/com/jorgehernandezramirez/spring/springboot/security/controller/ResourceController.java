package com.jorgehernandezramirez.spring.springboot.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("/public/resource")
    public String getPublicResource() {
        return "Public resource";
    }

    @RequestMapping("/private/resource")
    public String getPrivateResouce() {
        return "Private resource";
    }

    @RequestMapping("/private/admin/resource")
    public String getAdminResouce() {
        return "Admin resource";
    }
}
