package com.fluex404.springjpaspecification.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "student")
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    @Column(unique = true)
    private String email;
    @Column(name="created_date")
    private Date createdDate;
    private String job;
    @Lob
    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String email, Date createdDate) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", job='" + job + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
