import java.util.Scanner;

public class MaxDifference1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        int diff=0;
        for (int j : arr) {
            for (int k : arr) {
                if (j - k > diff) {
                    diff = j - k;
                }
            }
        }
        System.out.println(diff);
    }
}
