package loops.Practices;

import java.util.Scanner;

public class FindTheSumOfOddNumbers {
    public static void main(String[] args) {
        int num, sum = 0;
        System.out.println("Lütfen sayilari girin (Tek sayi girilene kadar deva eder):");
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num % 4 == 0) {
                sum = sum + num;
            }
        } while (num % 2 == 0);

        System.out.println("Dort sayisinin katlarinin toplami: " + sum);
    }
}
