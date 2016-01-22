package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Circulo;
import modelo.Cuadrado;
/**
 * 
 * @author AleAle
 *
 */
public class VtnCirculo extends JFrame {
	//creacion de etiquetas,cajas de texto y botones
	public JFrame vtn;
	private JLabel lblN1 = new JLabel("Circulo");
	private JTextField txtN1 = new JTextField();
	private JButton btnperimetro=new JButton("Calcular Perimetro");
	private JButton btnarea=new JButton("Calcular Area");
	private JButton btnRegresa=new JButton("Regresar");
	private JLabel lblResultado1 = new JLabel("Resultado Perimetro");
	private JLabel lblResultado2 = new JLabel("Resultado area");
	private JLabel lblNumeroN = new JLabel("Numero N\u00B01");
	private Container c=getContentPane();
	
	private Circulo cir = new Circulo();
	//atributos de la ventana
	public VtnCirculo(){
		super.setTitle("Operaciones");
		super.setSize(370, 295);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	//colocar y ajustar etiquetas, cajas de texto y botones en la ventana
	public void cargarControles(){
		c.setLayout(null);
		lblN1.setBounds(10, 0, 80, 35);
		txtN1.setBounds(30, 59, 300, 35);
		btnperimetro.setBounds(30, 105, 150, 35);
		btnarea.setBounds(180, 105, 150, 35);
		lblResultado1.setBounds(30, 155, 150, 35);
		lblResultado2.setBounds(180, 151, 150, 35);
		btnRegresa.setBounds(30,204,300,35);
		lblNumeroN.setBounds(30, 34, 300, 14);
			
		c.add(lblN1);
		c.add(btnarea);
		c.add(btnperimetro);
		c.add(lblResultado1);
		c.add(lblResultado2);
		c.add(txtN1);
		c.add(btnRegresa);
		c.add(lblNumeroN);
	
		btnRegresa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Regresa();
			}
		});
		
		btnarea.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				area();
			}
		});
		
		btnperimetro.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				perimetro();
				
			}
		});
	}
	//metodo vacio
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//metodo para regresar a menu principal
	public void Regresa (){
		vtn = new Ventana();
		vtn.setVisible(true);
		this.setVisible(false);
	}
	//metodo para obtener el area
	public void area(){
		double cir =Circulo.Operaciones1(Double.parseDouble(txtN1.getText()));
		lblResultado2.setText(String.format("Area: %f ",cir));
	}
	//metodo para obtener el perimetro
	public void perimetro(){
		double cir =Circulo.Operaciones(Double.parseDouble(txtN1.getText()));
		lblResultado1.setText(String.format("Perimetro: %f ",cir));
	}
}
