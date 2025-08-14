package java_Pattern_Questions;

public class Num_pattern_29 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=n-1;
        int Zeroes=-1;

        while (row<=n) {
            //space
            int i=1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            System.out.print(row+" ");

            //zeroes
            int j=1;
            while (j<=Zeroes) {
                System.out.print("0 ");
                j++;
            }
            if (row!=1) {System.out.print(row+" ");}
            
            //next row prep
            System.out.println();
            row++;
            space--;
            Zeroes+=2;
        }
    }
    
}
