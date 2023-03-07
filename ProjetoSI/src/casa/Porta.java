package casa;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoY;
	private double dimensaoZ;
	private double dimensaoX;
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public void abre() {
		if(this.aberta != true) {
			this.aberta = true;
			System.out.println("A porta foi aberta");
		}else
			System.out.println("A porta já estava aberta");
			
	}
	
	public void fecha() {
		if(this.aberta != false) {
			this.aberta = false;
			System.out.println("A porta foi fechada");
		}else
			System.out.println("A porta já estava fechada");
			
	}
	
	public void estaAberta() {
		if(this.aberta == true) {
			System.out.println("A porta está aberta");
		}else
			System.out.println("A porta está fechada");
	}
	
	public void pinta(String nome) {
		this.cor=nome;
		System.out.println("A porta foi pintada!");
	}
}