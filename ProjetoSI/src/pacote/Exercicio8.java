package pacote;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite altura da parede: ");
		 double alturaP = entrada.nextDouble();
		 System.out.println("Digite altura da azulejo: ");
		 double alturaA = entrada.nextDouble();
		 System.out.println("Digite largura da parede: ");
		 double larguraP = entrada.nextDouble();
		 System.out.println("Digite largura da azulejo: ");
		 double larguraA = entrada.nextDouble();
		 double totalP=alturaP*larguraP;
		 double totalA=alturaA*larguraA;
		 double re=0;
		 int cont=0;
		 while(re<=totalP) {
			 re = re + totalA;
			 cont++;
		 } 
		 System.out.println("Quantidade: "+ cont);
		 entrada.close();
	 }
}
