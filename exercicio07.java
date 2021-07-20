package estruturaCondicional;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pontox = sc.nextDouble();
		double pontoy = sc.nextDouble();

		if (pontox == 0 && pontoy == 0) {
			System.out.println("O ponto esta na Origem.");
		} else if (pontox > 0 && pontoy > 0) {
			System.out.println("O ponto se encontra em Q1.");
		} else if (pontox > 0 && pontoy < 0) {
			System.out.println("O ponto se encontra em Q2.");
		} else if (pontox < 0 && pontoy < 0) {
			System.out.println("O ponto se encontra em Q3.");
		} else if (pontox < 0 && pontoy > 0) {
			System.out.println("O ponto se encontra em Q4.");
		}
		sc.close();
	}

}
