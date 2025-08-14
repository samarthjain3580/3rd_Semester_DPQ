package java_Pattern_Questions;

public class Num_pattern_25 {
    public static void main(String[] args) {
    int n = 5;
    int row = 1;
    int star = 1;
    int space = n-1;
    int num=1;
    
    while (row<=n) {
        //space
        int i=1;
        while (i<=space) {
            System.out.print("   ");
            i++;
        }
        // star
        int j=1;
        while (j<=star) {
            System.out.print(num);
            if (num<10){System.out.print("  ");}
            else{System.out.print(" ");}
            num++;
            j++;
        }

        // next row prep
        System.out.println();
        row++;
        space--;
        star+=2;
        
    }
    }
    
}
