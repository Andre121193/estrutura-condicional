package estruturaCondicional;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorIntervalo = sc.nextInt();

		if (valorIntervalo >= 0 && valorIntervalo <= 25) {
			System.out.println("O valor esta entre 0 e 25.");
		} else if (valorIntervalo <= 50) {
			System.out.println("O valor esta entre 25 e 50.");
		} else if (valorIntervalo <= 75) {
			System.out.println("O valor esta entree 50 e 75.");
		} else if (valorIntervalo <= 100) {
			System.out.println("O valor esta entre 75 e 100");
		} else {
			System.out.println("O valor informado não está dentro do intervalo");
		}
		sc.close();
	}

}
