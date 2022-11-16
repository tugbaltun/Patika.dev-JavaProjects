package methods.ExponentiationWithRecursiveMethod;

import java.util.Scanner;

public class Main {

    public static double power(int base, int exponent){
        //If exponent equas 0 then return 1
        if(exponent == 0)
            return 1;
        //Do exponentiation for negative numbers
        else if(exponent<0)
            return power(base,exponent+1)/base;
        //Do exponentiation for positive numbers
        return  base*power(base,exponent-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User enters base and exponent knowledge
        System.out.print("Taban degerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        int exponent = input.nextInt();
        //Call the power method and print the result
        System.out.println("Sonuc: "+power(base,exponent));
    }
}
