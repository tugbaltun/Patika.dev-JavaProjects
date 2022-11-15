package loops.Practices;

import java.util.Scanner;

public class FindPowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayisini girin: ");
        int power = input.nextInt();

        System.out.println("4'ün "+power+"'e kadar olan katlari: ");
        for(int i=1; i<=power; i*=4){
            System.out.println(i);
        }

        System.out.println("5'in "+power+"'e kadar olan katlari: ");
        for(int i=1; i<=power; i*=5){
            System.out.println(i);
        }

    }
}
