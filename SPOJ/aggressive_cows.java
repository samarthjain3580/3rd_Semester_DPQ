package Practice_Java.SPOJ;

import java.util.*;
public class aggressive_cows {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int no_of_cow = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(largest_minimum(arr, no_of_cow));    
        }
        sc.close();
    }

    public static int largest_minimum(int[] arr, int no_of_cow) {
        int low = 1;  // Start with the minimum distance as 1 instead of 0
        int high = arr[arr.length-1] - arr[0];
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isitpossible(arr, no_of_cow, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    
    public static boolean isitpossible(int[] arr, int no_of_cow, int mid) {
        int pos = arr[0];
        int cow = 1;
        for(int i = 1; i < arr.length; i++) { // Start from i = 1
            if (arr[i] - pos >= mid) {
                cow++;
                pos = arr[i];
            }
            if (cow == no_of_cow) {
                return true;
            }
        } 
        return false;
    }
}
