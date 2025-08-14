package java_Pattern_Questions;

public class pattern_7 {
    public static void main(String[] args) {
    int n = 5;
    int row = 1;
    int star = n;
    
    while (row<=n) {
        // star
        if (row==1 || row==n) {
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
        } 
        else {
            System.out.print("* ");
            for (int i=1;i<=n-2;i++) {
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        // next row prep
        System.out.println();
        row++;
        
    }
    }
    
}
