package poo;

/**
 * Esta clase posee los atributos heredados de la clase electrodomesticos (precio base, 
 * el color, la clasificacion de consumo energetico y el peso) mas un atributo particular 
 * la carga de la lavadora
 * @author MariaJulliette
 * @version 28/02/2020
 * @see clase Ejecutable , Electrodomestico
 */

public class Lavadora extends Electrodomestico {
	//variable constante utilizadas en la clase
	private final int CARGA=5;
	//atributo de la clase, inicializada segun la constante creada
	private int carga=CARGA;
	/**
     * Constructor para crear objeto Lavadora sin parametros de ingreso, por lo que tendra los
     * atributos segun valores inicializados anteriormente en clase electrodomestico
    */
	public Lavadora() {
	}//cierre del constructor
	/**
     * Constructor para crear objeto lavadora con ingreso de precioBase y peso 
     * @param precioBase define el precio que se le asignara a la lavadora
     * @param peso define el peso que posee la lavadora
     * parametros que no se ingresan toman valores inicializado en esta clase y los entregados
     * en clase Electrodomestico
    */	
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
	}//cierre del constructor
	/**
     * Constructor para crear objeto Lavadora con ingreso de parametros:
     * @param carga indica la carga de la Lavadora
     * @param precioBase define el precio que se le asignara a la Lavadora
     * @param color define el color de la Lavadora
     * @param consumoEnergetico define la letra que representa el consumo energetico
     * que posee la Lavadora (nomenclatura de eficiencia energetica)
     * @param peso define el peso que posee la Lavadora
    */	
	public Lavadora(int carga,int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
	}//cierre del constructor
	/**
	 * Metodo que devuelve la carga de la Lavadora
	 * @return carga que posee la Lavadora
	 */
	public int getCarga() {
		return carga;
	}//cierre del metodo
	/**
	 * Metodo que se toma de la clase padre para agregar nuevo costo al precio de la Lavadora (ademas de
	 * los mencionados en el metodo en la clase padre) 
	 * @return el valor final de la Lavadora
	 */
	@Override
	public int precioFinal() {
		int precioF=super.precioFinal();
		if(getCarga()>30) {
			precioF+=50000;
	}
		return precioF;
	}//cierre del metodo

}
