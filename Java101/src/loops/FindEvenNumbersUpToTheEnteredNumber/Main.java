package loops.FindEvenNumbersUpToTheEnteredNumber;

import java.util.Scanner;

public class Main {

    //Calculate the average of numbers divisible by 3 and 4
    public static int findAverage(int number){
        int sum = 0, counter = 0, average ;

        //Check numbers from 0 to number
        for(int i = 0; i <= number ; i++){
            if(i % 3 == 0 && i % 4 == 0 ){
                sum += i;
                counter++;
            }
        }
        //Calculate average of numbers (0 included)
        average = sum/counter;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.println("Average : "+findAverage(number));
    }
}
