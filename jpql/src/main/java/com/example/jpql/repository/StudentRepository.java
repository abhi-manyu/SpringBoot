package com.example.jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpql.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{
     public List<Student> findByAddress(String address);
}
