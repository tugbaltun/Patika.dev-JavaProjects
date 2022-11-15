package loops.Practices;

import java.util.Scanner;

public class Combination {

    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();
        System.out.print("r: ");
        int r = input.nextInt();

        int result = factorial(n) / (factorial(n-r) * factorial(r));
        System.out.println("Sonuc: " + result);
    }
}
