package keyConceptsAndVariables;

import java.util.Scanner;

public class CalculatingGradePointAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int math, physcics, chemistry, turkish, history, music;
		System.out.println("Matematik:");
		math = sc.nextInt();
		System.out.println("Fizik:");
		physcics = sc.nextInt();
		System.out.println("Kimya:");
		chemistry = sc.nextInt();
		System.out.println("Turkce:");
		turkish = sc.nextInt();
		System.out.println("Tarih:");
		history = sc.nextInt();
		System.out.println("Muzik:");
		music = sc.nextInt();
		
		int sum = math + physcics + chemistry + turkish + history + music;
		double average = sum/6;
		System.out.println("Ortalama:"+average);
		System.out.println((average>60)? "Sinifi Gecti" : "Sinifta Kaldi");

	}

}
