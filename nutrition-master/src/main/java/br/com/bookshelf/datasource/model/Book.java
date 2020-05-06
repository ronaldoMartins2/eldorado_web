package br.com.bookshelf.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {

	// private static final long serialVersionUID = 3862024889868951158L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "title")
  private String title;
  
  @Column(name = "yearPublication")
  private LocalDate yearPublication;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "author")
  private String author;

  @Column(name = "bookCode")
  private String bookCode;

  public Book() {}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
	return description;
  }
  
  public void setDescription(String description) {
	 this.description = description;
  }
  
  public LocalDate getYearPublication() {
    return yearPublication;
  }

  public void setYearPublication(LocalDate yearPublication) {
    this.yearPublication = yearPublication;
  }
  
  public String getAuthor() {
	  return author;
  }

  public void setAuthor(String author) {
	    this.author = author;
	  }

  public String getBookCode() {
    return bookCode;
  }

  public void setBookCode(String bookCode) {
    this.bookCode = bookCode;
  }


}
