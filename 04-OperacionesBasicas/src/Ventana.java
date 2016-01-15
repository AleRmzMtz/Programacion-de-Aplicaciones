import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Ventana extends JFrame implements ActionListener{
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("Numero 1");
	private JLabel lbN2 = new JLabel("Numero 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnSuma = new JButton("Suma");
	private JButton btnResta = new JButton("Resta"); 
	private JButton btnMultiplicacion = new JButton("Multiplicacion"); 
	private JButton btnDivision = new JButton("Division"); 
	private Container c= getContentPane();
	private Operaciones op = new Operaciones();
	/**
	 * Declaracion de la ventana
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
		
	}
	/**
	 * declaracion  de atributos de labels,txts y buttons
	 */
	private void cargarControles() {
		c.setLayout(null);
		//(x, y, width, heigh)
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 290, 30);
		lbN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 290, 30);
		btnSuma.setBounds(30, 150, 120, 35);
		btnResta.setBounds(160, 150, 120, 35);
		btnMultiplicacion.setBounds(30, 190,120, 35);
		btnDivision.setBounds(160, 190, 120, 35);
		lbResultado.setBounds(10, 250, 300, 30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivision);
		c.add(lbResultado);
		/**
		 * action para llamar el metodo sumar
		 */
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sumar();
			}
			});
		/**
		 * action para llamar el metodo restar
		 */
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restar();
			}
			});
		/**
		 * action para llamar el metodo multiplicar
		 */
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Multiplicar();
			}
			});
		/**
		 * action para llamar el metodo dividir
		 */
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dividir();
			}
			});	
	}
	/**
	 * metodo sin parametros
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
			}
	/**
	 * metodo de sumar
	 */
	public void Sumar(){
		//opcion de sumar 
				int s = op.sumar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s + %s = %d" ,txtN1.getText(),txtN2.getText(),s));
	}
	/**
	 * metodo de restar
	 */
	public void Restar(){
		//opcion de restar
				int r = op.restar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s - %s = %d" ,txtN1.getText(),txtN2.getText(),r));
	}
	/**
	 * metodo de multiplicar
	 */
	public void Multiplicar(){
		//opcion de Multiplicar
				int m = op.multiplicar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s * %s = %d" ,txtN1.getText(),txtN2.getText(),m));
	}
	/**
	 * metodo de dividir
	 */
	public void Dividir(){
		//opcion de dividir
				int d = op.dividir(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s / %s = %d" ,txtN1.getText(),txtN2.getText(),d));
	}
}
