package conditionalStatementsAndCodeBlocks.LeapYearCalculator;

import java.util.Scanner;

public class Main {

    //calculates whether a year is a leap year
    public static boolean leapYear(int year){
        boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //User enters year
        System.out.print("Yil Giriniz : ");
        int year = input.nextInt();

        //Prints if year is leap or not
        System.out.println(leapYear(year) ? year+" bir artik yildir !"
                            : year+ " bir artik yil degildir !");
    }
}
