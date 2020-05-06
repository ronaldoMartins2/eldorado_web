package br.com.bookshelf.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookResource implements Serializable {

private static final long serialVersionUID = 3949597050682304246L;

@JsonProperty("title")
  private String title;

  @JsonProperty("yearPublication")
  private String yearPublication;

  @JsonProperty("description")
  private String description;
  
  @JsonProperty("author")
  private String author;
  
  @JsonProperty("bookCode")
  private String bookCode;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYearPublication() {
	  return yearPublication;
  }

  public void setYearPublication(String yearPublication) {
	  this.yearPublication = yearPublication;
  }
  
  public String getDescription() {
	  return description;
  }

  public void setDescription(String description) {
	  this.description = description;
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

  @Override
  public String toString() {
    return "BookResource [title=" + title 
    		+ ", yearPublication=" + yearPublication 
    		+ ", description=" + description
    		+ ", author=" + author
    		+ ", bookCode=" + bookCode + "]";
  }

}
