package java_Pattern_Questions;

public class pattern_3 {
    public static void main(String[] args) {
    int n=5;
    int row=1;
    int star=n;
    
    while (row<=n) {
        int i=1;
        //star
        while (i<=star) {
            System.out.print("* ");
            i++;
        }
        //next row prep
        System.out.println();
        row++;
        star--;
    }
    
    // for (row=1; row<=n; row++) {
    //     for (int i=1; i<=star; i++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     star--;
    // }
    
    }
    
}
