package loops.Practices;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        double sum=0;

        System.out.println("Lutfen pozitif bir sayi giriniz: ");
        number = scan.nextInt();

        if(number<=0) {
            System.out.println("Lutfen pozitif bir sayi giriniz: ");
            number = scan.nextInt();
        }

        for (double i = 1; i <= number; i++) {
            sum += 1 / i;
        }

        System.out.println(sum);
    }
}
