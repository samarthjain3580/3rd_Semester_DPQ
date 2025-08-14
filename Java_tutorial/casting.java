package Java_tutorial;

public class casting {
    public static void main(String[] args) {
        //casting: to convert one type to another 
        
        //implicit casting: when we work with same data type.
        int x=100;

        int n = x+200;
        System.out.println(n);

        //explicit casting: when different data types concatenate, we have to change its type using (<type>).

        int price = 20;
        int final_price = price+ (int) 18.69;         
        // change the double data type to int data type.

        System.out.println(final_price);

        //constants

        int age = 30; 
        age = 32;
        age = 33;
        System.out.println(age);        //simply we can change the value of age.

        final int ages = 30;
        System.out.println(ages);       //using final keyword we can fixed the value of variable. 
        

    }
    
}
