package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author AleAle
 *
 */
public class Ventana extends JFrame implements ActionListener {
	//creacion de etiquetas,cajas de texto y botones
	public JFrame vtn;
	private JLabel lblN1 = new JLabel("Selecciona una opcion");
	private JButton btnCu= new JButton("Cuadrado");
	private JButton btnCi= new JButton("Circulo");
	private JButton btnRe=new JButton("Rectangulo");
	private JButton btnTr=new JButton("Triangulo");
	private JButton btnsalir = new JButton("Salir");
	private Container c=getContentPane();
	
	//atributos de la ventana
	public Ventana(){
		super.setTitle("Bienvenido");
		super.setSize(370, 380);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	//colocar y ajustar etiquetas, cajas de texto y botones en la ventana
	public void cargarControles(){
		c.setLayout(null);
		lblN1.setBounds(30, 20, 300, 35);
		btnCu.setBounds(30, 60, 300, 35);
		btnRe.setBounds(30, 120, 300, 35);
		btnCi.setBounds(30, 180, 300, 35);
		btnTr.setBounds(30, 240, 300, 35);
		btnsalir.setBounds(241, 297, 89, 29);
			
		c.add(lblN1);
		c.add(btnCu);
		c.add(btnCi);
		c.add(btnRe);
		c.add(btnTr);
		c.add(btnsalir);
		
		btnsalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				salir();
			}

		});
		btnCu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cuadrado();
			}

		});
			
		btnRe.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				rectangulo();
				
			}
		});
		
		btnTr.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				triangulo();
				
			}			
		});
		
		btnCi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				circulo();
				
			}
			
		});
		
	}
	//metodo vacio
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//metodo para abrir la ventana VtnCuadrado
	public void cuadrado() {
		// TODO Auto-generated method stub
		vtn = new VtnCuadrado();
		vtn.setVisible(true);
		this.setVisible(false);
	}
	//metodo para abrir la ventana VtnRectangulo
	public void rectangulo() {
		// TODO Auto-generated method stub
		vtn = new VtnRectangulo();
		vtn.setVisible(true);
		this.setVisible(false);
	}
	//metodo para abrir la ventana Vtncirculo 
	public void circulo() {
		// TODO Auto-generated method stub
		vtn = new VtnCirculo();
		vtn.setVisible(true);
		this.setVisible(false);
	}
	//metodo para abrir la ventana VtnTriangulo
	public void triangulo() {
		// TODO Auto-generated method stub
		vtn = new VtnTriangulo();
		vtn.setVisible(true);
		this.setVisible(false);
	}
	//metodo para cerrar la ventana
	public void salir(){
		System.exit(0);
		}
}
