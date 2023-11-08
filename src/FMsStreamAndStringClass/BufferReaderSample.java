//package FMsStreamAndStringClass;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import static java.lang.System.in;
//
//public class BufferReaderSample {
//    public static void main(String[] args){
//        try(var inputStreamReader = new InputStreamReader(in));
//                BufferedReader reader = new BufferedReader(inputStreamReader)){
//            System.out.println("Enter anything: ");
//            String data = reader.readLine();
//            System.out.println("You've entered: " + data);
//        }catch (IOException exception){
//
//        }
//    }
//}
