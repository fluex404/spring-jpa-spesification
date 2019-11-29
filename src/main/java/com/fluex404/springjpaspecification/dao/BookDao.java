package com.fluex404.springjpaspecification.dao;

import com.fluex404.springjpaspecification.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookDao extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
}
