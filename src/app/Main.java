package app;

import java.util.Scanner;

import model.Password;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan = new Scanner (System.in);
	
	System.out.println(" Ingrese una contraseņa ");
	Password contraseņa = new Password(scan.next());
	
	System.out.println(contraseņa.mostrar(contraseņa.esFuerte()));
	
	}

}
