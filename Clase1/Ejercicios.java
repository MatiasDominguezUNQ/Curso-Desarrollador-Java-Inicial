package clase1;
import java.util.Scanner;

public class Ejercicios {
	public static void main(String args[]) {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese ejercicio: ");
		String ejercicio = lectura.next();
		switch (ejercicio) {
		case "a":
			ejercicio1a();
			break;
		case "b":
			ejercicio1b();
			break;
		case "c":
			ejercicio1c();
			break;
		case "d":
			ejercicio1d();
			break;
		default:
			System.out.println("Ingrese una letra de la 'a' a la 'd'.");
			main(args);
		}
	}
	
	public static void ejercicio1a() {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Primer número: ");
		int a = lectura.nextInt();
		System.out.println("Segundo número: ");
		int b = lectura.nextInt();
		int res = a;
		while (res < b) {
			System.out.print(res+",");
			res++;
		}
		System.out.print(res);
	}
	
	public static void ejercicio1b () {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Primer número: ");
		int a = lectura.nextInt();
		System.out.println("Segundo número: ");
		int b = lectura.nextInt();
		int res = a;
		while (res < b) {
			if(res%2 == 0) {
				System.out.print(res+",");
			}
			res++;
		}
		if(res%2 == 0) {
			System.out.print(res);
		}
	}
	
	public static void ejercicio1c () { 
		Scanner lectura = new Scanner (System.in);
		System.out.println("Primer número: ");
		int a = lectura.nextInt();
		System.out.println("Segundo número: ");
		int b = lectura.nextInt();
		System.out.println("Pares o Impares?: ");
		String c = lectura.next();
		int res = a;
		switch (c.toLowerCase()) {
			case "pares":
				while (res < b) {
					if(res%2 == 0) {
						System.out.print(res+",");
					}
					res++;
				}
				if(res%2 == 0) {
					System.out.print(res);
				}
				break;
			case "impares":
				while (res < b) {
					if(res%2 == 1) {
						System.out.print(res+",");
					}
					res++;
				}
				if(res%2 == 0) {
					System.out.print(res);
				}
				break;
			default:
				System.out.println("Ingrese 'pares' o 'impares'.");
				ejercicio1c();
		}
	}

	public static void ejercicio1d () {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Primer número: ");
		int a = lectura.nextInt();
		System.out.println("Segundo número: ");
		int b = lectura.nextInt();
		for (int i=b; i>=a; i--) {
			if(i%2 == 0) {
				System.out.print(i+"-");
			}
		}
	}
}
