package br.com.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bookshelf.datasource.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
