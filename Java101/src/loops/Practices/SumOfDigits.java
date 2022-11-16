package loops.Practices;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, digit, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        number = input.nextInt();

        while (number != 0) {

            digit = number % 10;
            result += digit;
            number = number / 10;
        }
        System.out.println("Sonuc : " + result);
    }
}
