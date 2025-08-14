package Java_basic;

public class GCD {
    public static void main(String[] args) {
        int div = 36;
		int divd = 60;
		while (divd % div!= 0) {
			int rem = divd % div;
			divd = div;
			div = rem;
		}
		System.out.println(div);
    }
}
