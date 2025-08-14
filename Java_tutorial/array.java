package Java_tutorial;
import java.util.*;

public class array {
    public static void main(String[] args) {
        int chem = 97;
        int physics = 95;
        int eng = 90;

        //creating array
        int [] num = {chem, eng, physics};
        System.out.println(num[0]);

        int[] marks = {97,95,90};   // 1D array

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 95;
        // marks[2] = 90;
        System.out.println(marks[1]);

        //length
        System.out.println(marks.length);   //length is a property not a function.      
        
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);    //Arrays is a class.
        System.out.println(marks[0]);

        //2D array
        int[][] final_marks = {{97,98,96}, {95,95,98}};
        System.out.println(final_marks[0][2]);

    }   
    
}
