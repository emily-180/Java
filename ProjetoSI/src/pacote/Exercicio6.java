package pacote;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite o comprimento): ");
		 double comprimento = entrada.nextDouble();
		 System.out.println("Digite o sua largura: ");
		 double largura = entrada.nextDouble();
		 double area = comprimento * largura;
		 System.out.println("Area: "+area);
		 double perimetro = (comprimento*comprimento) + (largura*largura);
		 System.out.println("Perimetro: "+perimetro);
		 entrada.close();
	}
}
