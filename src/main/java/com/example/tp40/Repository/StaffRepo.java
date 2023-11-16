package com.example.tp40.Repository;
import com.example.tp40.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface StaffRepo extends JpaRepository<Staff, Integer> {
    }
