package br.com.bookshelf.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.bookshelf.datasource.model.Book;
import br.com.bookshelf.exception.BookResourceException;
import br.com.bookshelf.resource.model.BookResource;

@Component
public class BookConversor {

  public Book conversor(BookResource bookResource)
      throws BookResourceException {

    try {
      Book book = new Book();

      LocalDate yearPublication = checkYearPublication(bookResource.getYearPublication());
      book.setYearPublication(yearPublication);
      book.setBookCode(bookResource.getBookCode());
      book.setTitle(bookResource.getTitle());
      book.setDescription(bookResource.getDescription());
      book.setAuthor(bookResource.getAuthor());
      
      return book;

    } catch (Exception e) {
      throw new BookResourceException(
          "Falha ao converter o resource para entidade, resouce: " + bookResource);
    }

  }

  private LocalDate checkYearPublication(String yearPublication) {
    return LocalDate.parse(yearPublication);
  }

}
