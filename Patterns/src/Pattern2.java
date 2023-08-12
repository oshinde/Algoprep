public class Pattern2 {
    public static void main(String[] args) {
        int n = 7;
        int nsl = 1;
        int nst = 4;
        for(int i=1; i<=n; i++){
            for(int j =1; j <=nst; j++){
                System.out.print("*");
            }
            for(int k =1; k <=nsl; k++){
                System.out.print(" ");
            }
            for(int j =1; j <=nst; j++){
                System.out.print("*");
            }
            if(i <= n/2){
                nst--;
                nsl = nsl + 2;
            } else {
                nst++;
                nsl = nsl - 2;
            }
            System.out.println();

        }
    }
}
