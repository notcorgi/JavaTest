package day01;

public class DiGui {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n-1)+n ;
        }
    }

}
