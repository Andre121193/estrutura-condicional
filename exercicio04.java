package estruturaCondicional;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int primeiroHorario = sc.nextInt();
		int segundoHorario = sc.nextInt();
		int horaJogada;

		if (primeiroHorario < segundoHorario) {
			horaJogada = segundoHorario - primeiroHorario;
		} else {
			horaJogada = 24 - primeiroHorario + segundoHorario;
		}
		System.out.println("O tempo da partida foi: " + horaJogada);
		sc.close();
	}

}
