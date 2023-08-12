public class PerfectSquare {
    public static void main(String[] args) {
        int a = 25;
        int square = 1;
        for(int i = 1; i*i <= a ;i ++){
            square = i * i;
        }
        if(square == a){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
