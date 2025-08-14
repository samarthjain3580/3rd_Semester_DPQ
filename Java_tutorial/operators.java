package Java_tutorial;

public class operators {
    public static void main(String[] args) {
        //operators
        int a=1;
        int b=3;

        int sum = a+b;
        System.out.println(sum);

        int diff = a-b;
        System.out.println(diff);

        int prod = a*b;
        System.out.println(prod);

        int div = a/b;
        System.out.println(div);

        int mod = a%b;
        System.out.println(mod);

        double divi =  (double) a/b;  //type casting int to double
        System.out.println(divi);

        int num = 1;
        // num++;
        System.out.println(num++);      //unary operations
        System.out.println(num);
        System.out.println(++num);
        System.out.println(--num);


    }
    
}
