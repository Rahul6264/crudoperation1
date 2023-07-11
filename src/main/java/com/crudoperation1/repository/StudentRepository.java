package com.crudoperation1.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudoperation1.entity.student;

public interface StudentRepository extends CrudRepository<student, Long> {

}
