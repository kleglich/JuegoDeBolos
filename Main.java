public class Main
{
	public static void main(String[] args) {
		//clase vista
	Consola teclado=new Consola();
	//leer datos de entrada
	Juego bolos=new Juego();
	bolos.tiro=teclado.leerEntero("elija la fuerza de su tiro entre 1 y 10");
	//proceso
	bolos.procesar();
	//imprimir resultados
	teclado.imprimir("tu "+bolos.rdo +" los bolos y su tiro fue de " + bolos.tiro + " su puntuacion final fue de: "+bolos.p_final);
	
	
	}
}
