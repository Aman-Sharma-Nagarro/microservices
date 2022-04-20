package com.nagarroNAGP.admin.repository;

import com.nagarroNAGP.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByAdminId(Long adminId);
}
