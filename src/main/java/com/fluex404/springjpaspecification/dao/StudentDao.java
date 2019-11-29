package com.fluex404.springjpaspecification.dao;

import com.fluex404.springjpaspecification.model.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {

}
