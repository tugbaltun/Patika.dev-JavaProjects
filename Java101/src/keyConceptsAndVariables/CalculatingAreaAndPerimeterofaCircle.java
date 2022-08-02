package keyConceptsAndVariables;

import java.util.Scanner;

public class CalculatingAreaAndPerimeterofaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r=0, angle=0;
		double pi = 3.14, area=0, perimeter=0, areaWithAngle;
		
		System.out.print("Yari Cap: ");
		r = sc.nextInt();
		System.out.println("Alfa Acisi: ");
		angle = sc.nextInt();
		
		area = pi*r*r;
		perimeter = 2*pi*r;
		areaWithAngle = (area*angle)/360;
		
		System.out.println("Alan:"+area);
		System.out.println("Cevre:"+perimeter);
		System.out.println("Alfa ile Hesaplanan Alan:"+areaWithAngle);

	}

}
