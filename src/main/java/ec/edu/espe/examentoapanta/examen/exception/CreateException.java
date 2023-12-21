package ec.edu.espe.examentoapanta.examen.exception;

public class CreateException extends RuntimeException {
  public CreateException(String message) {
    super(message);
  }

  public CreateException(String message, Exception cause) {
    super(message, cause);
  }
}
