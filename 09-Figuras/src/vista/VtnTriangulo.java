package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Rectangulo;
import modelo.Triangulo;
/**
 * 
 * @author AleAle
 *
 */
public class VtnTriangulo extends JFrame {
	//creacion de etiquetas,cajas de texto y botones
	public JFrame vtn;
	private JLabel lblN1 = new JLabel("Triangulo");
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	private JTextField txtN3 = new JTextField(); 
	private JButton btnperimetro=new JButton("Calcular Perimetro");
	private JButton btnarea=new JButton("Calcular Area");
	private JButton btnRegresa=new JButton("Regresar");
	private JLabel lblResultado1 = new JLabel("Resultado Perimetro");
	private JLabel lblResultado2 = new JLabel("Resultado area");
	private JLabel lblNumeroN = new JLabel("Numero N\u00B01");
	JLabel lblNumeroN_1 = new JLabel("Numero N\u00B02");
	private final JLabel lblNumeroN_2 = new JLabel("Numero N\u00B03");
	private Container c=getContentPane();
	
	private Triangulo tr = new Triangulo();
	private final JLabel lblBase = new JLabel("Base");
	private final JLabel lblAltura = new JLabel("Altura");
	//atributos de la ventana
	public VtnTriangulo(){
		super.setTitle("Operaciones");
		super.setSize(370, 450);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	//colocar y ajustar etiquetas, cajas de texto y botones en la ventana
	public void cargarControles(){
		c.setLayout(null);
		lblN1.setBounds(10, 0, 80, 35);
		txtN1.setBounds(30, 59, 300, 35);
		btnperimetro.setBounds(30, 253, 150, 35);
		txtN2.setBounds(30, 127, 300, 35);
		btnarea.setBounds(180, 253, 150, 35);
		lblResultado1.setBounds(30, 303, 150, 35);
		lblResultado2.setBounds(180, 299, 150, 35);
		btnRegresa.setBounds(30,352,300,35);
		lblNumeroN.setBounds(30, 34, 300, 14);
		lblNumeroN_1.setBounds(30, 102, 300, 14);
		lblNumeroN_2.setBounds(30, 173, 300, 14);
		txtN3.setBounds(30, 192, 300, 35);
			
		c.add(lblN1);
		c.add(btnarea);
		c.add(btnperimetro);
		c.add(lblResultado1);
		c.add(lblResultado2);
		c.add(txtN1);
		c.add(txtN2);
		c.add(txtN3);
		c.add(btnRegresa);
		c.add(lblNumeroN);
		c.add(lblNumeroN_1);
		c.add(lblNumeroN_2);
		lblBase.setBounds(225, 34, 46, 14);
		
		getContentPane().add(lblBase);
		lblAltura.setBounds(225, 102, 46, 14);
		
		getContentPane().add(lblAltura);
	
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
		double tr =Triangulo.Operaciones1(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()));
		lblResultado2.setText(String.format("Area: %f ",tr));
		txtN3.setText("");
	}
	//metodo para obtener el perimetro
	public void perimetro(){
		double tr =Triangulo.Operaciones(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()),Double.parseDouble(txtN3.getText()));
		lblResultado1.setText(String.format("Perimetro: %f ",tr));
	}
}
