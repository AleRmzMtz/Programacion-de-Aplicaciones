/**
 * 
 * @author AleAle Mtz
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param c el cual es un lado de cuadrado en formato entero
	 * @return el resultado de multipicar el lado ingresado por el mismo lado
	 */
	public int areaCuadrado(int c){
		return  c * c;
	}
	/**
	 * 
	 * @param r1 es la base del rectangulo en formato entero
	 * @param r2 es la altura del rectangulo en formato entero
	 * @return el resultado de multiplicar pase por altura 
	 */
	public int areaRectangulo(int r1 , int r2){
	return r1 * r2;
	}
	/**
	 * 
	 * @param t1 es la base del triangulo en formato entero
	 * @param t2 es la altura del triangulo en formato entero
	 * @return el resultado de multiplicar base por altura y luego dividirlo entre 2
	 */
	public int areaTriangulo(int t1, int t2){
		int resultado = t1 * t2;
		return resultado / 2;
	}
	/**
	 * 
	 * @param r es elradio del circulo en formato entero
	 * @return el resultado de multiplicar el radio por dos por PI
	 */
	public double areaCirculo(double r) {
	
	return Math.PI * (Math.pow(r, 2));
	}
}
