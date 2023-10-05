package presupuesto.Vistas;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;
import presupuesto.Vistas.Reportes.GenerarReporte;
import presupuesto.Controllers.CtrlPresupuestoDiag;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;

public class DiagFacturacion extends JDialog {
	private double valor1;
	private double valor2;
	private double valor3;
	private double valor4;
	private double valor5;
	private double valor6;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	private JButton jButton8;
	private JDateChooser jDateChooser1;
	private JDateChooser jDateChooser2;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JPanel jPanel1;
	private JTextField jTextField1;
	private JTextField jTextField10;
	private JTextField jTextField11;
	private JTextField jTextField12;
	private JTextField jTextField13;
	private JTextField jTextField14;
	private JTextField jTextField15;
	private JTextField jTextField16;
	private JTextField jTextField17;
	private JTextField jTextField18;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTextField jTextField9;

	public DiagFacturacion(final Frame parent, final boolean modal) {
		super(parent, modal);
		this.initComponents();
		this.setLocationRelativeTo(null);
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
		this.jLabel9 = new JLabel();
		this.jLabel10 = new JLabel();
		this.jTextField7 = new JTextField();
		this.jTextField8 = new JTextField();
		this.jTextField9 = new JTextField();
		this.jTextField10 = new JTextField();
		this.jLabel7 = new JLabel();
		this.jLabel8 = new JLabel();
		this.jButton2 = new JButton();
		this.jButton3 = new JButton();
		this.jButton4 = new JButton();
		this.jButton5 = new JButton();
		this.jButton6 = new JButton();
		this.jDateChooser1 = new JDateChooser();
		this.jDateChooser2 = new JDateChooser();
		this.jLabel11 = new JLabel();
		this.jButton7 = new JButton();
		this.jTextField11 = new JTextField();
		this.jTextField12 = new JTextField();
		this.jTextField13 = new JTextField();
		this.jTextField14 = new JTextField();
		this.jLabel12 = new JLabel();
		this.jButton8 = new JButton();
		this.jTextField5 = new JTextField();
		this.jTextField6 = new JTextField();
		this.jTextField15 = new JTextField();
		this.jTextField16 = new JTextField();
		this.jTextField17 = new JTextField();
		this.jTextField18 = new JTextField();
		this.jLabel13 = new JLabel();
		this.setDefaultCloseOperation(2);
		this.setTitle("Ocupación Unidades");
		this.jPanel1.setBackground(new Color(204, 204, 255));
		this.jLabel1.setFont(new Font("Tahoma", 1, 11));
		this.jLabel1.setForeground(new Color(102, 102, 255));
		this.jLabel1.setText("FACTURACIÓN");
		this.jLabel2.setBackground(new Color(102, 102, 255));
		this.jLabel2.setToolTipText("");
		this.jLabel2.setOpaque(true);
		this.jLabel3.setBackground(new Color(102, 102, 255));
		this.jLabel3.setFont(new Font("Tahoma", 1, 11));
		this.jLabel3.setForeground(new Color(102, 102, 255));
		this.jLabel3.setText("FACTURAS SIN RADICAR");
		this.jLabel4.setFont(new Font("Tahoma", 1, 11));
		this.jLabel4.setForeground(new Color(102, 102, 255));
		this.jLabel4.setText("FACTURAS RADICADAS ENTIDAD");
		this.jTextField1.setEditable(false);
		this.jTextField1.setHorizontalAlignment(0);
		this.jTextField2.setEditable(false);
		this.jTextField2.setHorizontalAlignment(0);
		this.jButton1.setText("CERRAR");
		this.jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton1ActionPerformed(evt);
			}
		});
		this.jLabel5.setBackground(new Color(102, 102, 255));
		this.jLabel5.setFont(new Font("Tahoma", 1, 11));
		this.jLabel5.setForeground(new Color(102, 102, 255));
		this.jLabel5.setText("FACTURAS RADICADAS");
		this.jTextField3.setEditable(false);
		this.jTextField3.setHorizontalAlignment(0);
		this.jLabel6.setBackground(new Color(102, 102, 255));
		this.jLabel6.setFont(new Font("Tahoma", 1, 11));
		this.jLabel6.setForeground(new Color(102, 102, 255));
		this.jLabel6.setText("FACTURAS OBJETADAS");
		this.jTextField4.setEditable(false);
		this.jTextField4.setHorizontalAlignment(0);
		this.jLabel9.setFont(new Font("Tahoma", 1, 11));
		this.jLabel9.setForeground(new Color(102, 102, 255));
		this.jLabel9.setHorizontalAlignment(0);
		this.jLabel9.setText("Cantidad");
		this.jLabel10.setFont(new Font("Tahoma", 1, 11));
		this.jLabel10.setForeground(new Color(102, 102, 255));
		this.jLabel10.setHorizontalAlignment(0);
		this.jLabel10.setText("Valor");
		this.jTextField7.setEditable(false);
		this.jTextField7.setHorizontalAlignment(0);
		this.jTextField8.setEditable(false);
		this.jTextField8.setHorizontalAlignment(0);
		this.jTextField9.setEditable(false);
		this.jTextField9.setHorizontalAlignment(0);
		this.jTextField10.setEditable(false);
		this.jTextField10.setHorizontalAlignment(0);
		this.jLabel7.setFont(new Font("Tahoma", 1, 11));
		this.jLabel7.setForeground(new Color(102, 102, 255));
		this.jLabel7.setText("FECHA INICIAL");
		this.jLabel8.setFont(new Font("Tahoma", 1, 11));
		this.jLabel8.setForeground(new Color(102, 102, 255));
		this.jLabel8.setText("FECHA FINAL");
		this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gnome-run.png")));
		this.jButton2.setText("Generar");
		this.jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton2ActionPerformed(evt);
			}
		});
		this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton3ActionPerformed(evt);
			}
		});
		this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton4ActionPerformed(evt);
			}
		});
		this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton5ActionPerformed(evt);
			}
		});
		this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton6ActionPerformed(evt);
			}
		});
		this.jLabel11.setFont(new Font("Tahoma", 1, 11));
		this.jLabel11.setForeground(new Color(102, 102, 255));
		this.jLabel11.setText("FACTURAS CONTESTADAS");
		this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton7ActionPerformed(evt);
			}
		});
		this.jTextField11.setEditable(false);
		this.jTextField11.setHorizontalAlignment(0);
		this.jTextField12.setEditable(false);
		this.jTextField12.setHorizontalAlignment(0);
		this.jTextField13.setEditable(false);
		this.jTextField13.setHorizontalAlignment(0);
		this.jTextField14.setEditable(false);
		this.jTextField14.setHorizontalAlignment(0);
		this.jLabel12.setFont(new Font("Tahoma", 1, 11));
		this.jLabel12.setForeground(new Color(102, 102, 255));
		this.jLabel12.setText("OTRAS");
		this.jButton8.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/gtk-edit.png")));
		this.jButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				DiagFacturacion.this.jButton8ActionPerformed(evt);
			}
		});
		this.jTextField5.setEditable(false);
		this.jTextField5.setHorizontalAlignment(0);
		this.jTextField6.setEditable(false);
		this.jTextField6.setHorizontalAlignment(0);
		this.jTextField15.setEditable(false);
		this.jTextField15.setHorizontalAlignment(0);
		this.jTextField16.setEditable(false);
		this.jTextField16.setHorizontalAlignment(0);
		this.jTextField17.setEditable(false);
		this.jTextField17.setHorizontalAlignment(0);
		this.jTextField18.setEditable(false);
		this.jTextField18.setHorizontalAlignment(0);
		this.jLabel13.setFont(new Font("Tahoma", 1, 11));
		this.jLabel13.setForeground(new Color(102, 102, 255));
		this.jLabel13.setText("% Valor");
		final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jLabel2, -1, -1, 32767)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(this.jLabel7, -2, 91, -2)
												.addComponent(this.jLabel8, -2, 91, -2))
										.addGap(38, 38, 38)
										.addGroup(
												jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
														.addComponent((Component) this.jDateChooser2, -1, 129,
																32767)
														.addComponent((Component) this.jDateChooser1, -1, -1, 32767)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(this.jLabel1, -2, 119, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(this.jButton2)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(this.jLabel5, -2, 160, -2)
																.addComponent(this.jLabel3, -2, 181, -2)
																.addComponent(this.jLabel4)
																.addComponent(this.jLabel6, -2, 160, -2)
																.addComponent(this.jLabel12, -2, 181, -2))
														.addGap(72, 72, 72)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.LEADING)
																				.addComponent(this.jButton5, -2, 32, -2)
																				.addComponent(this.jButton6, -2, 32, -2)
																				.addComponent(this.jButton7, -2, 32, -2)
																				.addComponent(this.jButton8, -2, 32,
																						-2))
																		.addGap(70, 70, 70)
																		.addGroup(jPanel1Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.LEADING,
																						false)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(this.jTextField9,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField10,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								this.jTextField16))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(this.jTextField8,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField2,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField15,
																								-2, 50, -2))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(this.jTextField11,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField12,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								this.jTextField17))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(this.jTextField13,
																								-2, 100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								this.jTextField14, -2,
																								100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								this.jTextField18))))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.TRAILING)
																				.addComponent(this.jLabel9, -2, 100, -2)
																				.addGroup(jPanel1Layout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(jPanel1Layout
																								.createSequentialGroup()
																								.addComponent(
																										this.jButton3,
																										-2, 32, -2)
																								.addPreferredGap(
																										LayoutStyle.ComponentPlacement.RELATED,
																										-1, 32767)
																								.addComponent(
																										this.jTextField3,
																										-2, 100, -2))
																						.addGroup(jPanel1Layout
																								.createSequentialGroup()
																								.addComponent(
																										this.jButton4,
																										-2, 32, -2)
																								.addGap(70, 70,
																										70)
																								.addComponent(
																										this.jTextField7,
																										-2, 100, -2))))
																		.addPreferredGap(
																				LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(jPanel1Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.LEADING,
																						false)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								this.jTextField1, -2,
																								100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField5,
																								-2, 50, -2))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								this.jTextField4, -2,
																								100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(this.jTextField6))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(this.jLabel10, -2,
																								100, -2)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								this.jLabel13))))))))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addComponent(this.jLabel11, -2, 181, -2)))
								.addGap(0, 0, 32767))
						.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addGap(0, 0, 32767).addComponent(this.jButton1, -2, 100, -2)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11)
						.addComponent(this.jLabel1, -2, 32, -2).addGap(18, 18, 18).addComponent(this.jLabel2, -2, 3, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent((Component) this.jDateChooser1, -1, -1, 32767)
								.addComponent(this.jLabel7, -1, -1, 32767))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent((Component) this.jDateChooser2, -2, -1, -2).addComponent(this.jLabel8))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jLabel9, -2, 21, -2)
												.addComponent(this.jLabel10, -2, 21, -2).addComponent(this.jLabel13))
										.addGap(6, 6, 6))
								.addGroup(GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent(this.jButton2, -2, 30, -2)
												.addGap(18, 18, 18)))
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField1, -2, 25, -2)
												.addComponent(this.jTextField3, -2, 25, -2)
												.addComponent(this.jLabel5, -2, 28, -2)
												.addComponent(this.jTextField5, -2, 25, -2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField7, -2, 25, -2)
												.addComponent(this.jTextField4, -2, 25, -2)
												.addComponent(this.jLabel3, -2, 28, -2)
												.addComponent(this.jTextField6, -2, 25, -2)))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton3, -2, 30, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
										.addComponent(this.jButton4, -2, 30, -2)))
						.addGap(3, 3, 3)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField2, -2, 25, -2)
												.addComponent(this.jLabel4, -2, 28, -2)
												.addComponent(this.jTextField8, -2, 25, -2)
												.addComponent(this.jTextField15, -2, 25, -2))
										.addGap(5, 5, 5)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField9, -2, 25, -2)
												.addComponent(this.jTextField10, -2, 25, -2)
												.addComponent(this.jTextField16, -2, 25, -2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField11, -2, 25, -2)
												.addComponent(this.jTextField12, -2, 25, -2)
												.addComponent(this.jTextField17, -2, 25, -2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.jTextField13, -2, 25, -2)
												.addComponent(this.jTextField14, -2, 25, -2)
												.addComponent(this.jTextField18, -2, 25, -2))
										.addGap(18, 18, 18).addComponent(this.jButton1, -2, 30, -2).addContainerGap())
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton5, -2, 30, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
												.addComponent(this.jButton6, -2, 30, -2)
												.addComponent(this.jLabel6, -2, 28, -2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(this.jLabel11, -2, 24, -2)
												.addComponent(this.jButton7, -2, 30, -2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(this.jLabel12, -2, 24, -2)
												.addComponent(this.jButton8, -2, 30, -2))
										.addGap(0, 0, 32767)))));
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

	private void jButton2ActionPerformed(final ActionEvent evt) {
		final String fechaInicial = getFecha(this.jDateChooser1.getDate());
		final String fechaFinal = getFecha(this.jDateChooser2.getDate());
		final CtrlPresupuestoDiag cpd = new CtrlPresupuestoDiag();
		this.valor1 = cpd.consultarValorFacturas(1, fechaInicial, fechaFinal);
		this.valor2 = cpd.consultarValorFacturas(0, fechaInicial, fechaFinal);
		this.valor3 = cpd.consultarValorFacturas(2, fechaInicial, fechaFinal);
		this.valor4 = cpd.consultarValorFacturas(3, fechaInicial, fechaFinal);
		this.valor5 = cpd.consultarValorFacturas(4, fechaInicial, fechaFinal);
		this.valor6 = cpd.consultarValorFacturas(5, fechaInicial, fechaFinal);
		this.jTextField3.setText("" + cpd.consultarCantidadFacturas(1, fechaInicial, fechaFinal));
		this.jTextField7.setText("" + cpd.consultarCantidadFacturas(0, fechaInicial, fechaFinal));
		this.jTextField8.setText("" + cpd.consultarCantidadFacturas(2, fechaInicial, fechaFinal));
		this.jTextField9.setText("" + cpd.consultarCantidadFacturas(3, fechaInicial, fechaFinal));
		this.jTextField11.setText("" + cpd.consultarCantidadFacturas(4, fechaInicial, fechaFinal));
		this.jTextField13.setText("" + cpd.consultarCantidadFacturas(3, fechaInicial, fechaFinal));
		this.jTextField1.setText(this.conversion(this.valor1));
		this.jTextField4.setText(this.conversion(this.valor2));
		this.jTextField2.setText(this.conversion(this.valor3));
		this.jTextField10.setText(this.conversion(this.valor4));
		this.jTextField12.setText(this.conversion(this.valor5));
		this.jTextField14.setText(this.conversion(this.valor6));
		this.jTextField5.setText(this.conversionPorcentaje(this.calcularAvgCantidades(this.valor1)) + "%");
		this.jTextField6.setText(this.conversionPorcentaje(this.calcularAvgCantidades(this.valor2)) + "%");
		this.jTextField15.setText(this.conversionPorcentaje(this.calcularAvgCantidades(this.valor3)) + "%");
		this.jTextField16.setText("" + this.conversionPorcentaje(this.calcularAvgCantidades(this.valor4)) + "%");
		this.jTextField17.setText("" + this.conversionPorcentaje(this.calcularAvgCantidades(this.valor5)) + "%");
		this.jTextField18.setText("" + this.conversionPorcentaje(this.calcularAvgCantidades(this.valor6)) + "%");
	}

	private void jButton3ActionPerformed(final ActionEvent evt) {
		final String fechaInicial = getFecha(this.jDateChooser1.getDate());
		final String fechaFinal = getFecha(this.jDateChooser2.getDate());
		final GenerarReporte gr = new GenerarReporte();
		gr.ejecutarReporte(fechaInicial, fechaFinal, 1);
	}

	private void jButton4ActionPerformed(final ActionEvent evt) {
		final String fechaInicial = getFecha(this.jDateChooser1.getDate());
		final String fechaFinal = getFecha(this.jDateChooser2.getDate());
		final GenerarReporte gr = new GenerarReporte();
		gr.ejecutarReporte(fechaInicial, fechaFinal, 0);
	}

	private void jButton5ActionPerformed(final ActionEvent evt) {
		final String fechaInicial = getFecha(this.jDateChooser1.getDate());
		final String fechaFinal = getFecha(this.jDateChooser2.getDate());
		final GenerarReporte gr = new GenerarReporte();
		gr.ejecutarReporte(fechaInicial, fechaFinal, 2);
	}

	private void jButton6ActionPerformed(final ActionEvent evt) {
		final String fechaInicial = getFecha(this.jDateChooser1.getDate());
		final String fechaFinal = getFecha(this.jDateChooser2.getDate());
		final GenerarReporte gr = new GenerarReporte();
		gr.ejecutarReporte(fechaInicial, fechaFinal, 3);
	}

	private void jButton7ActionPerformed(final ActionEvent evt) {
	}

	private void jButton8ActionPerformed(final ActionEvent evt) {
	}

	public double calcularAvgCantidades(final double valor) {
		final double porcentaje = valor
				/ (this.valor1 + this.valor2 + this.valor3 + this.valor4 + this.valor5 + this.valor6) * 100.0;
		return porcentaje;
	}

	public String conversion(final double valor) {
		final DecimalFormat num = new DecimalFormat("###,###.##");
		return num.format(valor);
	}

	public String conversionPorcentaje(final double valor) {
		final DecimalFormat num = new DecimalFormat("###,###");
		return num.format(valor);
	}

	public static String getFecha(final Date fecha) {
		try {
			final Date fechaformateada = fecha;
			final SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
			return formateador.format(fechaformateada);
		} catch (final NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "Error en la fecha ingresada", "Error", 0);
			return "";
		}
	}
}