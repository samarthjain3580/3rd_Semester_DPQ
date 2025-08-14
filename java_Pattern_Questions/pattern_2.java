package java_Pattern_Questions;

public class pattern_2 {
    public static void main(String[] args) {
    int n=5;
    int row=1;
    int star=1;
    
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
        star++;

    }

    }
    
}
