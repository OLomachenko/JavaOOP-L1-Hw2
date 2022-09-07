package homework2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle geron = new Triangle();

		System.out.println("Enter side A of the triangle:");
		geron.setSideA(sc.nextDouble());
		System.out.println("Enter side B of the triangle:");
		geron.setSideB(sc.nextDouble());
		System.out.println("Enter side C of the triangle:");
		geron.setSideC(sc.nextDouble());
		System.out.println(geron.toString());
		geron.calculation();

		Triangle newGeron = new Triangle(1.2, 2.2, 2.1);
		System.out.println(newGeron.toString());
		newGeron.calculation();
		sc.close();
	}

}
