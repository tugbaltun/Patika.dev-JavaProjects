package loops.FibonacciSeries;

import java.util.Scanner;

public class Main {

    public static void fibonacci(int number){

        int n1=0, n2=1, n3;
        System.out.print(number+" Elemanli Fibonacci Serisi :");
        //First print 0 and 1 to console
        System.out.print(n1 +" "+ n2+ " ");

        //Find the fibonacci numbers by adding n1 and n2 respectively ad print them
        for(int i=2; i<=number; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //User enters number of elements
        System.out.print("Serinin Eleman Sayisi: ");
        int number = input.nextInt();
        //Calls the fibonacci method and prints the fibonacci series
        fibonacci(number);
    }
}
