package pacote;

import java.util.Scanner;

public class Exercicio9 {
	 public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite �rea total do terreno (m2)");
		 double total = entrada.nextDouble();
		 System.out.println("Digite �rea constru�da do terreno (m2):");
		 double construida = entrada.nextDouble();
		 double valor = (total * 3.80)+(construida * 5);
		 System.out.println("Valor a ser pago: R$"+ valor);
		 entrada.close();
	 }
		 
}
