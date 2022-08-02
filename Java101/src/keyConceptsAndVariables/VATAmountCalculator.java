package keyConceptsAndVariables;

import java.util.Scanner;

public class VATAmountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ucret miktarini giriniz:");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		double vatRate = (price>0 && price<=1000) ? 0.18 : 0.08;
		double vatPrice = price + price*vatRate;
		System.out.println("KDV'siz fiyat: "+price);
		System.out.println("KDV'li fiyat: "+vatPrice);
		System.out.println("KDV'li tutari: "+vatRate*price);
		
	}

}
