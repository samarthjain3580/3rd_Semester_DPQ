package java_Pattern_Questions;

public class pattern_13 {
    public static void main(String[] args) {
    int n=5;
    int row=1;
    int star=1;
    
    while (row<=2*n-1) {
        int i=1;
        //star
        while (i<=star) {
            System.out.print("* ");
            i++;
        }

        //Mirror 
        if (row<n) {
            star++;
        }
        else {
            star--;
        }

        //next row prep
        System.out.println();
        row++;

    }
    }
    
}
