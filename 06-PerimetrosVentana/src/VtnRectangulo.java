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
public class VtnRectangulo extends JFrame implements ActionListener{
		
		public JFrame vtn;
		private JLabel lbTitulo = new JLabel("El perimetro de un Rectangulo es P=2(a+b)");
		private JLabel lblA = new JLabel("Lado a");
		private JLabel lblB = new JLabel("Lado b");
		private JTextField txtN1 = new JTextField();
		private JTextField txtN2 = new JTextField();
		private JLabel lbResultado = new JLabel("Resultado");
		private JButton btnCalcular = new JButton("Calcular"); 
		private JButton btnRegresar = new JButton("Regresar"); 
		private Container c= getContentPane();
		private Operaciones op = new Operaciones();
		
		/**
		 * Declaracion de la ventana
		 */
		public VtnRectangulo(){
			super.setTitle("Perimetro de un Rectangulo");
			super.setSize(360,290);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();		
		}
		
		private void cargarControles() {
			c.setLayout(null);
			//(x, y, width, heigh)
			lbTitulo.setBounds(10, 10, 350, 35);
			lblA.setBounds(30,40,60,35);
			txtN1.setBounds(75, 40, 260, 35);
			lblB.setBounds(30, 80, 260, 35);
			txtN2.setBounds(75, 80, 260, 35);
			lbResultado.setBounds(30,120,290,35);
			btnCalcular.setBounds(30,160,290,35);
			btnRegresar.setBounds(30,200,290,35);
			c.add(lbTitulo);
			c.add(lblA);
			c.add(txtN1);
			c.add(lblB);
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
		public void operacion(){
					int r = op.perimetroRectangulo(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
					lbResultado.setText(String.format("Lado a  %s m. + lado b  %s m. * 2 = %d m." ,txtN1.getText(),txtN2.getText(),r));
		}
		public void Regresar(){
			vtn = new Ventana();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
		}
}
