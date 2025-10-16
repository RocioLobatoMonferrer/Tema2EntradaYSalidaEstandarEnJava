package ejercicios2_2LecturaPorTeclado;

import java.util.Scanner;

public class Ejercicio1 {
	@SuppressWarnings("resource") 
	public void execirse1() {
		
	Scanner keyboard = new Scanner(System.in);
	String name;
	String empty;
	String surname;
	int age;
	String street;
	int number;
	int postcode;
	String province;
	boolean student;
	double height;
	
	System.out.println("Por favor, introduzca los siguientes datos indicados: ");
	System.out.println("Introduce tu nombre: ");
	name = keyboard.nextLine();
	System.out.println(name);
	System.out.println("Introduce tus apellidos: ");
	surname = keyboard.nextLine();
	System.out.println(surname);
	System.out.println("Introduce tu edad: ");
	age = keyboard.nextInt();
	System.out.println(age);
	System.out.println("A continuación vas a introduir tu dirección");
	System.out.println("Introduce tu calle: ");
	empty= keyboard.nextLine();
	street = keyboard.nextLine();
	System.out.println(street);
	System.out.println("Introduce el número: ");
	number = keyboard.nextInt();
	System.out.println(number);
	System.out.println("Introduce tu código postal: ");
	empty= keyboard.nextLine();
	postcode = keyboard.nextInt();
	System.out.println(postcode);
	System.out.println("Introduce tu provincia: ");
	empty= keyboard.nextLine();
	province = keyboard.nextLine();
	System.out.println(province);
	System.out.println("¿Eres un estudiante? Solo true/false: ");
	student = keyboard.nextBoolean();
	System.out.println(student);
	System.out.println("Introduce tu altura: ");
	empty= keyboard.nextLine();
	height = keyboard.nextDouble();
	System.out.println(height);
	System.out.println("Gracias por introducir sus datos");
	
	
	}
	public static void main(String[] args) {
		new Ejercicio1().execirse1();
	}
}
