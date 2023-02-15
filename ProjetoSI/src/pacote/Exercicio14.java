package pacote;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe uma string:");
		 String palavra = entrada.nextLine();
		 int n = palavra.length(); // tamanho da string
		 int cont=0;
		 for (int i=0; i<n; i++) {
		 // verifica se o caractere é a  'a'
		      if ((palavra.charAt(i) == 'A') || (palavra.charAt(i) == 'a')) {
		         cont++;
		      }
		 }
		 System.out.println("Quantidade de 'a':  "+cont);
		 entrada.close();
	}
}
