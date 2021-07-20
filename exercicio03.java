package estruturaCondicional;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("O número informado é Multiplo.");
		} else {
			System.out.println("O número informado não é Multiplo.");
		}

		sc.close();
	}

}
