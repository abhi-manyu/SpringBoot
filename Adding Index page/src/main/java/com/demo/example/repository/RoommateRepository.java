package com.demo.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.beans.Roomate;

@Repository
public interface RoommateRepository extends CrudRepository<Roomate,Integer> {

}
