package com.example.DoctorProject.dao;

import com.example.DoctorProject.Enitiy.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
