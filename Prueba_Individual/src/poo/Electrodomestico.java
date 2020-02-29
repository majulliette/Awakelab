package poo;
import java.util.ArrayList;

/**
 * Esta clase define objetos con caracteristicas generales de electrodomesticos como el precio base, 
 * el color, la clasificacion de consumo energetico y el peso
 * @author MariaJulliette
 * @version 28/02/2020
 * @see clase Ejecutable
 */

public class Electrodomestico {

	//variables constantes utilizadas en la clase
	private final int PRECIO_BASE=100000;
	private final String COLOR = "BLANCO";
	private final char CONSUMO_ENERGETICO='F';
	private final int PESO=5;
	//atributos de la clase, inicializadas segun las constantes creadas
	private int precioBase=PRECIO_BASE;
	private String color= COLOR;
	private char consumoEnergetico=CONSUMO_ENERGETICO;
	private int peso=PESO;
	
	/**
     * Constructor para crear objeto Electrodomestico sin parametros de ingreso, por lo que tendra los
     * atributos segun valores inicializados anteriormente
    */
	public Electrodomestico() {
		
	}//cierre del constructor
	/**
     * Constructor para crear objeto Electrodomestico 
     * @param precioBase define el precio que se le asignara al Electrodomestico
     * @param peso define el peso que posee el electrodomestico 
    */	
	public Electrodomestico(int precioBase,int peso){
		this.precioBase=precioBase;
		this.peso=peso;
	}//cierre del constructor
	/**
     * Constructor para crear objeto Electrodomestico 
     * @param precioBase define el precio que se le asignara al Electrodomestico
     * @param color define el color del electrodomestico
     * @param consumoEnergetico define la letra que posee el electrodomestico (nomenclatura de su eficiencia
     * energetica)
     * @param peso define el peso que posee el electrodomestico 
  
    */	
	public Electrodomestico(int precioBase,String color,char consumoEnergetico,int peso) {
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}//cierre constructor

	/**
	 * Metodo que devuelve el precioBase 
	 * @return el precio base asignado al electrodomestico
	 */
	public int getPrecioBase() {
		return precioBase;
	}//cierre metodo

	/**
	 * Metodo que devuelve el color asignado al electrodomestico 
	 * @return el color asignado al electrodomestico
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Metodo que devuelve la letra del consumo energetico asignado
	 * @return el consumo energetico que posee el electrodomestico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * Metodo que devuelve el peso asignado al electrodomestico
	 * @return el peso asignado al electrodomestico
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * Metodo que comprueba si la letra ingresada con respecto al consumo energetico es correcto, si es
	 * correcta entonces se asigna la letra ingresada, en caso contrario se asigna por defecto 'F'
	 * @param consumoEnergetico valido dentro de la clasificacion
	 */
	public void comprobarConsumoEnergetico(char consumoEnergetico ) {
		ArrayList<Object>  opcionesConsumoEnergetico=new ArrayList<>();
		opcionesConsumoEnergetico.add('A');
		opcionesConsumoEnergetico.add('B');
		opcionesConsumoEnergetico.add('C');
		opcionesConsumoEnergetico.add('D');
		opcionesConsumoEnergetico.add('E');
		opcionesConsumoEnergetico.add('F');
		
		if(opcionesConsumoEnergetico.contains(consumoEnergetico)) {
			
			this.consumoEnergetico=consumoEnergetico;
		}else {
			this.consumoEnergetico=CONSUMO_ENERGETICO;
		}
		
	}//cierre metodo
	/**
	 * Metodo que comprueba si el color ingresado esta dentro de los colores disponibles, si esta disponible
	 * entonces asigna el color ingresado, en caso contrario asigna color por defecto blanco
	 * @param color asignado y validado del electrodomestico
	 */
	public void comprobarColor(String color) {
		ArrayList<String>  opcionesColor=new ArrayList<>();
		opcionesColor.add("BLANCO");
		opcionesColor.add("NEGRO");
		opcionesColor.add("ROJO");
		opcionesColor.add("AZUL");
		opcionesColor.add("GRIS");
		if(opcionesColor.contains(color.toUpperCase())) {
			this.color=color.toUpperCase();
		}else {
			this.color=COLOR;
		}
		
	}//cierre metodo
	/**
	 * Metodo que permite calcular el precio final asignado al electrodomestico, al precio base se le adiciona
	 * el precio segun su consumo energetico y se le adiciona el precio segun los rangos de peso definido
	 * @return precioFinal que tiene el electrodomestico luego de adicionar ambas variables
	 */
	public int precioFinal() {
		int precioAumento=0;
		
		switch (getConsumoEnergetico()) {
		case 'A': 
			precioAumento+=100000;
			break;
		case 'B': 
			precioAumento+=80000;
			break;
		case 'C': 
			precioAumento+=60000;
			break;
		case 'D': 
			precioAumento+=50000;
			break;
		case 'E': 
			precioAumento+=30000;
			break;
		case 'F': 
			precioAumento+=10000;
			break;
		
		}
		
		if(getPeso()>=0 && getPeso()<=19) {
			precioAumento+=10000;
		}
		if(getPeso()>=20 && getPeso()<=49) {
			precioAumento+=50000;
		}
		if(getPeso()>=50 && getPeso()<=79) {
			precioAumento+=80000;
		}
		if(getPeso()>=80 ) {
			precioAumento+=100000;
		}
		
		return precioBase+precioAumento;
		
	}//cierre de metodo
}
