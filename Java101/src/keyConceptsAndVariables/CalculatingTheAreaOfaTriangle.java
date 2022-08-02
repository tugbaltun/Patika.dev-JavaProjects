package keyConceptsAndVariables;

import java.util.Scanner;

public class CalculatingTheAreaOfaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c, perimeter=0;
		double area = 0, area1=0, u=0;
		System.out.print("Kenar 1:");
		a = sc.nextInt();
		System.out.print("Kenar 2:");
		b = sc.nextInt();
		System.out.print("Kenar 3:");
		c = sc.nextInt();
		
		perimeter = a+b+c;
		u = perimeter/2;
		area1 = u*(u-a)*(u-b)*(u-c);
		area = Math.sqrt(area1);
		System.out.println("Ucgenin alani:"+area);

	}

}
