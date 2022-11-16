package loops.Practices;

import java.util.Scanner;

public class MakingDiamondWithTheStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int number = scan.nextInt();

        //First triangle
        for (int i = 0; i <= number ; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Reverse triangle
        for (int i = number-1; i >=0 ; i--) {
            for (int j = number-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
