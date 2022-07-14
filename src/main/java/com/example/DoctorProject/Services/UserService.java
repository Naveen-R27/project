package com.example.DoctorProject.Services;

import com.example.DoctorProject.Enitiy.Role;
import com.example.DoctorProject.Enitiy.User;
import com.example.DoctorProject.dao.RoleDao;
import com.example.DoctorProject.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private RoleDao roleDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRolesSet = new HashSet<>();
        adminRolesSet.add(adminRole);
        adminUser.setRole(adminRolesSet);
        userDao.save(adminUser);

        User user = new User();
        user.setUserFirstName("Reetisha");
        user.setUserLastName("Das");
        user.setUserName("Reetisha123");
        user.setUserPassword("reetisha@pass");
        Set<Role> userRolesSet = new HashSet<>();
        userRolesSet.add(userRole);
        user.setRole(userRolesSet);
        userDao.save(user);
    }
}
