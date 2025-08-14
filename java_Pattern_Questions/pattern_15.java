package java_Pattern_Questions;

public class pattern_15 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=0;

        for (row=1; row<=2*n-1; row++) {
            for (int i=1; i<=space; i++) {           //space
                System.out.print("  ");
            }

            for (int j=1; j<=star; j++) {            //star
                System.out.print("* ");
            }
            if (row<n) {                             //Mirror
                star--;
                space+=2;
            }
            else {
                star++;
                space-=2;
            }
            System.out.println();                    //Next row Preparation
        }
    }
    
}
