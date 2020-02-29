package poo;

/**
 * Esta clase posee los atributos heredados de la clase electrodomesticos (precio base, 
 * el color, la clasificacion de consumo energetico y el peso) mas dos atributos particulares 
 * la resolucion y el sintonizador TDT
 * @author MariaJulliette
 * @version 28/02/2020
 * @see clase Ejecutable , Electrodomestico
 */
public class Television extends Electrodomestico {
	//atributos de la clase, inicializadas
	private int resolucion=20;
	private boolean sintonizadorTDT=false;
	/**
     * Constructor para crear objeto Television sin parametros de ingreso, por lo que tendra los
     * atributos segun valores inicializados anteriormente en clase electrodomestico
    */
	public Television() {
	} //cierre del constructor
	/**
     * Constructor para crear objeto Television con ingreso de precioBase y peso 
     * @param precioBase define el precio que se le asignara a la Television
     * @param peso define el peso que posee la Television
     * parametros que no se ingresan toman valores inicializado en esta clase y los entregados
     * en clase Electrodomestico
    */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
	}//cierre del constructor
	/**
     * Constructor para crear objeto Television con ingreso de parametros:
     * @param carga indica la carga de la Television
     * @param precioBase define el precio que se le asignara a la Television
     * @param color define el color de la Television
     * @param consumoEnergetico define la letra que representa el consumo energetico
     * que posee la Television (nomenclatura de eficiencia energetica)
     * @param peso define el peso que posee la Television
    */
	public Television(int resolucion,boolean sintonizadorTDT,int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}//cierre del metodo
	/**
	 * Metodo que devuelve la resolucion de la Television
	 * @return resolucion que posee la Television
	 */
	public int getResolucion() {
		return resolucion;
	}//cierre del metodo
	/**
	 * Metodo que devuelve si la Television tiene sintonizador TDT
	 * @return sintonizadorTDT que posee la Television
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}//cierre del metodo
	/**
	 * Metodo que se toma de la clase padre para agregar nuevo costo al precio de la Television (ademas de
	 * los mencionados en el metodo en la clase padre) 
	 * @return el valor final de la Lavadora
	 */
	public int precioFinal() {
		int precioF=super.precioFinal();
		if(getResolucion()>40) {
			
			precioF=(int) (precioF*1.3);
		}
		
		if(isSintonizadorTDT()) {
			precioF+=50000;
		}
		return precioF;
	}//cierre del metodo
}
