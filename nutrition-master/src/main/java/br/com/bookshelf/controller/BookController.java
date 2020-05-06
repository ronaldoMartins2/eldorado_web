package br.com.bookshelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bookshelf.datasource.model.Book;
import br.com.bookshelf.exception.BookNotFoundException;
import br.com.bookshelf.resource.model.BookResource;
import br.com.bookshelf.resource.model.BookResource;
import br.com.bookshelf.service.SearchBookByIdServiceImpl;
import br.com.bookshelf.service.RegisterBookServiceImpl;
import br.com.bookshelf.service.SearchBookServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class BookController {

  @Autowired
  private SearchBookServiceImpl serviceSearch;
  
  @Autowired
  private SearchBookByIdServiceImpl serviceSearchById;
  
  @Autowired
  private RegisterBookServiceImpl serviceRegister;

  @GetMapping(path = "/books")
  public List<Book> searchBooks() {
    return serviceSearch.searchAllBooks();
  }
  
  @PostMapping(path = "/book/save")
  public void salvarNutricionista(@RequestBody BookResource book) {
    serviceRegister.register(book);
  }

  @DeleteMapping(path = "/book/delete/{id}")
  public void deleteNutricionista(@PathVariable(name = "id", required = true) Long id)
      throws BookNotFoundException {
    serviceSearchById.deleteById(id);
  }
}
