import java.util.Scanner;

public class EjericicoGit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Titulo del ejericio
		System.out.println("SUMA DE 2 NÚMEROS");
		
		//Pide 2 valores para realizar la operación
		System.out.print("Introduce el primer valor para la suma: ");
		double primerValor = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce el primer valor para la suma: ");
		double segundoValor = Double.parseDouble(sc.nextLine());
		
		//Realiza la operación
		double suma = (primerValor + segundoValor);
		System.out.print("El resultado de la suma es: " + suma);
	}

}
