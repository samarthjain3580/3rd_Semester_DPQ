package java_Pattern_Questions;

public class Num_pattern_32 {
    public static void main(String[] args) {
    int n=5;
    int row=1;
    int star=1;
    int val=row;
    
    while (row<=2*n-1) {
        int i=1;
        //star
        while (i<=star) {
            if (i%2==0) {System.out.print("* ");}
            else {System.out.print(val+" ");}    
            i++;
        }

        //Mirror 
        if (row<n) {
            star+=2;
            val++;
        }
        else {
            star-=2;
            val--;
        }

        //next row prep
        System.out.println();
        row++;

    }
    }
    
}
