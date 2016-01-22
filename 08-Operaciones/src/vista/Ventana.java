package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Operaciones;
import modelo.Resta;
import modelo.Suma;
/**
 * 
 * @author AleAle Mtz
 *
 */
public class Ventana extends JFrame implements ActionListener {
	 //creacion de etiquetas,cajas de texto y botones
	private JLabel lblN1 = new JLabel("Numero 1");
	private JLabel lblN2 = new JLabel("Numero 2");
	private JLabel lblResultado = new JLabel("Resultado");
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	private JButton btnDiv= new JButton("/");
	private JButton btnSum= new JButton("+");
	private JButton btnRes=new JButton("-");
	private JButton btnMul=new JButton("*");
	private Container c=getContentPane();
	
	private Suma su= new Suma();
	private Resta re= new Resta();
	private Multiplicacion mu=new Multiplicacion();
	private Division di=new Division();
	//atributos de la ventana
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(350, 250);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	//coocar y ajustar etiquetas, cajas de texto y botones en la ventana
	public void cargarControles(){
		c.setLayout(null);
		lblN1.setBounds(30, 30, 100, 35);
		txtN1.setBounds(30, 60, 115, 35);
		lblN2.setBounds(184, 30, 100, 35);
		txtN2.setBounds(169, 60, 115, 35);
		btnSum.setBounds(89, 110, 67, 35);
		btnRes.setBounds(30, 110, 60, 35);
		btnMul.setBounds(155, 110, 70, 35);
		btnDiv.setBounds(224, 110, 60, 35);
		lblResultado.setBounds(30, 166,300, 35);
		
		c.add(lblN1);
		c.add(lblN2);
		c.add(lblResultado);
		c.add(txtN2);
		c.add(txtN1);
		c.add(btnDiv);
		c.add(btnMul);
		c.add(btnRes);
		c.add(btnSum);
		
		btnSum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Sumar();
			}
			/**
			 * metodo para sumar
			 */
			private void Sumar() {
				// TODO Auto-generated method stub
				int suma=su.operaciones(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lblResultado.setText(String.format("%s  +  %s  = % d ",txtN1.getText(),txtN2.getText(),suma));
			}
		});
		
		btnRes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Resta();
				
			}
			/**
			 * metodo para restar
			 */
			private void Resta() {
				// TODO Auto-generated method stub
				int resta=re.operaciones(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lblResultado.setText(String.format("%s  -  %s  = % d ",txtN1.getText(),txtN2.getText(),resta));
			}
			
		});
		
		btnMul.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Multiplicacion();
				
			}
			/**
			 * metodo para multiplicar
			 */
			private void Multiplicacion() {
				// TODO Auto-generated method stub
				int Multiplicacion=mu.operaciones(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lblResultado.setText(String.format("%s  x  %s  = % d ",txtN1.getText(),txtN2.getText(),Multiplicacion));
			}
			
		});
		
		btnDiv.addActionListener(new ActionListener(){
						@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Division();
				
			}
			/**
		     * metodo para dividir
		     */

			private void Division() {
				// TODO Auto-generated method stub
				//int Division=di.operaciones(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				double Division = di.operaciones(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()));
				lblResultado.setText(String.format("%s  /  %s  = %f ",txtN1.getText(),txtN2.getText(),Division));
			}
			
		});
		
	}
	/**
	 * metodo vacio
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
