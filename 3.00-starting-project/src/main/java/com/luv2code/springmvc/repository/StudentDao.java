package com.luv2code.springmvc.repository;

import com.luv2code.springmvc.models.CollegeStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentDao extends CrudRepository<CollegeStudent, Integer> { // <Entity, Primary Key>

    public CollegeStudent findByEmailAddress(String emailAddress);
}
