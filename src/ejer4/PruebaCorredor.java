package ejer4;

public class PruebaCorredor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Corredor corredor1 =new Corredor(40);
		
		corredor1.recargarEnergia(70);
		System.out.println(corredor1.getEnergia());
		corredor1.setEnergia(11);
		corredor1.correr();
		System.out.println(corredor1.getEnergia());

	}

}
