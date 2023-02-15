package pacote;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o salario: ");
		 double salario = entrada.nextDouble();
		 double porcentagem;
		 if(salario<10800)  {
			 System.out.println("Isento de pagar imposto!");
		 }
		 else if(salario >= 10800 && salario <=21600 ) {
			 porcentagem =salario * 0.15;
			 System.out.println("Valor a ser pago: R$"+porcentagem);
		 } 
		 else if(salario >21600) {
			 porcentagem =salario * 0.275;
			 System.out.println("Valor a ser pago: R$"+porcentagem);
		 }
		 entrada.close();
	}
}
