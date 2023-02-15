package pacote;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite uma letra: ");
		 String letra = entrada.nextLine();
		 System.out.println("Digite um numero: ");
		 int num = entrada.nextInt();
		 for(int i=0; i<num; i++) {
			 System.out.print(letra);
		 }
		 entrada.close();
	}
}
