package Java_Functions;
import java.util.*;
public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		int pos=1;
		int sum=0;

		while (n>0) {
			int rem =n%10;
			sum = (int) (sum+pos*Math.pow(10, rem-1));
			pos++;
			n=n/10;
		}
		System.out.println(sum);
    }
    
}
