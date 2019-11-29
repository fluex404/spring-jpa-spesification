package com.fluex404.springjpaspecification.main;

import com.fluex404.springjpaspecification.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;

@Configuration
public class StudentMain implements CommandLineRunner {

    private StudentDao studentDao;

    @Autowired
    public StudentMain(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void run(String... args) throws Exception {
        studentDao.findAll().forEach(System.out::println);
    }

    public interface Spesification<T> {
        Predicate toPredicate(Root<T> root, CriteriaQuery<T> query, CriteriaBuilder cb);
    }
}
