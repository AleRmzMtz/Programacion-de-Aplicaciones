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
		private JLabel lbTitulo = new JLabel("El perimetro de un Triangulo P=Lado + Lado +Lado" );
		private JTextField txtN1= new JTextField();
		private JLabel lbResultado = new JLabel("Resultado");
		private JButton btnCalcular = new JButton("Calcular"); 
		private JButton btnRegresar = new JButton("Regresar"); 
		private Container c= getContentPane();
		private Operaciones op = new Operaciones();
		private JTextField txtN2 = new JTextField();
		private JTextField txtN3 =new JTextField();
		private JLabel lblLadoB = new JLabel("Lado B");
		private 	JLabel lblLadoC = new JLabel("Lado C");
		private JLabel lblLadoA = new JLabel("Lado A");
		
		/**
		 * Declaracion de la ventana
		 */
		public VtnTriangulo(){
			super.setTitle("Perimetro de un Cuadrado");
			super.setSize(400,400);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();		
		}
		private void cargarControles() {
			c.setLayout(null);
			//(x, y, width, heigh)
			lbTitulo.setBounds(14, 0, 320, 35);
			txtN1.setBounds(30, 58, 290, 35);
			lbResultado.setBounds(30,228,380,23);
			btnCalcular.setBounds(34,256,290,35);
			btnRegresar.setBounds(34,296,290,35);
			txtN2.setBounds(30, 120, 290, 35);
			lblLadoB.setBounds(30, 95, 290, 23);
			txtN3.setBounds(30, 185, 290, 35);
			lblLadoC.setBounds(30, 166, 46, 14);
			lblLadoA.setBounds(30, 33, 46, 14);
			c.add(lblLadoA);
			c.add(lblLadoC);
			c.add(txtN3);
			c.add(lbTitulo);
			c.add(txtN1);
			c.add(lbResultado);
			c.add(btnCalcular);
			c.add(btnRegresar);
			c.add(txtN2);
			c.add(lblLadoB);
			
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
					int s = op.perimetroTriangulo(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()),Integer.parseInt(txtN3.getText()));
					lbResultado.setText(String.format("Lado a %s m. + Lado b %s m. + Lado c %s m. es igual a  %d m." ,txtN1.getText(),txtN2.getText(),txtN3.getText(),s));
		}
		public void Regresar(){
			vtn = new Ventana();
			vtn.setVisible(true);
			this.setVisible(false);
		}
}
