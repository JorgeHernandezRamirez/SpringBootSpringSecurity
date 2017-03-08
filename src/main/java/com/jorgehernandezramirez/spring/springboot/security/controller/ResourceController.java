package com.jorgehernandezramirez.spring.springboot.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
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

    @RequestMapping("/private/admin/resource1")
    public String getAdminResouce1() {
        return "Admin resource1";
    }

    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    @RequestMapping("/private/admin/resource2")
    public String getAdminResouce2() {
        return "Admin resource2";
    }

}
