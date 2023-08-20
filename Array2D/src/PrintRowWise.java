import java.util.Scanner;

public class PrintRowWise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nrow= sc.nextInt();
        int ncol= sc.nextInt();

        int[][] arr = new int[nrow][ncol];
        for(int i =0; i < nrow; i++){
            for(int j =0; j < ncol; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i < nrow; i++){
            if(i == 0 | i %2 ==0 ){
                for(int j =0; j < ncol; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j = ncol-1; j >= 0; j --){
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}
