package Loop;

import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int idade;
		int menor21 = 0, maior50 = 0;

		System.out.println("Digite a idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}

			System.out.println("Digite uma idade ");
			idade = leia.nextInt();
			}
			if (idade < 0) {
				System.out.println("Idade Invalida " + idade);
			}

			System.out.println("Total de pessoas menores de 21 anos " + menor21);
			System.out.println("Total de pessoas maiores de 50 anos " + maior50);
			leia.close();
		

	}

}
