package ar.edu.unlam.pb2;

public class Tragamonedas {
	//Atributos
	private Integer saldo;
	private Integer apuestaMin;
	private Integer apuestaMax;
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas(Integer saldo, Integer min, Integer max)
	{
		this.saldo = saldo;
		this.apuestaMin = min;
		this.apuestaMax = max;
		Tambor tambor1 = new Tambor();
		Tambor tambor2 = new Tambor();
		Tambor tambor3 = new Tambor();
		this.tambor1=tambor1;
		this.tambor2=tambor2;
		this.tambor3=tambor3;
	}
	public void jugar(Integer apuesta) {
		if(apuesta>=apuestaMin&&apuesta<=apuestaMax) {
			this.saldo=this.saldo+apuesta;
			tambor1.girar();
			tambor2.girar();
			tambor3.girar();
		}
	}
	public Integer obtenerPremio() {
		if(tambor1.getCara().equals(tambor2.getCara())) {
			if(tambor3.getCara().equals(tambor2.getCara())){
				return (this.saldo*3);
			}
		}
		return 0;
	}
	public void mostrarJugada() {
		System.out.println(tambor1.mostrarCara());
		System.out.println(tambor2.mostrarCara());
		System.out.println(tambor3.mostrarCara());
	}
}
