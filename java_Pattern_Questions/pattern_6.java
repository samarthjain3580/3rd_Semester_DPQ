package java_Pattern_Questions;

public class pattern_6 {
    public static void main(String[] args) {
    int n = 5;
    int row = 1;
    int star = n;
    int space = 0;
    
    while (row<=n) {
        //space
        int i=1;
        while (i<=space) {
            System.out.print("  ");              // '\s': white spaces times 4 
            i++;
        }
        // star
        int j=1;
        while (j<=star) {
            System.out.print("* ");
            j++;
        }
        // next row prep
        System.out.println();
        row++;
        space+=2;
        star--;
        
    }
    }
    
}
