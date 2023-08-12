import java.util.Scanner;

public class TwoSumBruteForce {
    public static boolean twosum( int arr[], int val){
        for(int i =0; i<= arr.length-2; i++){
            for (int j = i+1; j<= arr.length-1; j++){
                if(arr[i]+arr[j] == val){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();

        System.out.println(twosum(arr,val));
    }
}
