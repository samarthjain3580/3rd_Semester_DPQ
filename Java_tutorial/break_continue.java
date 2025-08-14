package Java_tutorial;

public class break_continue {
    public static void main(String[] args) {
        //BREAK & CONTINUE
        int j=0;
        while (j<10) {
            System.out.println(j);
            j++;
            if (j==3) {
                j++;
                continue;
            }
            if (j>5) {
                break;
            }
        }
        
    }   

    
}
