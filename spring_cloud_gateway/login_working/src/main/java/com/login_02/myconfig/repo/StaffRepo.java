package com.login_02.myconfig.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login_02.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
