package java_Pattern_Questions;

public class Num_pattern_30 {
    public static void main(String[] args) {
    int n=5;
	int row=1;
	int star=n;

	while (row<=n) {
		// star
		int i=1;
        int val=n;
		while (i<=star) {
			System.out.print(val+" ");
			i++;
            val--;
		}
		//next row prep
		System.out.println();
		row++;
	}
    }
    
}
