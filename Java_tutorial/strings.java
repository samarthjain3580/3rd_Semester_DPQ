package Java_tutorial;

public class strings {
    public static void main(String[] args) {
    //strings
    //concatenate

    String name1 = "samarth";
    String name2 = "jain";
    String name = name1+" "+name2;
    System.out.println(name);

    //charat
    System.out.println(name.charAt(6));

    //length
    System.out.println(name.length());

    //replace
    String new_name = (name.replace('a','o'));
    System.out.println(new_name);

    //substrings
    String name3 = "Ram and Shyam";
    System.out.println(name3.substring(3,7));

    }
    
}
