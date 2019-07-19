package org.courseApi.example.repository;

import org.courseApi.example.course.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course,Integer> {

}
