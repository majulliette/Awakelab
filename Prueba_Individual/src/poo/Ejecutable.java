package poo;
/**
 * Esta clase ejecuta las clases Electrodomestico, Lavadora y Television, crea un array con 10 objetos
 * y suma los objetos según la clase a la que pertenecen
 * @author MariaJulliette
 * @version 28/02/2020
 * @see clase Electrodomestico , Lavadora, Television
 */

public class Ejecutable {

	public static void main(String[] args) {
		
		//variables consideradas para cálculo de sumas por objetos pertenecientes a la misma clase
		int precioFinalSumaElectrodomesticos=0;
		int precioFinalSumaTelevisores=0;
		int precioFinalSumaLavadoras=0;
		
		
		Electrodomestico [] arrayElectrodomestico = new Electrodomestico[10];
		
		arrayElectrodomestico[0]=new Electrodomestico(120000, "rojo", 'B', 50);
		arrayElectrodomestico[1]=new Television(40, true, 200000, "blanco", 'D', 20);
		arrayElectrodomestico[2]=new Lavadora(70, 150000, "azul", 'A', 80);
		arrayElectrodomestico[3]=new Electrodomestico(80000, "verde", 'C', 80);
		arrayElectrodomestico[4]=new Television(90, false, 145000, "rosado", 'E', 30);
		arrayElectrodomestico[5]=new Lavadora(10, 150000, "amarillo", 'F', 10);
		arrayElectrodomestico[6]=new Electrodomestico(250000, 40);
		arrayElectrodomestico[7]=new Television(180000, 100);
		arrayElectrodomestico[8]=new Lavadora(75000, 75);
		arrayElectrodomestico[9]=new Electrodomestico();
		
		//clico que permite sumar objetos pertenecientes a la misma clase
		for (int i = 0; i < arrayElectrodomestico.length; i++) {
			
			if (arrayElectrodomestico[i] instanceof Electrodomestico) {
				
				precioFinalSumaElectrodomesticos=precioFinalSumaElectrodomesticos+
						arrayElectrodomestico[i].precioFinal();
			}
			
			if (arrayElectrodomestico[i] instanceof Television) {
				
				precioFinalSumaTelevisores=precioFinalSumaTelevisores+
						arrayElectrodomestico[i].precioFinal();
			}
			
			if (arrayElectrodomestico[i] instanceof Lavadora) {
				
				precioFinalSumaLavadoras=precioFinalSumaLavadoras+
						arrayElectrodomestico[i].precioFinal();
			}
		}//fin de ciclo que suma los objetos de la misma clase
		
		System.out.println("La suma de los precios de los Electrodomésticos es: "
		+precioFinalSumaElectrodomesticos);
		System.out.println("La suma de los precios de los Televisores es: "
				+precioFinalSumaTelevisores);
		System.out.println("La suma de los precios de las Lavadoras es: "
				+precioFinalSumaLavadoras);
		
	}

}
