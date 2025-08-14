package java_Pattern_Questions;

public class pattern_8 {
    public static void main(String[] args) {
    int n=5;
    int row=1;
    
    while (row<=n) {
        int i =1;
        while (i<=n) {
            if (row==i || row+i == 6) {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
            i++;
        }
        System.out.println();
        row++;
    }

    }
    
}
