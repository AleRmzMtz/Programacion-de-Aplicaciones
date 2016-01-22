package modelo;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Triangulo implements Operaciones {

	/**
	 * 
	 * @param Lt1 uso de varible Lt1 en formtado double
	 * @param Lt2 uso de varible Lt2 en formtado double
	 * @return el area de cualquier triangulo
	 */
	public static double Operaciones1(double Lt1, double Lt2) {
		// TODO Auto-generated method stub
		double resultado = Lt1 * Lt2;
		return resultado / 2;
	}
	/**
	 * 
	 * @param Lt1 uso de varible Lt1 en formtado double
	 * @param Lt2 uso de varible Lt2 en formtado double
	 * @param Lt3 uso de varible Lt3 en formtado double
	 * @return el perimetro de cualquier triangulo
	 */
	public static double Operaciones(double Lt1, double Lt2 ,double Lt3) {
		// TODO Auto-generated method stub
		return Lt1 + Lt2 + Lt3;
	}
	
	/**
	 * variables declaradas en la clase operaciones que retornaran 0 
	 */
	@Override
	public double Operaciones(double L1, double base, double altura, double Lt1, double Lt2, double Lt3, double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
