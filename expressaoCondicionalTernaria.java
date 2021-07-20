package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class expressaoCondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		double valorFinal = preco - desconto;
		 
		System.out.printf("valor do desconto: R$ %.2f%n", desconto);
		System.out.printf("valor com desconto: R$ %.2f%n", valorFinal);
		
		sc.close();
	}

}
