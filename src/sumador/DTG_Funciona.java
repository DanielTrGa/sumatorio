package sumador;

import java.util.Scanner;

public class DTG_Funciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ASumar sumar_numero = new ASumar();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el numero que quieras utilizar:");
		String numero = sc.nextLine();
		
		if (sumar_numero.negativo(numero) != null) {
			System.out.println(sumar_numero.negativo(numero));
			
		} else if (sumar_numero.sumativo(numero) != null) {
			System.out.println(sumar_numero.sumativo(numero));
			
		} else {
			System.out.println(sumar_numero.total(numero));
			
		}
		
	}

}
