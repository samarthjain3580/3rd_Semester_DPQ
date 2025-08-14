package java_Pattern_Questions;

public class pattern_20 {
    public static void main(String[] args) {
    int n=7;
    int row=1;
    int space=(n-1)/2;
    int mid_space=-1;

    while (row<=n) {
        //space
        int i=1;
        while (i<=space){
            System.out.print("   ");
            i++;
        }
        System.out.print("*  ");
        //middle spacing
        if (row>1 && row<n) {
            int j=1;
            while (j<=mid_space) {
                System.out.print("   ");
                j++; 
            }
        System.out.print("*  ");
        }
        //mirror
        if (row<(n+1)/2) {
            space--;
            mid_space+=2;
        }
        else {
            space++;
            mid_space-=2;
        }

        //next row prep
        System.out.println();
        row++;
    }


    }
    
}
