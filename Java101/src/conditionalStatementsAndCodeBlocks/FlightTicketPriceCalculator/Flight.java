package conditionalStatementsAndCodeBlocks.FlightTicketPriceCalculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flight {
    private double distance;
    private int age;
    private int tripType;

    public double calculateAgeDiscount(int age, double price){
        //Check age of passenger and calculate discount price
        if(age<12)
            price -= price*0.5;
        else if(age<25)
            price -= price*0.1;
        else if(age>65)
            price -= price*0.3;

        return price;
    }

    public double calculateTripTypeDiscount(int tripType, double price){
        // If tripType is "Gidis Donus" then calculate price other wise just return price
        if(tripType == 2)
            price = (price-price*0.2)*2;

        return price;
    }

    public double calculateDiscount(Flight flight){
        double price = flight.getDistance()*0.1;
        //Fist clculate ageDiscount
        price = calculateAgeDiscount(flight.age, price);
        //After that calculate tripType Discount and find the last price
        price = calculateTripTypeDiscount(flight.getTripType(), price);

        return price;
    }
}
