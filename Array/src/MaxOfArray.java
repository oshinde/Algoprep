import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for(int i =0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
