package br.com.bookshelf.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bookshelf.datasource.model.Book;
import br.com.bookshelf.exception.BookNotFoundException;
import br.com.bookshelf.repository.BookRepository;

@Service
public class SearchBookByIdServiceImpl {

  @Autowired
  private BookRepository bookRepository;

  public Book buscarPorId(Long id) throws BookNotFoundException {
    Optional<Book> optionalBook = getOptional(id);
    Book book = null;
    if (!optionalBook.isPresent()) {
      throw new BookNotFoundException("Livro não encontrado atraves do ID: " + id);
    } else {
      book = optionalBook.get();
    }
    return book;
  }

  private Optional<Book> getOptional(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    return optionalBook;
  }

  public void deleteById(Long id) throws BookNotFoundException {
    Optional<Book> optionalBook = getOptional(id);
    if (!optionalBook.isPresent()) {
      throw new BookNotFoundException("Livro nao encontrado atraves do ID: " + id);
    } else {
      bookRepository.delete(optionalBook.get());
    }

  }

}
