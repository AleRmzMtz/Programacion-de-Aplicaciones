package modelo;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Rectangulo implements Operaciones {

	/***
	 * 
	 * @param Lt1 uso de varible Lt1 en formtado double
	 * @param Lt2 uso de varible Lt2 en formtado double
	 * @return el perimetro del rectangulo
	 */
	public static double Operaciones(double Lt1, double Lt2) {
		// TODO Auto-generated method stub
		double suma = Lt1 + Lt2;
		return suma * 2;
	}
	/**
	 * 
	 * @param Lt1 uso de varible Lt1 en formtado double
	 * @param Lt2 uso de varible Lt2 en formtado double
	 * @return el area del rectangulo
	 */
	public static double Operacione1(double Lt1, double Lt2) {
		// TODO Auto-generated method stub
		return Lt1 * Lt2;
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
