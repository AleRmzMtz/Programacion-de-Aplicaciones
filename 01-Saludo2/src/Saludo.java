import javax.swing.JOptionPane;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Saludo {
	/**
	 * 
	 * @param args son los datos que recibe el metodo con los cuales se trabajara
	 */
	//ctrl + espacio = metodo main
	public static void main(String[] args) {
		String nombre = "Ale Martinez"; 
		//System.out.println("Hola: " + nombre);
		//System.out.printf("Hola: %s", nombre);
		String edad = "22";
		//instruccion de mensaje con datos obtenidos de %
		JOptionPane.showMessageDialog(null,String.format("Hola:\n %s \n Tu edad es de: \n %s años de edad ",nombre,edad));
	}
}
