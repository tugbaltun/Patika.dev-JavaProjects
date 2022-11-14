package conditionalStatementsAndCodeBlocks.ChineseZodiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating the zodiac object
        Zodiac zodiac = new Zodiac();
        //Creating the scanner object
        Scanner input = new Scanner(System.in);
        //Year knowledge is taken from the user
        System.out.print("Dogum Yilinizi Giriniz : ");
        int year = input.nextInt();
        //Chinese zodiac is calculated and printed on the console
        System.out.println("Çin Zodyagi Burcunuz : "+ zodiac.findZodiac(year));

    }
}
