package methods.PrimeNumbersWithRecursiveMethod;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number, int i){
        //if i equals to number then return true. Number is prime
        if(number == i)
            return true;
        //if number can divide to i then return false. Number is not prime.
        else if(number % i == 0)
            return false;
        //Increase the i till i will be equals to number
        return isPrime(number, i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User enters number
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();
        //Check if number is prime with isPrime() method and print the result to console
        System.out.println(
                isPrime(number, 2)
                ?number+" sayisi ASALDİR !"
                :number+" sayisi ASAL degildir !"
        );
    }
}
