public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int f = 0;
        int s = 1;
        int sum = 0;
        if(n == 1){
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                sum = f + s;
                f = s;
                s = sum;
            }
            System.out.println(sum);
        }
    }
}
