package FMsStreamAndStringClass;

import java.nio.file.Path;

public class Streams {
    public static void main(String[] args){
        String location = "C:\\Users\\semicolon\\Desktop";
        Path path = Path.of(location);
        System.out.println(path);
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileSystem());
    }
}
