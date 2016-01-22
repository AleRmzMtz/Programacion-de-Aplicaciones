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
public class VtnCirculo extends JFrame implements ActionListener{
		
		public JFrame vtn;
		private JLabel lbTitulo = new JLabel("Area de un Circulo");
		private JLabel lblDiametro = new JLabel("Radio");
		private JTextField txtN1= new JTextField();
		private JLabel lbResultado = new JLabel("Resultado");
		private JButton btnCalcular = new JButton("Calcular"); 
		private JButton btnRegresar = new JButton("Regresar"); 
		private Container c= getContentPane();
		private Operaciones op = new Operaciones();
		
		/**
		 * Declaracion de la ventana
		 */
		public VtnCirculo(){
			super.setTitle("Perimetro de un Cuadrado");
			super.setSize(360,250);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();		
		}
		
		private void cargarControles() {
			c.setLayout(null);
			//(x, y, width, heigh)
			lbTitulo.setBounds(30, 10, 350, 35);
			lblDiametro.setBounds(30,50,70,35);
			txtN1.setBounds(95, 50, 200, 35);
			lbResultado.setBounds(30,90,320,35);
			btnCalcular.setBounds(30,130,290,35);
			btnRegresar.setBounds(30,170,290,35);
			c.add(lbTitulo);
			c.add(lblDiametro);
			c.add(txtN1);
			c.add(lbResultado);
			c.add(btnCalcular);
			c.add(btnRegresar);
			
			btnCalcular.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 operacion();
				}
			});
			btnRegresar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 Regresar();
				}
			});
			
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		public void operacion(){
			double cir =op.areaCirculo(Double.parseDouble((txtN1.getText())));
			lbResultado.setText(String.format("El area del circulo es;  %f m." ,cir));
		}
		public void Regresar(){
			vtn = new Ventana();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		
}