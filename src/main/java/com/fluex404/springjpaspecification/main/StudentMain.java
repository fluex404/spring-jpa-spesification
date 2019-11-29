package com.fluex404.springjpaspecification.main;

import com.fluex404.springjpaspecification.dao.BookDao;
import com.fluex404.springjpaspecification.dao.StudentDao;
import com.fluex404.springjpaspecification.model.Book;
import com.fluex404.springjpaspecification.model.Student;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ListJoin;

@Configuration
public class StudentMain implements CommandLineRunner {

    private StudentDao studentDao;
    private BookDao bookDao;

    @Autowired
    public StudentMain(StudentDao studentDao, BookDao bookDao) {
        this.studentDao = studentDao;
        this.bookDao = bookDao;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===Find All===");
        studentDao.findAll().forEach(System.out::println);

        System.out.println("===STUDENT===");
        studentDao.findAll(Specification
                .where(customerHasAge(21))
                .and(jobContains("a"))
                ).forEach(System.out::println);

        System.out.println("===Find All===");
        bookDao.findAll().forEach(System.out::println);

    }

    // Student
    public static Specification<Student> customerHasAge(Integer age){
        return (root, query, builder) -> builder.equal(root.get("age"), age);
    }
    public static Specification<Student> jobContains(String job) {
        return (root, query, builder) -> builder.like(root.get("job"), "%"+job+"%");
    }


    //

}
