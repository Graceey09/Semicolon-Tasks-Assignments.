package FMsStreamAndStringClass;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNio {
    public static void main(String[] args) {
        String location = "/home/grace/IdeaProjects/graceTDD/output.txt";
        Path path = Paths.get(location);
        System.out.println(path);

        try (OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write("Semicolon Africa".getBytes());
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
