import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int max = 0;
        for(int i =0 ; i <arr.length; i++){
            arr[i] = sc.nextInt();
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
