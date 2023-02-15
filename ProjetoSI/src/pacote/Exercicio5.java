package pacote;

import java.util.Scanner;

public class Exercicio5 {
	 public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite seu sexo (m/h): ");
		 String sexo = entrada.nextLine();
		 System.out.println("Digite o seu peso: ");
		 double peso = entrada.nextDouble();
		 System.out.println("Digite o sua altura: ");
		 double altura = entrada.nextDouble();
		 double imc= peso/ (altura*altura);
		 System.out.println(imc);
		 if(sexo.equals("m") == true) {
			 if(imc < 19.1) {
				 System.out.println("Abaixo do peso!");
			 }
			 else if(imc >= 19.1 || imc <=25.8) {
				 System.out.println("Seu peso é ideal!");
			 } else {
				 System.out.println("Seu está muito acima!");
			 }
		 }
		 if(sexo.equals("h") == true) {
			 if(imc < 20.7) {
				 System.out.println("Abaixo do peso!");
			 }
			 else if(imc >= 20.7 || imc <=26.4) {
				 System.out.println("Seu peso é ideal!");
			 } else {
				 System.out.println("Seu está muito acima!");
			 }
		 }
		 entrada.close();
	 }

}
