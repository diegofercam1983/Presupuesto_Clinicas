package presupuesto.Vistas;

import presupuesto.Controllers.CtrlPresupuestoDiag;
import javax.swing.LayoutStyle;
//import java.awt.LayoutManager;
//import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
//import javax.swing.Icon;
//import java.awt.Image;
import javax.swing.ImageIcon;
//import java.awt.Component;
import java.awt.Frame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.image.BufferedImage;
import javax.swing.JDialog;

public class DiagCirugia extends JDialog {
	GraficaCirugia gc;
	BufferedImage grafico;
	double valor1;
	double valor2;
	double valor3;
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JPanel jPanel1;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;

	public DiagCirugia(final Frame parent, final boolean modal) {
		super(parent, modal);
		this.initComponents();
		this.setLocationRelativeTo(null);
		this.llenarDatos();
		this.gc = new GraficaCirugia();
		this.grafico = this.gc.GraficaCir(this.valor1, this.valor2, this.valor3);
		this.jLabel6.setIcon(new ImageIcon(this.grafico));
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
		this.setDefaultCloseOperation(2);
		this.setTitle("Ocupación Unidades");
		this.jPanel1.setBackground(new Color(204, 204, 255));
		this.jLabel1.setFont(new Font("Tahoma", 1, 11));
		this.jLabel1.setForeground(new Color(102, 102, 255));
		this.jLabel1.setText("CIRUGIA");
		this.jLabel2.setBackground(new Color(102, 102, 255));
		this.jLabel2.setToolTipText("");
		this.jLabel2.setOpaque(true);
		this.jLabel3.setBackground(new Color(102, 102, 255));
		this.jLabel3.setFont(new Font("Tahoma", 1, 11));
		this.jLabel3.setForeground(new Color(102, 102, 255));
		this.jLabel3.setText("MEDIA COMPLEJIDAD");
		this.jLabel4.setFont(new Font("Tahoma", 1, 11));
		this.jLabel4.setForeground(new Color(102, 102, 255));
		this.jLabel4.setText("BAJA COMPLEJIDAD");
		this.jTextField1.setEditable(false);
		this.jTextField1.setHorizontalAlignment(0);
		this.jTextField1.setText("0");
		this.jTextField2.setEditable(false);
		this.jTextField2.setHorizontalAlignment(0);
		this.jTextField2.setText("0");
		this.jButton1.setText("ACEPTAR");
		this.jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagCirugia.this.jButton1ActionPerformed(evt);
			}
		});
		this.jLabel5.setBackground(new Color(102, 102, 255));
		this.jLabel5.setFont(new Font("Tahoma", 1, 11));
		this.jLabel5.setForeground(new Color(102, 102, 255));
		this.jLabel5.setText("ALTA COMPLEJIDAD");
		this.jTextField3.setEditable(false);
		this.jTextField3.setHorizontalAlignment(0);
		this.jTextField3.setText("0");
		final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel1,
								-2, 119, -2))
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addContainerGap()
												.addComponent(this.jLabel5, -2, 128, -2).addGap(80, 80, 80)
												.addComponent(this.jTextField3))
								.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10)
														.addComponent(this.jLabel4))
												.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
														.addComponent(this.jLabel3, -2, 128, -2)))
										.addGap(80, 80, 80)
										.addGroup(jPanel1Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(this.jButton1, -1, 100, 32767)
												.addComponent(this.jTextField1).addComponent(this.jTextField2)))))
						.addGap(32, 32, 32).addComponent(this.jLabel6, -1, 176, 32767).addContainerGap())
				.addComponent(this.jLabel2, -1, -1, 32767));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11)
						.addComponent(this.jLabel1, -2, 32, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel2, -2, 3, -2)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField3, -2, 25, -2)
												.addComponent(this.jLabel5, -2, 28, -2))
										.addGap(3, 3, 3)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27)
														.addComponent(this.jLabel4, -2, 28, -2))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.BASELINE)
																.addComponent(this.jTextField1, -2, 25, -2)
																.addComponent(this.jLabel3, -2, 28, -2))
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jTextField2, -2, 25, -2)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jButton1, -2, 35, -2))
								.addComponent(this.jLabel6, -1, -1, 32767))
						.addContainerGap(21, 32767)));
		final GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
		this.pack();
	}

	private void jButton1ActionPerformed(final ActionEvent evt) {
		this.dispose();
	}

	public void llenarDatos() {
		final CtrlPresupuestoDiag cp = new CtrlPresupuestoDiag();
		this.valor1 = cp.consultarCirugia(3);
		this.valor2 = cp.consultarCirugia(2) + 9.0;
		this.valor3 = cp.consultarCirugia(1) + 39.0;
		this.jTextField3.setText(cp.valorFormateado(this.valor1));
		this.jTextField1.setText(cp.valorFormateado(this.valor2));
		this.jTextField2.setText(cp.valorFormateado(this.valor3));
	}
}