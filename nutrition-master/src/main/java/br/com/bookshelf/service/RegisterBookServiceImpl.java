package br.com.bookshelf.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bookshelf.datasource.model.Book;
import br.com.bookshelf.exception.BookResourceException;
import br.com.bookshelf.repository.BookRepository;
import br.com.bookshelf.resource.model.BookResource;

@Service
public class RegisterBookServiceImpl {

  private static final Logger LOG = Logger.getLogger(RegisterBookServiceImpl.class);

  @Autowired
  private BookRepository bookRepository;

  @Autowired
  private BookConversor service;

  public void register(BookResource bookResource) {

    try {
      Book book = service.conversor(bookResource);
      bookRepository.saveAndFlush(book);
    } catch (BookResourceException e) {
      LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);
    }
  }

}
