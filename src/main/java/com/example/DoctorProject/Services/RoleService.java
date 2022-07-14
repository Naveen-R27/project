package com.example.DoctorProject.Services;

import com.example.DoctorProject.Enitiy.Role;
import com.example.DoctorProject.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
      return roleDao.save(role);
    }
}
