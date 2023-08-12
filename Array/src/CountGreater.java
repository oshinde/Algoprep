import java.util.Scanner;

public class CountGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max=0;
        int count=0;
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(i == 0){
                max = arr[i];
            } else if(max < arr[i]) {
                max = arr[i];
            }
        }
        for( int a : arr){
            if(a==max){
                count++;
            }
        }
        System.out.print(arr.length-count);
    }
}
