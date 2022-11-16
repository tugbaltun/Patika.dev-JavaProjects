package loops.Practices;

import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        int power=1, x, y;

        Scanner input=new Scanner(System.in);

        System.out.print("Ussu alinacak sayiyi giriniz: ");
        x=input.nextInt();
        System.out.print("Us olacak sayiyi giriniz: ");
        y=input.nextInt();

        for (int i=1 ; i<=y ; i++){
            power*=x;
        }
        System.out.println("Sonuc: "+power);
    }
}
