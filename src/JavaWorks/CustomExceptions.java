package JavaWorks;
// To create custom exceptions you have to extend an existing  exception class or object

public class CustomExceptions extends RuntimeException{

    public CustomExceptions (String message){
        super(message);
    }
}
