import java.util.Scanner;

public class RotateArray {

    public static void reverse(int arr[], int s, int e){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp ++;
            ep --;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i =0; i < a.length; i++){
            a[i]=sc.nextInt();
        }
        int val = sc.nextInt() % a.length;

        reverse(a, 0, a.length - 1);
        reverse(a, 0, val-1);
        reverse(a, val, a.length-1);

        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
