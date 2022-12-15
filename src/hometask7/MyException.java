package hometask7;

public abstract class MyException extends Exception{
    String message;
    public MyException(String exceptionMessage) {
        this.message = exceptionMessage;
    }
    public String getMessage() {
        return message;
    }
}
