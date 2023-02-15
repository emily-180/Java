package pacote;

import java.util.Scanner;

public class Exercicio4 {
	 public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		 System.out.println("Digite um valor: ");
		 double dolar = entrada.nextDouble();
		 double real= dolar*5.10;
		 System.out.println("O valor convertido para real: R$"+real);
		 entrada.close();
	 }

}
