package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer>
{

}
