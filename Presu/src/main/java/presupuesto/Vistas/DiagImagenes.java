package presupuesto.Vistas;

import java.util.List;
import presupuesto.Controllers.CtrlPresupuestoDiag;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

public class DiagImagenes extends JDialog {
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JPanel jPanel1;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;

	public DiagImagenes(final Frame parent, final boolean modal) {
		super(parent, modal);
		this.initComponents();
		this.setLocationRelativeTo(null);
		this.llenarDatos();
		this.setVisible(true);
	}

	private void initComponents() {
		this.jPanel1 = new JPanel();
		this.jLabel1 = new JLabel();
		this.jLabel2 = new JLabel();
		this.jLabel3 = new JLabel();
		this.jLabel4 = new JLabel();
		this.jTextField1 = new JTextField();
		this.jTextField2 = new JTextField();
		this.jButton1 = new JButton();
		this.jLabel5 = new JLabel();
		this.jTextField3 = new JTextField();
		this.jLabel6 = new JLabel();
		this.jTextField4 = new JTextField();
		this.jLabel7 = new JLabel();
		this.jTextField5 = new JTextField();
		this.jLabel8 = new JLabel();
		this.jTextField6 = new JTextField();
		this.setDefaultCloseOperation(2);
		this.setTitle("Ocupación Unidades");
		this.jPanel1.setBackground(new Color(204, 204, 255));
		this.jLabel1.setFont(new Font("Tahoma", 1, 11));
		this.jLabel1.setForeground(new Color(102, 102, 255));
		this.jLabel1.setText("IMAGENOLOGIA");
		this.jLabel2.setBackground(new Color(102, 102, 255));
		this.jLabel2.setToolTipText("");
		this.jLabel2.setOpaque(true);
		this.jLabel3.setBackground(new Color(102, 102, 255));
		this.jLabel3.setFont(new Font("Tahoma", 1, 11));
		this.jLabel3.setForeground(new Color(102, 102, 255));
		this.jLabel3.setText("FLUOROSCOPIO");
		this.jLabel4.setFont(new Font("Tahoma", 1, 11));
		this.jLabel4.setForeground(new Color(102, 102, 255));
		this.jLabel4.setText("MAMOGRAFÍA");
		this.jTextField1.setEditable(false);
		this.jTextField1.setHorizontalAlignment(0);
		this.jTextField2.setEditable(false);
		this.jTextField2.setHorizontalAlignment(0);
		this.jButton1.setText("ACEPTAR");
		this.jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagImagenes.this.jButton1ActionPerformed(evt);
			}
		});
		this.jLabel5.setBackground(new Color(102, 102, 255));
		this.jLabel5.setFont(new Font("Tahoma", 1, 11));
		this.jLabel5.setForeground(new Color(102, 102, 255));
		this.jLabel5.setText("ECOGRAFÍA");
		this.jTextField3.setEditable(false);
		this.jTextField3.setHorizontalAlignment(0);
		this.jLabel6.setBackground(new Color(102, 102, 255));
		this.jLabel6.setFont(new Font("Tahoma", 1, 11));
		this.jLabel6.setForeground(new Color(102, 102, 255));
		this.jLabel6.setText("PORTÁTILES");
		this.jTextField4.setEditable(false);
		this.jTextField4.setHorizontalAlignment(0);
		this.jLabel7.setBackground(new Color(102, 102, 255));
		this.jLabel7.setFont(new Font("Tahoma", 1, 11));
		this.jLabel7.setForeground(new Color(102, 102, 255));
		this.jLabel7.setText("TOMOGRAFÍAS");
		this.jTextField5.setEditable(false);
		this.jTextField5.setHorizontalAlignment(0);
		this.jLabel8.setFont(new Font("Tahoma", 1, 11));
		this.jLabel8.setForeground(new Color(102, 102, 255));
		this.jLabel8.setText("RAYOS X");
		this.jTextField6.setEditable(false);
		this.jTextField6.setHorizontalAlignment(0);
		final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addGroup(GroupLayout.Alignment.LEADING,
								jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5, -2, 160, -2)
										.addGap(48, 48, 48).addComponent(this.jTextField3))
						.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(this.jLabel4, -1, -1, 32767)
										.addComponent(this.jLabel3, -1, 160, 32767))
								.addGap(48, 48, 48)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jTextField2, -2, 100, -2)
										.addComponent(this.jTextField1, -2, 100, -2)))))
				.addGroup(jPanel1Layout
						.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel1, -2, 119, -2))
				.addComponent(this.jLabel2, -2, 362, -2)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addGroup(GroupLayout.Alignment.LEADING,
								jPanel1Layout.createSequentialGroup().addComponent(this.jLabel6, -2, 160, -2)
										.addGap(48, 48, 48).addComponent(this.jTextField4))
						.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(this.jLabel8, -1, -1, 32767)
										.addComponent(this.jLabel7, -2, 160, -2))
								.addGap(48, 48, 48)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jTextField6, -2, 100, -2)
										.addComponent(this.jTextField5, -2, 100, -2)
										.addComponent(this.jButton1, -2, 100, -2))))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11)
						.addComponent(this.jLabel1, -2, 32, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel2, -2, 3, -2)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField3, -2, 25, -2).addComponent(this.jLabel5, -2, 28, -2))
						.addGap(3, 3, 3)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField1, -2, 25, -2).addComponent(this.jLabel3, -2, 28, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField2, -2, 25, -2).addComponent(this.jLabel4, -2, 28, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField4, -2, 25, -2).addComponent(this.jLabel6, -2, 28, -2))
						.addGap(3, 3, 3)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField5, -2, 25, -2).addComponent(this.jLabel7, -2, 28, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jTextField6, -2, 25, -2).addComponent(this.jLabel8, -2, 28, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jButton1, -2, 30, -2).addContainerGap(12, 32767)));
		final GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
		this.pack();
	}

	private void jButton1ActionPerformed(final ActionEvent evt) {
		this.dispose();
	}

	public void llenarDatos() {
		final CtrlPresupuestoDiag cp = new CtrlPresupuestoDiag();
		final List<Double[]> datos = cp.consultarImagenes();
		Double[] val = null;
		final String mensaje = "";
		val = datos.get(0);
		this.jTextField3.setText(cp.valorFormateado((double) val[0]));
		val = datos.get(1);
		this.jTextField1.setText(cp.valorFormateado((double) val[0]));
		val = datos.get(2);
		this.jTextField2.setText(cp.valorFormateado((double) val[0]));
		val = datos.get(3);
		this.jTextField4.setText(cp.valorFormateado((double) val[0]));
		val = datos.get(5);
		this.jTextField5.setText(cp.valorFormateado((double) val[0]));
		val = datos.get(4);
		this.jTextField6.setText(cp.valorFormateado((double) val[0]));
	}
}
