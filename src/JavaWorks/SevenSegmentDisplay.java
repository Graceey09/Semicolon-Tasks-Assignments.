package JavaWorks;

import java.util.Arrays;

public class SevenSegmentDisplay {
    public static void light(String segment) {
        String[][] fuse = {{"#", "#", "#", "#"}, {"#", " ", " ", "#"}, {"#", "#", "#", "#"},{"#", " ", " ", "#"},{"#", "#", "#", "#"}};
        for (int light = 0; light < fuse.length; light++){
            for (int Ina = 0; Ina < fuse[light].length; Ina++ ){
                if(segment.charAt(7) == '0'){
                }
                if(segment.charAt(0) == '0'){
                    fuse[0][1] = " ";
                    fuse[0][2] = " ";
                }
                if(segment.charAt(1) == '0'){
                    fuse[1][3] = " ";
                }
                if(segment.charAt(2) == '0'){
                    fuse[3][3] = " ";
                }
                if(segment.charAt(3) == '0'){
                    fuse[4][0] = " ";
                    fuse[4][1] = " ";
                    fuse[4][2] = " ";
                }
                if(segment.charAt(4) == '0'){
                    fuse[3][0] = " ";
                }
                if(segment.charAt(5) == '0'){
                    fuse[1][0] = " ";
                }
                if(segment.charAt(6) == '0'){
                    fuse[2][0] = " ";
                    fuse[2][1] = " ";
                }
                System.out.print(fuse[light][Ina]+" ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      light("11111111");
    }
}
