package casa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(14);
		p1.setNome("sabrina");
		p1.fazAniversario(12);
		
		Porta pr1 = new Porta();
		pr1.setCor("Preta");
		pr1.estaAberta();
		pr1.abre();
		pr1.estaAberta();
		pr1.pinta("Rosa");
	}
}
