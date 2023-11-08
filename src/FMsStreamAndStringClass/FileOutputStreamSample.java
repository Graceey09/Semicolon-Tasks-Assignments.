package FMsStreamAndStringClass;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {
    public static void main(String[] args) {
        try(var fileOutputStream = new FileOutputStream("semicolon.txt")) {
            String word = "I am tired man";
            fileOutputStream.write(word.getBytes());
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
