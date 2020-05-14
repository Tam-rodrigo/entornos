package ejer4;
// POO05
public class Corredor {
	//ATRIBUTOS
	private int energia;
	private static final int MIN=0;
	private static final int MAX=100;
	
	
	//constructor obligatorio
	public Corredor(int energia) {
		this.energia = energia;
	}
	
	//getters y setters
	
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public static int getMin() {
		return MIN;
	}
	public static int getMax() {
		return MAX;
	}
	
	//metodos 
	
	private void verificarEnergia() {
		if (energia>MAX) 
			this.energia=MAX;
		else if (energia<MIN)
			this.energia=MIN;
		this.energiaAgotada();
		}
	
	//se usa void cuando no devuelve nada
		
	public void recargarEnergia (int cantidad) {
		
		this.energia=this.energia+cantidad;
		//comprueba la cantidad de energia.
		this.verificarEnergia();
		
	}
	
	
	public void correr() {
		
		this.energia=this.energia-10;
		this.verificarEnergia();

		
	}
	
	private void energiaAgotada() {
		if (this.energia<10) {
			this.energia=0;
			System.out.println("Has llegado al minimo de energia. Tu energia es "+ this.energia);
	}}
	
	public int entrenar() {
		int energiaCargada;
		energiaCargada=this.energia+15;
		return energiaCargada;
		
	}
	
	
	
	
	

}
