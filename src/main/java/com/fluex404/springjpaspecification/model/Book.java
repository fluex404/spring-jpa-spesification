package com.fluex404.springjpaspecification.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    private String name;
    @Column(name = "created_date")
    private Date createdDate;

    public Book() {
    }

    public Book(Student student, String name, Date createdDate) {
        this.student = student;
        this.name = name;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", student_id=" + student.getId() +
                ", name='" + name + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
