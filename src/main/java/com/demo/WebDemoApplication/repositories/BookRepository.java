package com.demo.WebDemoApplication.repositories;

import com.demo.WebDemoApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
