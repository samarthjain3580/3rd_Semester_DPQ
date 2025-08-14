package java_Pattern_Questions;

public class Num_pattern_33 {
    public static void main(String[] args) {
    int n = 10;
    int row = 1;
    int star = 1;
    int space = n-1;
    int val=n;
    
    while (row<=n) {
        //space
        int i=1;
        while (i<=space) {
            System.out.print("  ");
            i++;
        }
        // star
        if (row>1) {
            int j=1;
            while (j<=star) {
                System.out.print(val+" ");
                j++;
            }
            System.out.print("0 ");

            //star
            j=1;
            while (j<=star) {
                System.out.print(val+" ");
                j++;
            }
        }
        else {System.out.println("0 ");}

        // next row prep
        System.out.println();;
        row++;
        space--;
        star++;
        val--;
        
    }
    }
}
