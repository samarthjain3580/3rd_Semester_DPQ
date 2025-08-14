package java_Pattern_Questions;

public class Num_pattern_28 {
    public static void main(String[] args) {

        // using chat-GPT
        int n = 5;
        int i = 1;
        
        // Outer loop for each row
        while (i <= n) {
            int j = 1;
            
            // Print spaces for alignment
            int spaces = n - i;
            while (spaces > 0) {
                System.out.print("  "); // Two spaces
                spaces--;
            }
            
            // Print increasing part of the pattern
            int num = i;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            
            // Print decreasing part of the pattern
            num -= 2;
            j = 1;
            while (j < i) {
                System.out.print(num + " ");
                num--;
                j++;
            }
            
            // Move to the next line
            System.out.println();
            i++;
        }
            }
        }
    

