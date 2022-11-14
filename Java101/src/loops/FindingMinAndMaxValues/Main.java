package loops.FindingMinAndMaxValues;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void findMaxAndMin(int numberSize){
        int min = 0, max = 0, number = 0;
        for(int i = 0; i < numberSize; i++){
            System.out.print((i+1)+". sayiyi giriniz:");
            number = input.nextInt();
            if(number < min)
                min = number;
            else if(number > max)
                max = number;
        }
        System.out.println("En buyuk sayi: "+ max);
        System.out.println("En kucuk sayi: "+ min);
    }
    public static void main(String[] args) {

        System.out.print("Kac tane sayi gireceksiniz?");
        int numberSize = input.nextInt();
        findMaxAndMin(numberSize);

    }
}
