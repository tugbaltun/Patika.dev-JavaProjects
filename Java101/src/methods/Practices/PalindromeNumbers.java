package methods.Practices;

import java.util.Scanner;

public class PalindromeNumbers {
    public static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int number = input.nextInt();
        System.out.println(isPalindrome(number)
                ? number + " palindrome sayidir."
                : number + " palindrome sayi degildir.");
    }
}
