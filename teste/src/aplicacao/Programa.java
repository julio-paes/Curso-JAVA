package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com o valor da largura e altura do triangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		retangulo.area();
		retangulo.perimetro();
		retangulo.diagonal();
		
		System.out.println("AREA: " + retangulo.area());
		System.out.println("PERIMETRO: " + retangulo.perimetro());
		System.out.println("DIAGONAL: " + retangulo.diagonal());


		
		
		
		
		sc.close();
	}

	private static String diagonal() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String perimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String area() {
		// TODO Auto-generated method stub
		return null;
	}

}
