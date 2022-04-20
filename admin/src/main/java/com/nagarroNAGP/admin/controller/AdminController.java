package com.nagarroNAGP.admin.controller;

import com.nagarroNAGP.admin.entity.Admin;
import com.nagarroNAGP.admin.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    @RequestMapping("/")
    public Admin saveAdmin(@RequestBody Admin admin){
        log.info("Inside saveAdmin method of AdminController");
        return adminService.saveAdmin(admin);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Admin findByAdminId(@PathVariable("id") Long adminId){
        return adminService.findByAdminId(adminId);
    }

}
