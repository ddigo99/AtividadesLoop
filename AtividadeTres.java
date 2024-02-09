package Loop;

import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, soma = 0, contador = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero > 0) {
				contador++;
				soma += contador;
			}
		} while (numero != 0);

		System.out.println("A soma dos numeros é: " + soma);

	}

}
