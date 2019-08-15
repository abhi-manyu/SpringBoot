package com.example.jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jpql.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{
     //public List<Student> findByAddress(String address);
	
	@Query(value="from Student where address=?1 order by age desc")
	public List<Student> find_By_Address_in_SortedManner_By_Name(String address);
	
	@Query(value="from Student order by age desc")
	public List<Student> getAllStudents_by_Sortingmanner();
}
