package keyConceptsAndVariables;

import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double weight=0, height=0, bmi=0;
		
		System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
		height = sc.nextDouble();
		System.out.print("Lutfen kilonuzu giriniz: ");
		weight = sc.nextDouble();
		
		bmi = weight/(height*height);
		System.out.print("Vucut Kitle Indeksiniz:"+bmi);

	}

}
