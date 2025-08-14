package Java_tutorial;
import java.util.Scanner;
public class pen_pencil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pen=10 , notebook = 40
        
        System.out.print("Enter price: ");
        int cash = sc.nextInt();
        if (cash <10) {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
        else if (cash>10 && cash<50) {
            System.out.println("can get any 1 thing");
        }
        else {
            System.out.println("can get both");
        }
        sc.close();

        
    }
    
}
