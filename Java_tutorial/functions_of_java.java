package Java_tutorial;

public class functions_of_java {
    public static void printJava() {    //create a function
        System.out.println("Hello java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        //METHODS
        printJava();        //calling a function
        printName("jain");
        printSum(6, 10);

    }
    
}
