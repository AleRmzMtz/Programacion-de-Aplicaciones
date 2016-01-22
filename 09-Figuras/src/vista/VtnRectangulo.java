package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Cuadrado;
import modelo.Rectangulo;
/**
 * 
 * @author AleAle
 *
 */
public class VtnRectangulo extends JFrame {
	//creacion de etiquetas,cajas de texto y botones
	public JFrame vtn;
	private JLabel lblN1 = new JLabel("Rectangulo");
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	private JButton btnperimetro=new JButton("Calcular Perimetro");
	private JButton btnarea=new JButton("Calcular Area");
	private JButton btnRegresa=new JButton("Regresar");
	private JLabel lblResultado1 = new JLabel("Resultado Perimetro");
	private JLabel lblResultado2 = new JLabel("Resultado area");
	private JLabel lblNumeroN = new JLabel("Numero N\u00B01");
	JLabel lblNumeroN_1 = new JLabel("Numero N\u00B02");
	private Container c=getContentPane();
	
	private Rectangulo rec =  new Rectangulo();
	//atributos de la ventana
	public VtnRectangulo(){
		super.setTitle("Operaciones");
		super.setSize(370, 370);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	//colocar y ajustar etiquetas, cajas de texto y botones en la ventana
	public void cargarControles(){
		c.setLayout(null);
		lblN1.setBounds(10, 0, 80, 35);
		txtN1.setBounds(30, 59, 300, 35);
		btnperimetro.setBounds(30, 173, 150, 35);
		txtN2.setBounds(30, 127, 300, 35);
		btnarea.setBounds(180, 173, 150, 35);
		lblResultado1.setBounds(30, 223, 150, 35);
		lblResultado2.setBounds(180, 219, 150, 35);
		btnRegresa.setBounds(30,272,300,35);
		lblNumeroN.setBounds(30, 34, 300, 14);
		lblNumeroN_1.setBounds(30, 102, 300, 14);
			
		c.add(lblN1);
		c.add(btnarea);
		c.add(btnperimetro);
		c.add(lblResultado1);
		c.add(lblResultado2);
		c.add(txtN1);
		c.add(txtN2);
		c.add(btnRegresa);
		c.add(lblNumeroN);
		c.add(lblNumeroN_1);
	
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
		double rec =Rectangulo.Operacione1(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()));
		lblResultado2.setText(String.format("Area: %f ",rec));
	}
	//metodo para obtener el perimetro
	public void perimetro(){
		double rec =Rectangulo.Operaciones(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()));
		lblResultado1.setText(String.format("Perimetro: %f ",rec));
	}
}
