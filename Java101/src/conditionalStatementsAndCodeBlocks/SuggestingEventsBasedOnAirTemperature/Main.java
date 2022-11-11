package conditionalStatementsAndCodeBlocks.SuggestingEventsBasedOnAirTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heat heat = new Heat();
        System.out.println("Sicakligi giriniz:");
        heat.setHeat(input.nextInt());
        heat.getEvent(heat.getHeat());
    }
}
