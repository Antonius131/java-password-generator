package org.generation.italy.security;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String name = sc.nextLine();
		
		System.out.println("Cognome:");
		String lastName = sc.nextLine();
		
		System.out.println("Colore preferito:");
		String favColor = sc.nextLine();
		
		
		System.out.println("Giorno di nascista");
		int day = sc.nextInt();
		
		System.out.println("Mese di nascista");
		int month = sc.nextInt();
		
		System.out.println("Anno di nascista");
		int year = sc.nextInt();
		
		System.out.println("La tua password:");
		System.out.println(name + "-" + lastName + "-" + favColor + "-" + (day + month + year));
		
	}
	
}