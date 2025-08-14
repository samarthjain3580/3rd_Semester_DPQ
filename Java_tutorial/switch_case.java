package Java_tutorial;

public class switch_case {
    public static void main(String[] args) {
        //conditional Statements - SWITCH

        int day = 5;    //1-monday ; 2-Tuesday

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
        
            default:
                System.out.println("wed - sun");
        }

    }
    
}
