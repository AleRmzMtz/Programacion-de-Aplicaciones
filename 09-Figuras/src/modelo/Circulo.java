package modelo;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Circulo implements Operaciones  {
	/**
	 * 
	 * @param d uso de varible en formtado double
	 * @return el area del circulo
	 */
	public static double Operaciones1(double d) {
		// TODO Auto-generated method stub
		return Math.PI * (Math.pow(d, 2));
	}
	/**
	 * 
	 * @param d uso de varible en formtado double
	 * @return el periemtro del circulo
	 */
	public  static double Operaciones(double d) {
		// TODO Auto-generated method stub
		return   2 * Math.PI * d;
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
