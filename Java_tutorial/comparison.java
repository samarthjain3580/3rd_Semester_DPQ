package Java_tutorial;

public class comparison {
    public static void main(String[] args) {
        //comparison operators
        //a == b;
        //a != b;
        //a < b;
        //a > b;
        //a <= b;
        //a >= b;

        //logical operators
        //&& and: if both condition true
        int a = 60;
        int b = 50;
        if (a<50 && b<50) {
            System.out.println("both less than 50");
        }
        else {
            System.out.println("not less than 50");
        }

        //|| or: if any of the condition is true.
        int c=28;
        int d=77;
        if (c<50 || d<50) {
            System.out.println("both less than 50");
        }
        else {
            System.out.println("not less than 50");
        } 
        // !(not operator): inverse the condition
        boolean is_adult = true;
        if (is_adult != true) {
            System.out.println("not adult");
        } 
        else {
            System.out.println("is adult");
        }
        
    }
}
