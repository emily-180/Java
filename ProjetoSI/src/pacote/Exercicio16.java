package pacote;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe uma string:");
		 String palavra = entrada.nextLine();
		 int n = palavra.length(); // tamanho da string
		 int cont=0;
		 int i=0;
		 while(i<n) {
		 // verifica se o caractere é a  'a'
		      if ((palavra.charAt(i) == 'A') || (palavra.charAt(i) == 'a')) {
		         cont++;
		      }
		      i++;
		 }
		 System.out.println("Quantidade de 'a':  "+cont);
		 entrada.close();
	}
}
