package keyConceptsAndVariables;

import java.util.Scanner;

public class GroceryCashierProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pear=2.14, apple=3.67, tomatoes=1.11, banana=0.95, eggplant=5, sum=0;
		double kgPear, kgApple, kgTomatoes, kgBanana, kgEggplant;

		
		System.out.print("Armut kac kilo?: ");
		kgPear = sc.nextDouble();
		System.out.print("Elma kac kilo?: ");
		kgApple = sc.nextDouble();
		System.out.print("Domates kac kilo?: ");
		kgTomatoes = sc.nextDouble();
		System.out.print("Muz kac kilo?: ");
		kgBanana = sc.nextDouble();
		System.out.print("Patlýcan kac kilo?: ");
		kgEggplant = sc.nextDouble();
		
		sum = pear*kgPear + apple*kgApple + tomatoes*kgTomatoes + banana*kgBanana + eggplant*kgEggplant;
		
		System.out.print("Toplam tutar:"+sum);

	}

}
