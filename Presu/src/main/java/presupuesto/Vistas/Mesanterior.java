package presupuesto.Vistas;

import javax.swing.LayoutStyle;
import java.awt.Font;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.util.List;
import presupuesto.Controllers.CtrlPresupuestoDiag;
import javax.swing.Icon;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Frame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import javax.swing.JDialog;

public class Mesanterior extends JDialog {
	GraficaPqMesA gpma;
	BufferedImage grafico;
	double valor1;
	double valor2;
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

	public Mesanterior(final Frame parent, final boolean modal) {
		super(parent, modal);
		this.initComponents();
		this.llenarDatos();
		this.gpma = new GraficaPqMesA();
		this.grafico = this.gpma.GraficaPqv(this.valor1, this.valor2);
		this.jLabel5.setIcon(new ImageIcon(this.grafico));
	}

	public void llenarDatos() {
		final CtrlPresupuestoDiag cpd = new CtrlPresupuestoDiag();
		final List<Double[]> data = cpd.consultarDatosMesAnterior();
		final Double[] datos = data.get(0);
		this.jTextField1.setText(cpd.valorFormateado((double) datos[0]));
		this.jTextField2.setText(cpd.valorFormateado((double) datos[1]));
		final double diferencia = datos[1] - datos[0];
		this.jTextField3.setText(cpd.valorFormateado(diferencia));
		this.valor1 = datos[1];
		this.valor2 = datos[0];
	}

	private void initComponents() {
		this.jLabel1 = new JLabel();
		this.jLabel2 = new JLabel();
		this.jLabel3 = new JLabel();
		this.jLabel4 = new JLabel();
		this.jTextField1 = new JTextField();
		this.jTextField2 = new JTextField();
		this.jTextField3 = new JTextField();
		this.jPanel1 = new JPanel();
		this.jLabel5 = new JLabel();
		this.jLabel6 = new JLabel();
		this.setDefaultCloseOperation(2);
		this.setTitle("Datos Mes Anterior");
		this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/BannerAzul.png")));
		this.jLabel2.setText("PRESUPUESTO MES ANTERIOR");
		this.jLabel3.setText("FACTURACIÓN MES ANTERIOR");
		this.jLabel4.setText("DIRERENCIA ");
		this.jTextField1.setEditable(false);
		this.jTextField1.setForeground(Color.darkGray);
		this.jTextField1.setHorizontalAlignment(0);
		this.jTextField2.setEditable(false);
		this.jTextField2.setForeground(Color.darkGray);
		this.jTextField2.setHorizontalAlignment(0);
		this.jTextField3.setEditable(false);
		this.jTextField3.setForeground(Color.darkGray);
		this.jTextField3.setHorizontalAlignment(0);
		final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel5)
						.addContainerGap(283, 32767)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel5)
						.addContainerGap(133, 32767)));
		this.jLabel6.setFont(new Font("Tahoma", 1, 12));
		this.jLabel6.setForeground(Color.gray);
		this.jLabel6.setText("DATOS CORRESPONDIENTES A CORTE DEL MES ANTERIOR");
		final GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(
						GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup().addGap(40, 40, 40).addGroup(layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(this.jPanel1, -2, -1, -2)
														.addGroup(layout
																.createSequentialGroup().addGroup(layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(this.jLabel2, -1, -1, 32767)
																		.addComponent(this.jLabel3, -1, 164, 32767)
																		.addComponent(this.jLabel4, -1, -1, 32767))
																.addGap(48, 48, 48)
																.addGroup(layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(this.jTextField1, -2, 102, -2)
																		.addComponent(this.jTextField2, -2, 102, -2)
																		.addComponent(this.jTextField3, -2, 102, -2)))))
										.addComponent(this.jLabel1, -2, 397, -2))
								.addGap(0, 0, 32767))
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel6)
						.addContainerGap(-1, 32767)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 23, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6)
						.addGap(15, 15, 15)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel2, -2, 22, -2).addComponent(this.jTextField1, -2, 25, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel3, -2, 24, -2).addComponent(this.jTextField2, -2, 25, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel4, -2, 26, -2).addComponent(this.jTextField3, -2, 25, -2))
						.addGap(18, 18, 18).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
		this.pack();
	}
}