package loops.FindThePerfectNumber;

import java.util.Scanner;

public class Main {

    //Checks if number is perfect or not
    public static int checkNumber(int number){
        int sum = 0;
        for (int i = 1; i<number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //User enters number
        System.out.print("Bir sayi giriniz:");
        int number = input.nextInt();

        //Prints to console whether given number is perfect number
        System.out.println((checkNumber(number)==number)
                ?number+" mukemmel sayidir."
                :number+" mukemmel sayi degildir.");
    }
}
