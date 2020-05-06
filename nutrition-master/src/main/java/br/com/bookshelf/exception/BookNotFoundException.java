package br.com.bookshelf.exception;

public class BookNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8205059110531490240L;


  public BookNotFoundException() {
    super();
  }

  public BookNotFoundException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public BookNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public BookNotFoundException(String message) {
    super(message);
  }

  public BookNotFoundException(Throwable cause) {
    super(cause);
  }

}
