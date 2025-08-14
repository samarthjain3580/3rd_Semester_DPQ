package Java_basic;

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		System.out.println(Armstrong_number(n));
	}
	
	public static boolean Armstrong_number(int n) {
		int cod = countofdigit(n);
		int sum=0;
		int p = n;
		while (n>0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, cod));
			n=n/10;
		}
		if (sum==p) {
			return true;
		}
		else  {
			return false;
		}
	}
	
	public static int countofdigit(int n) {
		int count=0;
		while (n>0) {
			n=n/10;
			count++;
        }
        return count;
    }
    
}
