package methods.Practices;

import java.util.Scanner;

public class FibonacciSeriesWithRecursive {

    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return  1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();
        System.out.println(fibonacci(number));
    }
}
