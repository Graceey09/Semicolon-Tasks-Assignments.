package JavaWorks;

public class AsterisksTriangle {

    public static void main(String[] args) {
        int rows = 5;

        for (int asterisk = 1; asterisk <= rows; ++asterisk) {
            for (int column = 1; column <= asterisk; ++column) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
