package java_Pattern_Questions;

public class Num_pattern_31 {
    public static void main(String[] args) {
    int n=5;
	int row=1;
	int star=n;

	while (row<=n) {
		// star
		int i=1;
        int val=n;
		while (i<=star) {
            if (val==row) {System.out.print("* ");}
            else {System.out.print(val+" ");}
			i++;
            val--;
		}
		//next row prep
		System.out.println();
		row++;
	}
    }
    
}
