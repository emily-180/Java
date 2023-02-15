package pacote;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 double soma=0;
		 for(int i=0; i<4; i++) {
			 System.out.println("Digite a nota: ");
			 double n = entrada.nextDouble();
			 soma=soma+n;
		 }
		 soma = soma /4;
	
		 if(soma < 3.5) {
			 System.out.println("Reprovado! Media: "+soma);
		 }
		 else if(soma >=3.5 && soma < 6.5) {
			 System.out.println("Recuperacao! Media: "+soma);
		 }
		 else {
			 System.out.println("Aprovado! Media: "+soma);
		 }
		 entrada.close();
	}
}
