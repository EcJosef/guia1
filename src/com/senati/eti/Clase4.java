package com.senati.eti;

import java.util.Scanner;

public class Clase4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		float n1 = 0, n2 = 0;
			
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
			
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float division = n1 / n2;
		float resto_entero = n1 % n2;
		
			
		System.out.println("========== Valores Ingresados ==========");
		System.out.println("Suma....."+ suma);
		System.out.println("Resta....."+ resta);
		System.out.println("Suma....."+ producto);
		System.out.println("Resta....."+ division);
		System.out.println("Suma....."+ resto_entero);
		
	}

}
