package Loop;

import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, n2, n1;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();

		if (n1 >= n2) {
			System.out.println("Intervalo inválido ");
		}
		for (i = n1; i < n2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}
			leia.close();
		}
	}

}

