package conditionalStatementsAndCodeBlocks.StatusOfPAssingTheClass;

import java.util.Scanner;

public class StatusOfPassingTheClass {
    public static void main(String[] args) {

        int math, Turkish, physics, chemical, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        math = input.nextInt();

        System.out.print("Türkçe notunuz:");
        Turkish = input.nextInt();

        System.out.print("Fizik notunuz:");
        physics = input.nextInt();

        System.out.print("Kimya notunuz:");
        chemical = input.nextInt();

        System.out.print("Müzik notunuz:");
        music = input.nextInt();

        Lessons lessons = new Lessons(math, Turkish, physics, chemical, music);
        lessons.setAverage(lessons.calculateAverage(lessons));

        if(lessons.getAverage() <= 55.0)
            System.out.println("Sinifta kaldiniz. Seneye tekrar gorusmek uzere.");
        else
            System.out.println("Tebrikler. Sinifi gectiniz!");

        System.out.println("Ortalamaniz:" + lessons.getAverage());



    }
}
