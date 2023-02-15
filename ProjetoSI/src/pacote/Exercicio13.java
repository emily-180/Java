package pacote;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a quantidade de pessoas: ");
		 int num = entrada.nextInt();
		 System.out.println("Digite a quantidade de dias: ");
		 int dias = entrada.nextInt();
		 double preco;
		 if(num >= 1 && num <=4) {
			 preco = num * 160.0;
			 preco= preco*dias;
			 System.out.println("Valor a ser pago: R$"+preco);
		 }
		 else if(num > 4 && num <=8) {
			 preco = num * 120.0;
			 preco= preco*dias;
			 System.out.println("Valor a ser pago: R$"+preco);
		 } 
		 else if(num > 8) {
			 preco = num * 80.0;
			 preco= preco*dias;
			 System.out.println("Valor a ser pago: R$"+preco);
		 }
		 entrada.close();
	}
}
