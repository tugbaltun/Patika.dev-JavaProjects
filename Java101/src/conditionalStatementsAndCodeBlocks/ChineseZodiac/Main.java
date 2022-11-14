package conditionalStatementsAndCodeBlocks.ChineseZodiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zodiac zodiac = new Zodiac();
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz : ");
        int year = input.nextInt();
        System.out.println("Çin Zodyagi Burcunuz : "+ zodiac.findZodiac(year));

    }
}
