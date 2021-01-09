package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os valores do triangulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com os valores do triangulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();

		double areay = y.area();

		System.out.println("A area do triangulo x é: " + areax);

		System.out.println("A area do triangulo y é: " + areay);

		sc.close();
	}

}
