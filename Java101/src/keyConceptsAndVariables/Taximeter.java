package keyConceptsAndVariables;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double kmAmount = 2.2;
		int openingPrice = 10;
		double km=0, price=0;
		
		System.out.print("Km:");
		km = sc.nextDouble();
		price = openingPrice + km*kmAmount;
		price = (price<20) ? 20 : price;
		System.out.println("Odenecek Tutar:"+price);

	}

}
