package loops.InvertedTriangle;

import java.util.Scanner;

public class Main {

    public static void makeTriangle(int number){

        //Created a loop as many as the number of digits
        for(int i=0; i<number; i++){
            //Specified the number of spaces to come before the stars
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            //Specified how many times the star will be printed in rows
            for(int k=2*number-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
            //Goes to a bottom line
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //User enters the number of digits
        System.out.print("Basamak Sayisi: ");
        int number = input.nextInt();
        //Calls the method and prints the Inverted Triangle
        makeTriangle(number);
    }
}
