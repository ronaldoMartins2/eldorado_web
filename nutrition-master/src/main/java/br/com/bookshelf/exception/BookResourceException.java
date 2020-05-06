package br.com.bookshelf.exception;

public class BookResourceException extends Exception {


  /**
	 * 
	 */
	private static final long serialVersionUID = -1902175983217399934L;

public BookResourceException() {
    super();
  }

  public BookResourceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public BookResourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public BookResourceException(String message) {
    super(message);
  }

  public BookResourceException(Throwable cause) {
    super(cause);
  }

}
