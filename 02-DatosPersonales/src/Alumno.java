/**
 * 
 * @author AleALe Mtz 
 *
 */
public class Alumno {
	private String nombre;
	private String app;
	private String apm;
	private String edad;
	private String telefono;
	private String genero;
	private String curp;
	private String nacimiento;
	private String municipio;
	private String nacionalidad;
	/**
	 * Constructor sin parametros 
	 */
	//metodo por defecto
	public Alumno (){}
	
	/**
	 * 
	 * @param nombre el formato es string 
	 * @param app el formato es string
	 * @param apm el formato es string
	 * @param edad el formato es string
	 * @param telefono el formato es string
	 * @param genero el formato es string
	 * @param curp el formato es string
	 * @param nacimiento el formato es string
	 * @param municipio el formato es string
	 * @param nacionalidad el formato es string
	 */
	//shift + alt+s general constructor using fields
	public Alumno(String nombre, String app, String apm, String edad, String telefono, String genero, String curp,
			String nacimiento, String municipio, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.edad = edad;
		this.telefono = telefono;
		this.genero = genero;
		this.curp = curp;
		this.nacimiento = nacimiento;
		this.municipio = municipio;
		this.nacionalidad = nacionalidad;
	}
	//shift + alt+s general generate getter and setter
	/**
	 * 
	 * @return regresa el nombre de tipo String
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre introduce el nombre en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return regresa la edad de tipo String
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad introduce su edad en formato String
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return regresa el telefono de tipo String

	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono introduce su telefono  en formato String 	
	 * 
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return regresa el apellido paterno de tipo String
	 */
	public String getApp() {
		return app;
	}
	/**
	 * 
	 * @param app introduce su apellido paterno en formato String
	 */
	public void setApp(String app) {
		this.app = app;
	}
	/**
	 * 
	 * @return regresa el apellido materno de tipo String
	 */
	public String getApm() {
		return apm;
	}
	/**
	 * 
	 * @param apm introduce su apellido materno en formato String
	 */
	public void setApm(String apm) {
		this.apm = apm;
	}
	/**
	 * 
	 * @return regresa el genero de tipo String
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * 
	 * @param genero introduce el genero en formato String
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * 
	 * @return regresa el curp de tipo String
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * 
	 * @param curp introduce la curp en formato String
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * 
	 * @return regresa su fecha de nacimiento en formato String
	 */
	public String getNacimiento() {
		return nacimiento;
	}
	/**
	 * 
	 * @param nacimiento introduce su fecha de nacimiento en formato String
	 */
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	/**
	 * 
	 * @return regresa  el municipio de tipo String
	 */
	public String getMunicipio () {
		return municipio ;
	}
	/**
	 * 
	 * @param introduce su municipio en formato String 
	 */
	public void setMunicipio (String municipio ) {
		this.municipio = municipio ;
	}
	/**
	 * 
	 * @return  regresa  la nacionalidad de tipo String
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * 
	 * @param introduce su nacionalidad en formato String
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
