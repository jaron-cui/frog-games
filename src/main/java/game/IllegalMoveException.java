package game;

public class IllegalMoveException extends IllegalArgumentException {
  public IllegalMoveException(String message) {
    super(message);
  }
}
