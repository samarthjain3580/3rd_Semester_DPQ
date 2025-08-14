package Java_tutorial;

public class exceptions {
    public static void main(String[] args) {
        //TRY-CATCH IN EXCEPTIONAL HANDLING
        int[] marks = {97,95,93};
        try{
        System.out.println(marks[5]);
        }
        catch (Exception exception) {
            //do something after catching
        }
        System.out.println("The Name is samarth");
    }   
    
}
