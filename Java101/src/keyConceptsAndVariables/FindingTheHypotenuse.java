package keyConceptsAndVariables;

import java.util.Scanner;

public class FindingTheHypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		double c = 0;
		
		System.out.print("Kenar 1:");
		a = sc.nextInt();
		System.out.print("Kenar 2:");
		b = sc.nextInt();
		
		c = Math.sqrt(a*a+b*b);
		System.out.println("Hipotenus:"+c);

	}

}
