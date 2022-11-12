package conditionalStatementsAndCodeBlocks.FlightTicketPriceCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner input = new Scanner(System.in);
        double distance = 0.0;
        int age = 0, tripType ;

        //User enters flight knowledge
        System.out.println("Mesafeyi km turunden giriniz:");
        distance = input.nextDouble();
        System.out.println("Yasinizi giriniz:");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus): ");
        tripType = input.nextInt();

        //Check whether if passenger enter the right knowledge
        if(distance<0.0 || age<0 || tripType!=1 && tripType !=2)
            System.out.println("Hatali Veri Girdiniz!");

        //If flight knowledge is right calculate the price of flight ticket and print
        else{
            flight.setDistance(distance);
            flight.setAge(age);
            flight.setTripType(tripType);

            System.out.println("Toplam Tutar: "+flight.calculateDiscount(flight)+" TL");

        }
   }
}
