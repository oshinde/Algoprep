import java.util.Scanner;

public class Found_Arrays2_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i < a.length; i++){
            a[i]= sc.nextInt();
        }
        int to = sc.nextInt();
        int till = sc.nextInt();
        while(to< till){
            int temp = a[to];
            a[to]= a[till];
            a[till] = temp;
            to++;
            till--;
        }

        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
