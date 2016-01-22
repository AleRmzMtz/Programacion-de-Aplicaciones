/**
 * 
 * @author AleAle Mtz
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param c el cual es un lado de cuadrado en formato entero
	 * @return regresa la suma de los cuatro lados del  cuadrado
	 */
	public int perimetroCuadrado(int c){
		return  c + c + c + c;
	}
	/**
	 * 
	 * @param r1 es la base del rectangulo en formato entero
	 * @param r2 es la altura del rectangulo en formato entero
	 * @return la suma de esos lados multiplicados por dos
	 */
	public int perimetroRectangulo(int r1 , int r2){
		int suma = r1 + r2;
		return suma  * 2;
	}
	/**
	 * 
	 * @param t1 es la base del triangulo en formato entero
	 * @param t2 es la altura del triangulo en formato entero
	 */
	public int perimetroTriangulo(int t1,int t2, int t3){
		return t1 + t2 + t3;
	}
	/**
	 * 
	 * @param r es elradio del circulo en formato entero
	 * @return regresa el resultado del radio por PI por dos
	 */
	public double perimetroCirculo(double c) {
		return   2 * Math.PI * c;
	}
}
