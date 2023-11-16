package com.example.tp40.Service;

import com.example.tp40.Entity.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}

