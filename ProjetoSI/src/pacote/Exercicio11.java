package pacote;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a quantidade de dias ");
		 int dia = entrada.nextInt();
		 double acresenta;
		 double valor = 45 * dia;
		 for(int i=0;i<dia;i++) {
			 System.out.println("Quilometragem rodada no dia "+(i+1));
			 double km = entrada.nextDouble();
			 if (km > 60) {
				 acresenta = km - 60;
				 acresenta = acresenta * 0.5;
				 valor = valor + acresenta;
			 }
		 }
			 
		 System.out.println("Valor a ser pago: "+ valor);
		 entrada.close();
	 }
}
