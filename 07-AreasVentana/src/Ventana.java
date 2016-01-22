import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author AleAle Mtz.
 *
 */
public class Ventana extends JFrame implements ActionListener{
	
	public JFrame vtn;
	private JLabel lbE1 = new JLabel("Selecciona la figura para saber su area:");
	private JButton btnCuadrado = new JButton("Cuadrado"); 
	private JButton btnRectangulo = new JButton("Rectangulo"); 
	private JButton btnTriangulo = new JButton("Triangulo"); 
	private JButton btnCirculo = new JButton("Circulo"); 
	private JButton btnCerrar = new JButton("Salir"); 
	private Container c= getContentPane();
	
	/**
	 * Declaracion de la ventana
	 */
	public Ventana(){
		super.setTitle("Areas");
		super.setSize(320,300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();		
	}
	private void cargarControles() {
		c.setLayout(null);
		//(x, y, width, heigh)
		lbE1.setBounds(10, 10, 290, 35);
		btnCuadrado.setBounds(10, 50, 290, 35);
		btnRectangulo.setBounds(10, 95, 290, 35);
		btnTriangulo.setBounds(10,140, 290,35);
		btnCirculo.setBounds(10,185,290,35);
		btnCerrar.setBounds(220,225,80,35);
		c.add(lbE1);
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);
		c.add(btnCerrar);
		
		btnCuadrado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaCuadrado();
			}
		});
		btnRectangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaRectangulo();
			}
		});
		btnTriangulo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaTriangulo();
			}
		});
		btnCirculo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abrirVentanaCirculo();
			}
		});
		btnCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cerrarVentana();
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		public void abrirVentanaCuadrado(){
		vtn = new VtnCuadrado();
		vtn.setVisible(true);
		this.setVisible(false);
		}
		public void abrirVentanaRectangulo(){
			vtn = new VtnRectangulo();
			vtn.setVisible(true);
			this.setVisible(false);
			}
		public void abrirVentanaTriangulo(){
			vtn = new VtnTriangulo();
			vtn.setVisible(true);
			this.setVisible(false);
			}
		public void abrirVentanaCirculo(){
			vtn = new VtnCirculo();
			vtn.setVisible(true);
			this.setVisible(false);
			}
		public void cerrarVentana(){
			System.exit(0);
			}
}
