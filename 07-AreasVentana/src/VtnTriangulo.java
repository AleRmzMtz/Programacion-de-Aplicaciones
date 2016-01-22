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
public class VtnTriangulo extends JFrame implements ActionListener{
		
		public JFrame vtn;
		private JLabel lbTitulo = new JLabel("El area de un Triangulo bxa/2" );
		private JTextField txtN1= new JTextField();
		private JTextField txtN2= new JTextField();
		private JLabel lbResultado = new JLabel("Resultado");
		private JButton btnCalcular = new JButton("Calcular"); 
		private JButton btnRegresar = new JButton("Regresar"); 
		private Container c= getContentPane();
		private Operaciones op = new Operaciones();
		
		/**
		 * Declaracion de la ventana
		 */
		public VtnTriangulo(){
			super.setTitle("Area de un Cuadrado");
			super.setSize(360,300);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();		
		}
		
		private void cargarControles() {
			c.setLayout(null);
			//(x, y, width, heigh)
			lbTitulo.setBounds(5, 10, 350, 35);
			txtN1.setBounds(30, 40, 290, 35);
			txtN2.setBounds(30, 80, 290, 35);
			lbResultado.setBounds(10,120,320,35);
			btnCalcular.setBounds(30,160,290,35);
			btnRegresar.setBounds(30,200,290,35);
			c.add(lbTitulo);
			c.add(txtN1);
			c.add(txtN2);
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
			//opcion de sumar 
					int s = op.areaTriangulo(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
					lbResultado.setText(String.format("Base:  %s m.  Altura:  %s  sobre 2 es igual a  %d m." ,txtN1.getText(),txtN2.getText(),s));
		}
		public void Regresar(){
			vtn = new Ventana();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		
}
