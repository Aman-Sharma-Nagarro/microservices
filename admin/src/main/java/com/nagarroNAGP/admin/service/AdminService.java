package com.nagarroNAGP.admin.service;

import com.nagarroNAGP.admin.entity.Admin;
import com.nagarroNAGP.admin.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin saveAdmin(Admin admin) {
        log.info("Inside saveAdmin method of AdminService");
        return adminRepository.save(admin);
    }

    public Admin findByAdminId(Long adminId) {
        log.info("Inside findByAdminId method of AdminService");
        return adminRepository.findByAdminId(adminId);
    }
}
