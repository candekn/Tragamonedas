package ar.edu.unlam.pb2;

public class Tambor {
	//Atributos
	private Integer cara;
	//Metodos
	public Tambor()
	{
		this.cara = 5;
	}
	public void girar() {
		this.cara=(int)(Math.random()*(9)+1);
	}
	public Integer mostrarCara() {
		return this.cara;
	}
	public Integer getCara() {
		return this.cara;
	}

	
}
