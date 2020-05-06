package br.com.bookshelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bookshelf.datasource.model.Book;
import br.com.bookshelf.repository.BookRepository;

@Service
public class SearchBookServiceImpl {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> searchAllBooks() {
    List<Book> listBook = bookRepository.findAll();
    return listBook;
  }
}
