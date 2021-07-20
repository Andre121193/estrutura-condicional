package estruturaCondicional;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Codigo do produto: ");
		int codigo = sc.nextInt();
		double totalPagar;

		if (codigo == 1) {
			totalPagar = quantidade * 4;
			System.out.printf("total a pagar é: R$ %.2f%n", totalPagar);
		} else if (codigo == 2) {
			totalPagar = quantidade * 4.5;
			System.out.printf("total a pagar é: R$ %.2f%n", totalPagar);
		} else if (codigo == 3) {
			totalPagar = quantidade * 5;
			System.out.printf("total a pagar é: R$ %.2f%n", totalPagar);
		} else if (codigo == 4) {
			totalPagar = quantidade * 2;
			System.out.printf("total a pagar é: R$ %.2f%n", totalPagar);
		} else if (codigo == 5) {
			totalPagar = quantidade * 1.5;
			System.out.printf("total a pagar é: R$ %.2f%n", totalPagar);
		}
		sc.close();
	}

}
