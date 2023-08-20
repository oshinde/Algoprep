import java.util.Scanner;

import static java.lang.Math.abs;

public class MaxDifference2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        int diff=0;
        for (int i =0;  i < arr.length; i++) {
            for (int j =0;  j < arr.length; j++) {
                int diff1 =  (abs(arr[i] - arr[j]) + i - j);
                if (diff1 > diff) {
                    diff = diff1;
                }
            }
        }
        System.out.println(diff);
    }
}
