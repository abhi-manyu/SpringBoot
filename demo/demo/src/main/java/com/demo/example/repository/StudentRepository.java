package com.demo.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.beans.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{
   
}
