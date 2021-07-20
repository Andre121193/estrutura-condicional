package estruturaCondicional;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int verificaPar = sc.nextInt();
		
		if (verificaPar % 2 == 0) {
			System.out.println("O número informado é par.");
		} else {
			System.out.println("O número informado é impar.");
		}

		
		sc.close();
	}

}
