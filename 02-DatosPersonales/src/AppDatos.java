import javax.swing.JOptionPane;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class AppDatos {
	/**
	 * 
	 * @param args se crea un objeto de la clase Alumno con los datos que recibe el metodo con los cuales se trabajara
	 */
	public static void main(String[] args) {
		Alumno al = new Alumno ("aLe","Ramirez","Martinez", "22", "5521101151","Masculino", "RAME930610HMCMRM03", "10-06-1993", "Ecatepec", "Mexicana");
		JOptionPane.showMessageDialog(null,
				String.format("Hola %s \n Tus apellidos son %s %s \n Tu edad es %s \n Tu telefono celular es %s \n Tu genero es %s \n Tu CURP es %s \n Tu fecha de nacimiento es %s \n Tu municipio es %s \n Tu nacionalidad es %s",al.getNombre(),al.getApp(),al.getApm(),al.getEdad(),al.getTelefono(),al.getGenero(),al.getCurp(),al.getNacimiento(),al.getMunicipio(),al.getNacionalidad()));  
		
	}
}
