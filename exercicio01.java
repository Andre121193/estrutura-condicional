package estruturaCondicional;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int verificaPositivo = sc.nextInt();

		if (verificaPositivo >= 0) {
			System.out.println("O n�mero informado � Positivo.");
		} else {
			System.out.println("O n�mero informado � Negativo.");
		}
		sc.close();
	}
}
