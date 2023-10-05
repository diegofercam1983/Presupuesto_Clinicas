package presupuesto.Vistas;

import javax.swing.Timer;

import presupuesto.Controllers.CtrlPresupuestoDiag;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.awt.Image;
import presupuesto.Controllers.CtrlPresupuesto;
import java.awt.Frame;
//import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.LayoutStyle;
import java.awt.Component;
//import java.awt.LayoutManager;
//import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
//import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.image.BufferedImage;
//import org.jfree.chart.ChartPanel;
import javax.swing.JFrame;

public class Consulta extends JFrame {
	double p1;
	double p2;
	double p3;
	double p4;
	double p5;
	double p6;
	double p7;
	double p8;
	double p9;
	double p10;
	double p11;
	double p12;
	double p13;
	double p14;
	double p15;
	double p16;
	double p17;
	double p18;
	double p19;
	double p20;
	double p21;
	double p22;
	double p23;
	double p24;
	double p25;
	double p26;
	double p27;
	double p28;
	double p29;
	double p30;
	double p31;
	double p32;
//	ChartPanel chartPanel;
//	GraficaPq graficaPq1;
//	GraficaPq graficaPq2;
//	Grafica grafica1;
//	Grafica grafica2;
	GraficaMeter graficaMeter1;
	GraficaMeter graficaMeter2;
	GraficaMeter graficaMeter3;
	GraficaMeter graficaMeter4;
	GraficaMeter graficaMeter5;
	GraficaMeter graficaMeter6;
	BufferedImage grafico1;
	BufferedImage grafico2;
	BufferedImage grafico3;
	BufferedImage grafico4;
	BufferedImage grafico5;
	BufferedImage grafico6;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel2;
	private JLabel jLabel20;
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel jLabel3;
	private JLabel jLabel30;
	private JLabel jLabel31;
	private JLabel jLabel32;
	private JLabel jLabel33;
	private JLabel jLabel34;
	private JLabel jLabel35;
	private JLabel jLabel37;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel5;
	private JProgressBar jProgressBar1;
	private JProgressBar jProgressBar10;
	private JProgressBar jProgressBar11;
	private JProgressBar jProgressBar12;
	private JProgressBar jProgressBar13;
	private JProgressBar jProgressBar14;
	private JProgressBar jProgressBar15;
	private JProgressBar jProgressBar16;
	private JProgressBar jProgressBar17;
	private JProgressBar jProgressBar18;
	private JProgressBar jProgressBar2;
	private JProgressBar jProgressBar3;
	private JProgressBar jProgressBar4;
	private JProgressBar jProgressBar5;
	private JProgressBar jProgressBar6;
	private JProgressBar jProgressBar7;
	private JProgressBar jProgressBar8;
	private JProgressBar jProgressBar9;
	private JTextField txtAcumuladoCe;
	private JTextField txtAcumuladoGin;
	private JTextField txtAcumuladoHos;
	private JTextField txtAcumuladoImg;
	private JTextField txtAcumuladoUciA;
	private JTextField txtAcumuladoUciN;
	private JTextField txtAcumuladoUrg;
	private JTextField txtAcumuladocx;
	private JTextField txtAcumuladotot;
	private JTextField txtDiferenciaAcuCe;
	private JTextField txtDiferenciaAcuCx;
	private JTextField txtDiferenciaAcuGin;
	private JTextField txtDiferenciaAcuHos;
	private JTextField txtDiferenciaAcuImag;
	private JTextField txtDiferenciaAcuTot;
	private JTextField txtDiferenciaAcuUciA;
	private JTextField txtDiferenciaAcuUciN;
	private JTextField txtDiferenciaAcuUrg;
	private JTextField txtDiferenciaHoyCe;
	private JTextField txtDiferenciaHoyCx;
	private JTextField txtDiferenciaHoyGin;
	private JTextField txtDiferenciaHoyHos;
	private JTextField txtDiferenciaHoyImag;
	private JTextField txtDiferenciaHoyTot;
	private JTextField txtDiferenciaHoyUciA;
	private JTextField txtDiferenciaHoyUciN;
	private JTextField txtDiferenciaHoyurg;
	private JTextField txtFacturHoyCe;
	private JTextField txtFacturHoyGin;
	private JTextField txtFacturHoyHos;
	private JTextField txtFacturHoyImg;
	private JTextField txtFacturHoyUciA;
	private JTextField txtFacturHoyUciN;
	private JTextField txtFacturHoyUrg;
	private JTextField txtFacturHoycx;
	private JTextField txtFacturHoytot;
	private JTextField txtOcupacionCe;
	private JTextField txtOcupacionCx;
	private JTextField txtOcupacionGin;
	private JTextField txtOcupacionHosp;
	private JTextField txtOcupacionImag;
	private JTextField txtOcupacionTot;
	private JTextField txtOcupacionUciA;
	private JTextField txtOcupacionUciN;
	private JTextField txtOcupacionUrg;
	private JTextField txtPresupuestoAcuCe;
	private JTextField txtPresupuestoAcuGin;
	private JTextField txtPresupuestoAcuImg;
	private JTextField txtPresupuestoAcuUciA;
	private JTextField txtPresupuestoAcuUciN;
	private JTextField txtPresupuestoAcucx;
	private JTextField txtPresupuestoAcuhos;
	private JTextField txtPresupuestoAcutot;
	private JTextField txtPresupuestoUrg;
	private JTextField txtPresupuestohoyCe;
	private JTextField txtPresupuestohoyGIn;
	private JTextField txtPresupuestohoyHos;
	private JTextField txtPresupuestohoyImg;
	private JTextField txtPresupuestohoyUciA;
	private JTextField txtPresupuestohoyUciN;
	private JTextField txtPresupuestohoyUrg;
	private JTextField txtPresupuestohoycx;
	private JTextField txtPresupuestohoytot;
	private JTextField txtPresupuestontcext;
	private JTextField txtPresupuestontcx;
	private JTextField txtPresupuestontgin;
	private JTextField txtPresupuestonthosp;
	private JTextField txtPresupuestontimg;
	private JTextField txtPresupuestonttot;
	private JTextField txtPresupuestontucia;
	private JTextField txtPresupuestontucin;
	private JTextField txtPresupuestonturg;

	public Consulta() {
		this.initComponents();
		this.llenarDatos();
		this.MiTimer();
	}

	private void initComponents() {
		this.jPanel1 = new JPanel();
		this.jLabel7 = new JLabel();
		this.jLabel4 = new JLabel();
		this.jLabel3 = new JLabel();
		this.jLabel2 = new JLabel();
		this.jLabel6 = new JLabel();
		this.txtPresupuestohoycx = new JTextField();
		this.txtPresupuestoAcucx = new JTextField();
		this.txtFacturHoycx = new JTextField();
		this.jLabel9 = new JLabel();
		this.txtFacturHoyUrg = new JTextField();
		this.txtPresupuestohoyUrg = new JTextField();
		this.txtPresupuestoUrg = new JTextField();
		this.jLabel10 = new JLabel();
		this.jLabel11 = new JLabel();
		this.jLabel12 = new JLabel();
		this.jLabel13 = new JLabel();
		this.jLabel14 = new JLabel();
		this.jLabel15 = new JLabel();
		this.txtFacturHoyHos = new JTextField();
		this.txtFacturHoyUciN = new JTextField();
		this.txtFacturHoyUciA = new JTextField();
		this.txtFacturHoyGin = new JTextField();
		this.txtFacturHoyImg = new JTextField();
		this.txtPresupuestohoyHos = new JTextField();
		this.txtPresupuestohoyUciN = new JTextField();
		this.txtPresupuestohoyUciA = new JTextField();
		this.txtPresupuestohoyGIn = new JTextField();
		this.txtPresupuestohoyImg = new JTextField();
		this.txtPresupuestoAcuhos = new JTextField();
		this.txtPresupuestoAcuUciN = new JTextField();
		this.txtPresupuestoAcuUciA = new JTextField();
		this.txtPresupuestoAcuGin = new JTextField();
		this.txtPresupuestoAcuImg = new JTextField();
		this.txtFacturHoyCe = new JTextField();
		this.txtAcumuladoCe = new JTextField();
		this.txtPresupuestohoyCe = new JTextField();
		this.txtPresupuestoAcuCe = new JTextField();
		this.jProgressBar1 = new JProgressBar();
		this.jProgressBar2 = new JProgressBar();
		this.jProgressBar3 = new JProgressBar();
		this.jProgressBar4 = new JProgressBar();
		this.jProgressBar5 = new JProgressBar();
		this.jProgressBar6 = new JProgressBar();
		this.jProgressBar7 = new JProgressBar();
		this.jProgressBar9 = new JProgressBar();
		this.jProgressBar10 = new JProgressBar();
		this.jProgressBar11 = new JProgressBar();
		this.jProgressBar12 = new JProgressBar();
		this.jProgressBar13 = new JProgressBar();
		this.jProgressBar14 = new JProgressBar();
		this.jProgressBar15 = new JProgressBar();
		this.jProgressBar16 = new JProgressBar();
		this.jLabel16 = new JLabel();
		this.jLabel17 = new JLabel();
		this.jLabel19 = new JLabel();
		this.txtFacturHoytot = new JTextField();
		this.txtPresupuestoAcutot = new JTextField();
		this.txtAcumuladotot = new JTextField();
		this.txtPresupuestohoytot = new JTextField();
		this.jProgressBar18 = new JProgressBar();
		this.jLabel5 = new JLabel();
		this.txtAcumuladoUrg = new JTextField();
		this.txtAcumuladocx = new JTextField();
		this.txtAcumuladoHos = new JTextField();
		this.txtAcumuladoUciN = new JTextField();
		this.txtAcumuladoUciA = new JTextField();
		this.txtAcumuladoGin = new JTextField();
		this.txtAcumuladoImg = new JTextField();
		this.jProgressBar8 = new JProgressBar();
		this.jProgressBar17 = new JProgressBar();
		this.txtPresupuestonturg = new JTextField();
		this.txtPresupuestontcx = new JTextField();
		this.txtPresupuestonthosp = new JTextField();
		this.txtPresupuestontucin = new JTextField();
		this.txtPresupuestontucia = new JTextField();
		this.txtPresupuestontgin = new JTextField();
		this.txtPresupuestontimg = new JTextField();
		this.txtPresupuestontcext = new JTextField();
		this.txtPresupuestonttot = new JTextField();
		this.txtOcupacionUrg = new JTextField();
		this.txtOcupacionCx = new JTextField();
		this.txtOcupacionHosp = new JTextField();
		this.txtOcupacionUciN = new JTextField();
		this.txtOcupacionGin = new JTextField();
		this.txtOcupacionImag = new JTextField();
		this.txtOcupacionCe = new JTextField();
		this.txtOcupacionTot = new JTextField();
		this.txtOcupacionUciA = new JTextField();
		this.jLabel25 = new JLabel();
		this.jLabel26 = new JLabel();
		this.txtDiferenciaHoyurg = new JTextField();
		this.txtDiferenciaHoyCx = new JTextField();
		this.txtDiferenciaHoyHos = new JTextField();
		this.txtDiferenciaHoyUciN = new JTextField();
		this.txtDiferenciaHoyUciA = new JTextField();
		this.txtDiferenciaHoyGin = new JTextField();
		this.txtDiferenciaHoyImag = new JTextField();
		this.txtDiferenciaHoyCe = new JTextField();
		this.txtDiferenciaHoyTot = new JTextField();
		this.txtDiferenciaAcuUrg = new JTextField();
		this.txtDiferenciaAcuCx = new JTextField();
		this.txtDiferenciaAcuHos = new JTextField();
		this.txtDiferenciaAcuUciN = new JTextField();
		this.txtDiferenciaAcuUciA = new JTextField();
		this.txtDiferenciaAcuGin = new JTextField();
		this.txtDiferenciaAcuImag = new JTextField();
		this.txtDiferenciaAcuCe = new JTextField();
		this.txtDiferenciaAcuTot = new JTextField();
		this.jLabel27 = new JLabel();
		this.jLabel28 = new JLabel();
		this.jLabel29 = new JLabel();
		this.jButton1 = new JButton();
		this.jLabel31 = new JLabel();
		this.jLabel32 = new JLabel();
		this.jButton2 = new JButton();
		this.jButton3 = new JButton();
		this.jLabel8 = new JLabel();
		this.jPanel2 = new JPanel();
		this.jPanel3 = new JPanel();
		this.jLabel23 = new JLabel();
		this.jLabel33 = new JLabel();
		this.jLabel35 = new JLabel();
		this.jLabel37 = new JLabel();
		this.jLabel24 = new JLabel();
		this.jLabel34 = new JLabel();
		this.jLabel20 = new JLabel();
		this.jPanel5 = new JPanel();
		this.jLabel1 = new JLabel();
		this.jLabel30 = new JLabel();
		this.jLabel18 = new JLabel();
		this.setDefaultCloseOperation(3);
		this.setTitle("Informe de Ingreso Vs Presupuesto");
		this.setBackground(new Color(-8355712, true));
		this.setIconImage(this.getIconImage());
		this.jPanel1.setForeground(new Color(-8355712, true));
		this.jPanel1.setAutoscrolls(true);
		this.jLabel7.setForeground(new Color(-12566464, true));
		this.jLabel7.setHorizontalAlignment(0);
		this.jLabel7.setText("<HTML>DIFERENCIA<BR/><CENTER>ACUMULADO</CENTER></HTML> ");
		this.jLabel4.setForeground(new Color(-12566464, true));
		this.jLabel4.setHorizontalAlignment(0);
		this.jLabel4.setText("<html>FACTURADO<br/><center>MES A HOY</center></html>");
		this.jLabel3.setFont(new Font("Dialog", 1, 12));
		this.jLabel3.setForeground(new Color(-12566464, true));
		this.jLabel3.setHorizontalAlignment(4);
		this.jLabel3.setText("CIRUGIA");
		this.jLabel2.setFont(new Font("Dialog", 1, 12));
		this.jLabel2.setForeground(new Color(-12566464, true));
		this.jLabel2.setHorizontalAlignment(0);
		this.jLabel2.setText("<html>UNIDAD ESTRATÉGICA \n<br/><center>DE NEGOCIO</center></html>");
		this.jLabel6.setForeground(new Color(-12566464, true));
		this.jLabel6.setHorizontalAlignment(0);
		this.jLabel6.setText("<html>PRESUPUESTO<br/><center> MES A HOY</center></html>");
		this.txtPresupuestohoycx.setEditable(false);
		this.txtPresupuestohoycx.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoycx.setHorizontalAlignment(0);
		this.txtPresupuestoAcucx.setEditable(false);
		this.txtPresupuestoAcucx.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcucx.setHorizontalAlignment(0);
		this.txtFacturHoycx.setEditable(false);
		this.txtFacturHoycx.setForeground(new Color(-12566464, true));
		this.txtFacturHoycx.setHorizontalAlignment(0);
		this.jLabel9.setFont(new Font("Dialog", 1, 12));
		this.jLabel9.setForeground(new Color(-12566464, true));
		this.jLabel9.setHorizontalAlignment(4);
		this.jLabel9.setText("URGENCIAS");
		this.txtFacturHoyUrg.setEditable(false);
		this.txtFacturHoyUrg.setForeground(new Color(-12566464, true));
		this.txtFacturHoyUrg.setHorizontalAlignment(0);
		this.txtPresupuestohoyUrg.setEditable(false);
		this.txtPresupuestohoyUrg.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyUrg.setHorizontalAlignment(0);
		this.txtPresupuestoUrg.setEditable(false);
		this.txtPresupuestoUrg.setForeground(new Color(-12566464, true));
		this.txtPresupuestoUrg.setHorizontalAlignment(0);
		this.jLabel10.setFont(new Font("Dialog", 1, 12));
		this.jLabel10.setForeground(new Color(-12566464, true));
		this.jLabel10.setHorizontalAlignment(4);
		this.jLabel10.setText("HOSPITALIZACIÓN");
		this.jLabel11.setFont(new Font("Dialog", 1, 12));
		this.jLabel11.setForeground(new Color(-12566464, true));
		this.jLabel11.setHorizontalAlignment(4);
		this.jLabel11.setText("UCI NEONATAL");
		this.jLabel12.setFont(new Font("Dialog", 1, 12));
		this.jLabel12.setForeground(new Color(-12566464, true));
		this.jLabel12.setHorizontalAlignment(4);
		this.jLabel12.setText("UCI ADULTOS");
		this.jLabel13.setFont(new Font("Dialog", 1, 12));
		this.jLabel13.setForeground(new Color(-12566464, true));
		this.jLabel13.setHorizontalAlignment(4);
		this.jLabel13.setText("ALTO RIESGO"); //GINECOBSTETRICIA
		this.jLabel14.setFont(new Font("Dialog", 1, 12));
		this.jLabel14.setForeground(new Color(-12566464, true));
		this.jLabel14.setHorizontalAlignment(4);
		this.jLabel14.setText("IMAGENEOLOGIA");
		this.jLabel15.setFont(new Font("Dialog", 1, 12));
		this.jLabel15.setForeground(new Color(-12566464, true));
		this.jLabel15.setHorizontalAlignment(4);
		this.jLabel15.setText("CONSULTA EXT.");
		this.txtFacturHoyHos.setEditable(false);
		this.txtFacturHoyHos.setForeground(new Color(-12566464, true));
		this.txtFacturHoyHos.setHorizontalAlignment(0);
		this.txtFacturHoyUciN.setEditable(false);
		this.txtFacturHoyUciN.setForeground(new Color(-12566464, true));
		this.txtFacturHoyUciN.setHorizontalAlignment(0);
		this.txtFacturHoyUciA.setEditable(false);
		this.txtFacturHoyUciA.setForeground(new Color(-12566464, true));
		this.txtFacturHoyUciA.setHorizontalAlignment(0);
		this.txtFacturHoyGin.setEditable(false);
		this.txtFacturHoyGin.setForeground(new Color(-12566464, true));
		this.txtFacturHoyGin.setHorizontalAlignment(0);
		this.txtFacturHoyImg.setEditable(false);
		this.txtFacturHoyImg.setForeground(new Color(-12566464, true));
		this.txtFacturHoyImg.setHorizontalAlignment(0);
		this.txtPresupuestohoyHos.setEditable(false);
		this.txtPresupuestohoyHos.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyHos.setHorizontalAlignment(0);
		this.txtPresupuestohoyUciN.setEditable(false);
		this.txtPresupuestohoyUciN.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyUciN.setHorizontalAlignment(0);
		this.txtPresupuestohoyUciA.setEditable(false);
		this.txtPresupuestohoyUciA.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyUciA.setHorizontalAlignment(0);
		this.txtPresupuestohoyGIn.setEditable(false);
		this.txtPresupuestohoyGIn.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyGIn.setHorizontalAlignment(0);
		this.txtPresupuestohoyImg.setEditable(false);
		this.txtPresupuestohoyImg.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyImg.setHorizontalAlignment(0);
		this.txtPresupuestoAcuhos.setEditable(false);
		this.txtPresupuestoAcuhos.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuhos.setHorizontalAlignment(0);
		this.txtPresupuestoAcuUciN.setEditable(false);
		this.txtPresupuestoAcuUciN.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuUciN.setHorizontalAlignment(0);
		this.txtPresupuestoAcuUciA.setEditable(false);
		this.txtPresupuestoAcuUciA.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuUciA.setHorizontalAlignment(0);
		this.txtPresupuestoAcuGin.setEditable(false);
		this.txtPresupuestoAcuGin.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuGin.setHorizontalAlignment(0);
		this.txtPresupuestoAcuImg.setEditable(false);
		this.txtPresupuestoAcuImg.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuImg.setHorizontalAlignment(0);
		this.txtFacturHoyCe.setEditable(false);
		this.txtFacturHoyCe.setForeground(new Color(-12566464, true));
		this.txtFacturHoyCe.setHorizontalAlignment(0);
		this.txtAcumuladoCe.setEditable(false);
		this.txtAcumuladoCe.setForeground(new Color(-12566464, true));
		this.txtAcumuladoCe.setHorizontalAlignment(0);
		this.txtPresupuestohoyCe.setEditable(false);
		this.txtPresupuestohoyCe.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoyCe.setHorizontalAlignment(0);
		this.txtPresupuestoAcuCe.setEditable(false);
		this.txtPresupuestoAcuCe.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcuCe.setHorizontalAlignment(0);
		this.jProgressBar3.setPreferredSize(new Dimension(120, 14));
		this.jProgressBar4.setPreferredSize(new Dimension(120, 14));
		this.jProgressBar5.setPreferredSize(new Dimension(120, 14));
		this.jProgressBar6.setPreferredSize(new Dimension(120, 14));
		this.jProgressBar7.setPreferredSize(new Dimension(120, 14));
		this.jLabel16.setForeground(new Color(-12566464, true));
		this.jLabel16.setHorizontalAlignment(0);
		this.jLabel16.setText("% MES A HOY");
		this.jLabel17.setForeground(new Color(-12566464, true));
		this.jLabel17.setHorizontalAlignment(0);
		this.jLabel17.setText("% ACUMULADO");
		this.jLabel19.setFont(new Font("Dialog", 1, 12));
		this.jLabel19.setForeground(new Color(-12566464, true));
		this.jLabel19.setHorizontalAlignment(4);
		this.jLabel19.setText("TOTALES");
		this.txtFacturHoytot.setEditable(false);
		this.txtFacturHoytot.setForeground(new Color(-12566464, true));
		this.txtFacturHoytot.setHorizontalAlignment(0);
		this.txtPresupuestoAcutot.setEditable(false);
		this.txtPresupuestoAcutot.setForeground(new Color(-12566464, true));
		this.txtPresupuestoAcutot.setHorizontalAlignment(0);
		this.txtAcumuladotot.setEditable(false);
		this.txtAcumuladotot.setForeground(new Color(-12566464, true));
		this.txtAcumuladotot.setHorizontalAlignment(0);
		this.txtPresupuestohoytot.setEditable(false);
		this.txtPresupuestohoytot.setForeground(new Color(-12566464, true));
		this.txtPresupuestohoytot.setHorizontalAlignment(0);
		this.jLabel5.setForeground(new Color(-12566464, true));
		this.jLabel5.setHorizontalAlignment(0);
		this.jLabel5.setText("<html><center>INGRESO<br/>ACUMULADO</center></html>");
		this.txtAcumuladoUrg.setEditable(false);
		this.txtAcumuladoUrg.setForeground(new Color(-12566464, true));
		this.txtAcumuladoUrg.setHorizontalAlignment(0);
		this.txtAcumuladocx.setEditable(false);
		this.txtAcumuladocx.setForeground(new Color(-12566464, true));
		this.txtAcumuladocx.setHorizontalAlignment(0);
		this.txtAcumuladoHos.setEditable(false);
		this.txtAcumuladoHos.setForeground(new Color(-12566464, true));
		this.txtAcumuladoHos.setHorizontalAlignment(0);
		this.txtAcumuladoUciN.setEditable(false);
		this.txtAcumuladoUciN.setForeground(new Color(-12566464, true));
		this.txtAcumuladoUciN.setHorizontalAlignment(0);
		this.txtAcumuladoUciA.setEditable(false);
		this.txtAcumuladoUciA.setForeground(new Color(-12566464, true));
		this.txtAcumuladoUciA.setHorizontalAlignment(0);
		this.txtAcumuladoGin.setEditable(false);
		this.txtAcumuladoGin.setForeground(new Color(-12566464, true));
		this.txtAcumuladoGin.setHorizontalAlignment(0);
		this.txtAcumuladoImg.setEditable(false);
		this.txtAcumuladoImg.setForeground(new Color(-12566464, true));
		this.txtAcumuladoImg.setHorizontalAlignment(0);
		this.jProgressBar8.setPreferredSize(new Dimension(120, 14));
		this.txtPresupuestonturg.setEditable(false);
		this.txtPresupuestonturg.setForeground(Color.darkGray);
		this.txtPresupuestonturg.setHorizontalAlignment(0);
		this.txtPresupuestontcx.setEditable(false);
		this.txtPresupuestontcx.setForeground(Color.darkGray);
		this.txtPresupuestontcx.setHorizontalAlignment(0);
		this.txtPresupuestonthosp.setEditable(false);
		this.txtPresupuestonthosp.setForeground(Color.darkGray);
		this.txtPresupuestonthosp.setHorizontalAlignment(0);
		this.txtPresupuestontucin.setEditable(false);
		this.txtPresupuestontucin.setForeground(Color.darkGray);
		this.txtPresupuestontucin.setHorizontalAlignment(0);
		this.txtPresupuestontucia.setEditable(false);
		this.txtPresupuestontucia.setForeground(Color.darkGray);
		this.txtPresupuestontucia.setHorizontalAlignment(0);
		this.txtPresupuestontgin.setEditable(false);
		this.txtPresupuestontgin.setForeground(Color.darkGray);
		this.txtPresupuestontgin.setHorizontalAlignment(0);
		this.txtPresupuestontimg.setEditable(false);
		this.txtPresupuestontimg.setForeground(Color.darkGray);
		this.txtPresupuestontimg.setHorizontalAlignment(0);
		this.txtPresupuestontcext.setEditable(false);
		this.txtPresupuestontcext.setForeground(Color.darkGray);
		this.txtPresupuestontcext.setHorizontalAlignment(0);
		this.txtPresupuestonttot.setEditable(false);
		this.txtPresupuestonttot.setForeground(Color.darkGray);
		this.txtPresupuestonttot.setHorizontalAlignment(0);
		this.txtPresupuestonttot.setToolTipText("");
		this.txtOcupacionUrg.setEditable(false);
		this.txtOcupacionUrg.setForeground(Color.darkGray);
		this.txtOcupacionUrg.setHorizontalAlignment(0);
		this.txtOcupacionUrg.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionUrg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionUrgMouseClicked(evt);
			}
		});
		this.txtOcupacionCx.setEditable(false);
		this.txtOcupacionCx.setForeground(Color.darkGray);
		this.txtOcupacionCx.setHorizontalAlignment(0);
		this.txtOcupacionCx.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionCx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionCxMouseClicked(evt);
			}
		});
		this.txtOcupacionHosp.setEditable(false);
		this.txtOcupacionHosp.setForeground(Color.darkGray);
		this.txtOcupacionHosp.setHorizontalAlignment(0);
		this.txtOcupacionHosp.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionHosp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionHospMouseClicked(evt);
			}
		});
		this.txtOcupacionUciN.setEditable(false);
		this.txtOcupacionUciN.setForeground(Color.darkGray);
		this.txtOcupacionUciN.setHorizontalAlignment(0);
		this.txtOcupacionUciN.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionUciN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionUciNMouseClicked(evt);
			}
		});
		this.txtOcupacionGin.setEditable(false);
		this.txtOcupacionGin.setForeground(Color.darkGray);
		this.txtOcupacionGin.setHorizontalAlignment(0);
		this.txtOcupacionGin.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionGin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionGinMouseClicked(evt);
			}
		});
		this.txtOcupacionImag.setEditable(false);
		this.txtOcupacionImag.setForeground(Color.darkGray);
		this.txtOcupacionImag.setHorizontalAlignment(0);
		this.txtOcupacionImag.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionImag.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionImagMouseClicked(evt);
			}
		});
		this.txtOcupacionCe.setEditable(false);
		this.txtOcupacionCe.setForeground(Color.darkGray);
		this.txtOcupacionCe.setHorizontalAlignment(0);
		this.txtOcupacionCe.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionCe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionCeMouseClicked(evt);
			}
		});
		this.txtOcupacionTot.setEditable(false);
		this.txtOcupacionTot.setForeground(Color.darkGray);
		this.txtOcupacionTot.setHorizontalAlignment(0);
		this.txtOcupacionUciA.setEditable(false);
		this.txtOcupacionUciA.setForeground(Color.darkGray);
		this.txtOcupacionUciA.setHorizontalAlignment(0);
		this.txtOcupacionUciA.setToolTipText("Presione un clic para ver mas detalles");
		this.txtOcupacionUciA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.txtOcupacionUciAMouseClicked(evt);
			}
		});
		this.jLabel25.setForeground(Color.darkGray);
		this.jLabel25.setHorizontalAlignment(0);
		this.jLabel25.setText("<html>PRESUPUESTO<br/><center>MES TOT.</center></html>");
		this.jLabel26.setForeground(Color.darkGray);
		this.jLabel26.setHorizontalAlignment(0);
		this.jLabel26.setText("OCUPACIÓN");
		this.txtDiferenciaHoyurg.setEditable(false);
		this.txtDiferenciaHoyurg.setForeground(Color.darkGray);
		this.txtDiferenciaHoyurg.setHorizontalAlignment(0);
		this.txtDiferenciaHoyCx.setEditable(false);
		this.txtDiferenciaHoyCx.setForeground(Color.darkGray);
		this.txtDiferenciaHoyCx.setHorizontalAlignment(0);
		this.txtDiferenciaHoyHos.setEditable(false);
		this.txtDiferenciaHoyHos.setForeground(Color.darkGray);
		this.txtDiferenciaHoyHos.setHorizontalAlignment(0);
		this.txtDiferenciaHoyUciN.setEditable(false);
		this.txtDiferenciaHoyUciN.setForeground(Color.darkGray);
		this.txtDiferenciaHoyUciN.setHorizontalAlignment(0);
		this.txtDiferenciaHoyUciA.setEditable(false);
		this.txtDiferenciaHoyUciA.setForeground(Color.darkGray);
		this.txtDiferenciaHoyUciA.setHorizontalAlignment(0);
		this.txtDiferenciaHoyGin.setEditable(false);
		this.txtDiferenciaHoyGin.setForeground(Color.darkGray);
		this.txtDiferenciaHoyGin.setHorizontalAlignment(0);
		this.txtDiferenciaHoyImag.setEditable(false);
		this.txtDiferenciaHoyImag.setForeground(Color.darkGray);
		this.txtDiferenciaHoyImag.setHorizontalAlignment(0);
		this.txtDiferenciaHoyCe.setEditable(false);
		this.txtDiferenciaHoyCe.setForeground(Color.darkGray);
		this.txtDiferenciaHoyCe.setHorizontalAlignment(0);
		this.txtDiferenciaHoyTot.setEditable(false);
		this.txtDiferenciaHoyTot.setForeground(Color.darkGray);
		this.txtDiferenciaHoyTot.setHorizontalAlignment(0);
		this.txtDiferenciaAcuUrg.setEditable(false);
		this.txtDiferenciaAcuUrg.setForeground(Color.darkGray);
		this.txtDiferenciaAcuUrg.setHorizontalAlignment(0);
		this.txtDiferenciaAcuCx.setEditable(false);
		this.txtDiferenciaAcuCx.setForeground(Color.darkGray);
		this.txtDiferenciaAcuCx.setHorizontalAlignment(0);
		this.txtDiferenciaAcuHos.setEditable(false);
		this.txtDiferenciaAcuHos.setForeground(Color.darkGray);
		this.txtDiferenciaAcuHos.setHorizontalAlignment(0);
		this.txtDiferenciaAcuUciN.setEditable(false);
		this.txtDiferenciaAcuUciN.setForeground(Color.darkGray);
		this.txtDiferenciaAcuUciN.setHorizontalAlignment(0);
		this.txtDiferenciaAcuUciA.setEditable(false);
		this.txtDiferenciaAcuUciA.setForeground(Color.darkGray);
		this.txtDiferenciaAcuUciA.setHorizontalAlignment(0);
		this.txtDiferenciaAcuGin.setEditable(false);
		this.txtDiferenciaAcuGin.setForeground(Color.darkGray);
		this.txtDiferenciaAcuGin.setHorizontalAlignment(0);
		this.txtDiferenciaAcuImag.setEditable(false);
		this.txtDiferenciaAcuImag.setForeground(Color.darkGray);
		this.txtDiferenciaAcuImag.setHorizontalAlignment(0);
		this.txtDiferenciaAcuCe.setEditable(false);
		this.txtDiferenciaAcuCe.setForeground(Color.darkGray);
		this.txtDiferenciaAcuCe.setHorizontalAlignment(0);
		this.txtDiferenciaAcuTot.setEditable(false);
		this.txtDiferenciaAcuTot.setForeground(Color.darkGray);
		this.txtDiferenciaAcuTot.setHorizontalAlignment(0);
		this.jLabel27.setForeground(new Color(-12566464, true));
		this.jLabel27.setHorizontalAlignment(0);
		this.jLabel27.setText("<html>PRESUPUESTO<br/><center>ACUMULADO</center></html>");
		this.jLabel28.setForeground(new Color(-12566464, true));
		this.jLabel28.setHorizontalAlignment(0);
		this.jLabel28.setText("<html>DIFERENCIA<br/><center> MES A HOY</center></html>");
		this.jLabel29
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/ClinicaFarallones.png")));
		this.jButton1.setText("Corte");
		this.jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				Consulta.this.jButton1ActionPerformed(evt);
			}
		});
		this.jLabel31.setFont(new Font("Consolas", 2, 36));
		this.jLabel31.setForeground(new Color(0, 0, 153));
		this.jLabel31.setHorizontalAlignment(0);
		this.jLabel31.setText("ASI... VAMOS");
		this.jLabel32.setFont(new Font("Tahoma", 1, 12));
		this.jLabel32.setForeground(new Color(0, 0, 153));
		this.jLabel32.setText("COSECHANDO UNIDOS, ALCANZANDO METAS");
		this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/diagram - copia.png")));
		this.jButton2.setText("% Acum.");
		this.jButton2.addActionListener(Consulta.this::jButton2ActionPerformed);
		this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/diagram - copia.png")));
		this.jButton3.setText("% Mes");
		this.jButton3.addActionListener(Consulta.this::jButton3ActionPerformed);
		final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel29, -2, 219, -2)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(254, 254, 254)
														.addComponent(this.jLabel32, -2, 281, -2).addGap(53, 53, 53)
														.addComponent(this.jButton3)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jButton2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(this.jButton1))
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(125, 125, 125)
														.addComponent(this.jLabel31, -2, 531, -2))))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel3, -2, 132, -2)
										.addGap(55, 55, 55).addComponent(this.txtOcupacionCx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtFacturHoycx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestohoycx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaHoyCx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestontcx, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.jProgressBar2, -2, 126, -2).addGap(14, 14, 14)
										.addComponent(this.txtAcumuladocx, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.txtPresupuestoAcucx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaAcuCx, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jProgressBar10, -2, 105, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel10, -2, 132, -2)
										.addGap(55, 55, 55).addComponent(this.txtOcupacionHosp, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtFacturHoyHos, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestohoyHos, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaHoyHos, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestonthosp, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.jProgressBar3, -2, 126, -2).addGap(14, 14, 14)
										.addComponent(this.txtAcumuladoHos, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.txtPresupuestoAcuhos, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaAcuHos, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jProgressBar11, -2, 105, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel11, -2, 132, -2)
										.addGap(55, 55, 55).addComponent(this.txtOcupacionUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtFacturHoyUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestohoyUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaHoyUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestontucin, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.jProgressBar4, -2, 126, -2).addGap(14, 14, 14)
										.addComponent(this.txtAcumuladoUciN, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.txtPresupuestoAcuUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaAcuUciN, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jProgressBar12, -2, 105, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel12, -2, 132, -2)
										.addGap(55, 55, 55).addComponent(this.txtOcupacionUciA, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtFacturHoyUciA, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestohoyUciA, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaHoyUciA, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestontucia, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.jProgressBar5, -2, 126, -2).addGap(14, 14, 14)
										.addComponent(this.txtAcumuladoUciA, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.txtPresupuestoAcuUciA, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaAcuUciA, -2, 70, -2)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jProgressBar13, -2, 105, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8).addGroup(jPanel1Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(this.jLabel13, -2, 124, -2).addGap(55, 55, 55)
												.addComponent(this.txtOcupacionGin, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtFacturHoyGin, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestohoyGIn, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaHoyGin, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestontgin, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.jProgressBar6, -2, 126, -2).addGap(14, 14, 14)
												.addComponent(this.txtAcumuladoGin, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.txtPresupuestoAcuGin, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaAcuGin, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jProgressBar14, -2, 105, -2))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(this.jLabel14, -2, 124, -2).addGap(55, 55, 55)
												.addComponent(this.txtOcupacionImag, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtFacturHoyImg, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestohoyImg, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaHoyImag, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestontimg, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.jProgressBar7, -2, 126, -2).addGap(14, 14, 14)
												.addComponent(this.txtAcumuladoImg, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.txtPresupuestoAcuImg, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaAcuImag, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jProgressBar15, -2, 105, -2))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(this.jLabel15, -2, 124, -2).addGap(55, 55, 55)
												.addComponent(this.txtOcupacionCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtFacturHoyCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestohoyCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaHoyCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestontcext, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.jProgressBar8, -2, 126, -2).addGap(14, 14, 14)
												.addComponent(this.txtAcumuladoCe, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.txtPresupuestoAcuCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaAcuCe, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jProgressBar16, -2, 104, -2))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(this.jLabel19, -2, 124, -2).addGap(55, 55, 55)
												.addComponent(this.txtOcupacionTot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtFacturHoytot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestohoytot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaHoyTot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtPresupuestonttot, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.jProgressBar17, -2, 126, -2).addGap(14, 14, 14)
												.addComponent(this.txtAcumuladotot, -2, 70, -2).addGap(6, 6, 6)
												.addComponent(this.txtPresupuestoAcutot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.txtDiferenciaAcuTot, -2, 70, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jProgressBar18, -2, 105, -2))))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel9, -2, 132, -2)
										.addGap(55, 55, 55).addComponent(this.txtOcupacionUrg, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtFacturHoyUrg, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestohoyUrg, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtDiferenciaHoyurg, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.txtPresupuestonturg, -2, 70, -2).addGap(6, 6, 6)
										.addComponent(this.jProgressBar1, -2, 126, -2).addGap(14, 14, 14)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(this.jLabel5, -2, 70, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jLabel27, -2, 70, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(this.jLabel7, -2, 65, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jLabel17, -2, 105, -2))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(this.txtAcumuladoUrg, -2, 70, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.txtPresupuestoUrg, -2, 70, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.txtDiferenciaAcuUrg, -2, 70, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jProgressBar9, -2, 105, -2))))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2, -2, 147, -2)
										.addGap(41, 41, 41).addComponent(this.jLabel26, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jLabel4, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jLabel6, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jLabel28, -2, 70, -2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jLabel25, -2, 70, -2).addGap(3, 3, 3)
										.addComponent(this.jLabel16, -2, 124, -2)))
						.addContainerGap(-1, 32767)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(this.jLabel31)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jButton1).addComponent(this.jLabel32)
										.addComponent(this.jButton2).addComponent(this.jButton3)))
						.addComponent(this.jLabel29, -2, 88, -2))
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
								jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
										.createSequentialGroup().addGap(27, 27, 27)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.BASELINE)
																.addComponent(this.jLabel4, -2, -1, -2)
																.addComponent(this.jLabel6, -2, -1, -2)
																.addComponent(this.jLabel25, -2, -1, -2)
																.addComponent(this.jLabel26)
																.addComponent(this.jLabel28, -2, -1, -2)))
												.addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(this.jLabel5, -2, -1, -2)
														.addComponent(this.jLabel7, -2, -1, -2)
														.addComponent(this.jLabel16, -2, 30, -2)
														.addComponent(this.jLabel27, -2, -1, -2))))
										.addGroup(GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.jLabel2, -2, 38, -2)))
								.addGroup(GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jLabel17, -2, 30, -2)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyUrg, -2, -1, -2)
										.addComponent(this.txtFacturHoyUrg, -2, -1, -2)
										.addComponent(this.txtOcupacionUrg, -2, -1, -2))
								.addComponent(this.jProgressBar1, -2, 20, -2)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtAcumuladoUrg, -2, -1, -2)
										.addComponent(this.txtPresupuestoUrg, -2, -1, -2)
										.addComponent(this.txtDiferenciaAcuUrg, -2, -1, -2))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1).addGroup(jPanel1Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel9)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.txtPresupuestonturg, -2, -1, -2)
												.addComponent(this.txtDiferenciaHoyurg, -2, -1, -2))))
								.addComponent(this.jProgressBar9, -2, 20, -2))
						.addGap(6, 6, 6)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1)
										.addComponent(this.jLabel3))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoycx, -2, -1, -2)
										.addComponent(this.txtFacturHoycx, -2, -1, -2)
										.addComponent(this.txtOcupacionCx, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestontcx, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyCx, -2, -1, -2))
								.addComponent(this.jProgressBar2, -2, 20, -2)
								.addComponent(this.txtAcumuladocx, -2, -1, -2)
								.addComponent(this.txtPresupuestoAcucx, -2, -1, -2)
								.addComponent(this.jProgressBar10, -2, 20, -2)
								.addComponent(this.txtDiferenciaAcuCx, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1)
										.addComponent(this.jLabel10))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyHos, -2, -1, -2)
										.addComponent(this.txtFacturHoyHos, -2, -1, -2)
										.addComponent(this.txtOcupacionHosp, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestonthosp, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyHos, -2, -1, -2))
								.addComponent(this.jProgressBar3, -2, 20, -2)
								.addComponent(this.txtAcumuladoHos, -2, -1, -2)
								.addComponent(this.txtPresupuestoAcuhos, -2, -1, -2)
								.addComponent(this.jProgressBar11, -2, 20, -2)
								.addComponent(this.txtDiferenciaAcuHos, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(this.jLabel11)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1).addGroup(jPanel1Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.txtPresupuestohoyUciN, -2, -1, -2)
												.addComponent(this.txtFacturHoyUciN, -2, -1, -2)
												.addComponent(this.txtOcupacionUciN, -2, -1, -2))
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.txtPresupuestontucin, -2, -1, -2)
												.addComponent(this.txtDiferenciaHoyUciN, -2, -1, -2))
										.addComponent(this.jProgressBar4, -2, 20, -2)
										.addComponent(this.txtAcumuladoUciN, -2, -1, -2)
										.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(this.txtPresupuestoAcuUciN, -2, -1, -2)
												.addComponent(this.txtDiferenciaAcuUciN, -2, -1, -2))
										.addComponent(this.jProgressBar12, -2, 20, -2))))
						.addGap(6, 6, 6)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1)
										.addComponent(this.jLabel12))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyUciA, -2, -1, -2)
										.addComponent(this.txtFacturHoyUciA, -2, -1, -2)
										.addComponent(this.txtOcupacionUciA, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestontucia, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyUciA, -2, -1, -2))
								.addComponent(this.jProgressBar5, -2, 20, -2)
								.addComponent(this.txtAcumuladoUciA, -2, -1, -2)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestoAcuUciA, -2, -1, -2)
										.addComponent(this.txtDiferenciaAcuUciA, -2, -1, -2))
								.addComponent(this.jProgressBar13, -2, 20, -2))
						.addGap(6, 6, 6)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1)
										.addComponent(this.jLabel13))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyGIn, -2, -1, -2)
										.addComponent(this.txtFacturHoyGin, -2, -1, -2)
										.addComponent(this.txtOcupacionGin, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestontgin, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyGin, -2, -1, -2))
								.addComponent(this.jProgressBar6, -2, 20, -2)
								.addComponent(this.txtAcumuladoGin, -2, -1, -2)
								.addComponent(this.txtPresupuestoAcuGin, -2, -1, -2)
								.addComponent(this.jProgressBar14, -2, 20, -2)
								.addComponent(this.txtDiferenciaAcuGin, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(1, 1, 1)
										.addComponent(this.jLabel14))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyImg, -2, -1, -2)
										.addComponent(this.txtFacturHoyImg, -2, -1, -2)
										.addComponent(this.txtOcupacionImag, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestontimg, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyImag, -2, -1, -2))
								.addComponent(this.jProgressBar7, -2, 20, -2)
								.addComponent(this.txtAcumuladoImg, -2, -1, -2)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestoAcuImg, -2, -1, -2)
										.addComponent(this.txtDiferenciaAcuImag, -2, -1, -2))
								.addComponent(this.jProgressBar15, -2, 20, -2))
						.addGap(6, 6, 6)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4)
										.addComponent(this.jLabel15))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoyCe, -2, -1, -2)
										.addComponent(this.txtFacturHoyCe, -2, -1, -2)
										.addComponent(this.txtOcupacionCe, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestontcext, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyCe, -2, -1, -2))
								.addComponent(this.jProgressBar8, -2, 20, -2)
								.addComponent(this.txtAcumuladoCe, -2, -1, -2)
								.addComponent(this.txtPresupuestoAcuCe, -2, -1, -2)
								.addComponent(this.jProgressBar16, -2, 20, -2)
								.addComponent(this.txtDiferenciaAcuCe, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6)
										.addComponent(this.jLabel19))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestohoytot, -2, -1, -2)
										.addComponent(this.txtFacturHoytot, -2, -1, -2)
										.addComponent(this.txtOcupacionTot, -2, -1, -2))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.txtPresupuestonttot, -2, -1, -2)
										.addComponent(this.txtDiferenciaHoyTot, -2, -1, -2))
								.addComponent(this.jProgressBar17, -2, 20, -2)
								.addComponent(this.txtAcumuladotot, -2, -1, -2)
								.addComponent(this.txtPresupuestoAcutot, -2, -1, -2)
								.addComponent(this.jProgressBar18, -2, 20, -2)
								.addComponent(this.txtDiferenciaAcuTot, -2, -1, -2))));
		this.jLabel8.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/BannerAzul.png")));
		this.jPanel2.setBorder(BorderFactory.createTitledBorder(""));
		this.jPanel3.setBorder(BorderFactory.createTitledBorder(""));
		this.jPanel3.setToolTipText("Presione un click para ver mas detalles");
		this.jPanel3.setMaximumSize(new Dimension(500, 100));
		this.jLabel23.setFont(new Font("Tahoma", 1, 11));
		this.jLabel23.setForeground(Color.gray);
		this.jLabel23.setHorizontalAlignment(0);
		this.jLabel23.setToolTipText("");
		this.jLabel23.setVerticalAlignment(1);
		this.jLabel23.setHorizontalTextPosition(0);
		this.jLabel23.setVerticalTextPosition(1);
		this.jLabel33.setFont(new Font("Tahoma", 1, 11));
		this.jLabel33.setForeground(Color.gray);
		this.jLabel33.setHorizontalAlignment(0);
		this.jLabel33.setText("FACTURACIÓN");
		this.jLabel33.setToolTipText("Presione un clic para ver mas detalles");
		this.jLabel33.setVerticalAlignment(1);
		this.jLabel33.setHorizontalTextPosition(0);
		this.jLabel33.setVerticalTextPosition(1);
		this.jLabel33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent evt) {
				Consulta.this.jLabel33MouseClicked(evt);
			}
		});
		this.jLabel35.setFont(new Font("Tahoma", 1, 11));
		this.jLabel35.setForeground(Color.gray);
		this.jLabel35.setHorizontalAlignment(0);
		this.jLabel35.setText("CARTERA");
		this.jLabel35.setVerticalAlignment(1);
		this.jLabel35.setHorizontalTextPosition(0);
		this.jLabel35.setVerticalTextPosition(1);
		this.jLabel37.setFont(new Font("Tahoma", 1, 11));
		this.jLabel37.setForeground(Color.gray);
		this.jLabel37.setHorizontalAlignment(0);
		this.jLabel37.setText("URGENCIAS");
		this.jLabel37.setVerticalAlignment(1);
		this.jLabel37.setHorizontalTextPosition(0);
		this.jLabel37.setVerticalTextPosition(1);
		this.jLabel24.setFont(new Font("Tahoma", 1, 11));
		this.jLabel24.setForeground(Color.gray);
		this.jLabel24.setHorizontalAlignment(0);
		this.jLabel24.setText("INVENTARIO");
		this.jLabel24.setVerticalAlignment(1);
		this.jLabel24.setHorizontalTextPosition(0);
		this.jLabel24.setVerticalTextPosition(1);
		this.jLabel34.setFont(new Font("Tahoma", 1, 11));
		this.jLabel34.setForeground(Color.gray);
		this.jLabel34.setHorizontalAlignment(0);
		this.jLabel34.setText("MANTENIMIENTO");
		this.jLabel34.setVerticalAlignment(1);
		this.jLabel34.setHorizontalTextPosition(0);
		this.jLabel34.setVerticalTextPosition(1);
		final GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
		this.jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(this.jLabel23, -2, 200, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jLabel33, -2, 200, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jLabel35, -2, 200, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jLabel37, -2, 200, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jLabel34, -2, 200, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(this.jLabel24, -2, 200, -2).addContainerGap(-1, 32767)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(this.jLabel24, -1, 157, 32767).addComponent(this.jLabel33, -1, -1, 32767)
								.addComponent(this.jLabel37, -1, -1, 32767)
								.addComponent(this.jLabel35, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
								.addComponent(this.jLabel23, -1, -1, 32767).addComponent(this.jLabel34, -1, 157, 32767))
						.addContainerGap()));
		this.jLabel20.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/BannerAzul.png")));
		final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
		this.jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jLabel20, -2, 0, 32767).addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(22, 22, 22).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel20, -2, 20, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -2, -1, -2)
						.addContainerGap(-1, 32767)));
		this.jLabel1.setFont(new Font("Tahoma", 1, 11));
		this.jLabel1.setHorizontalAlignment(0);
		this.jLabel1.setIcon(new ImageIcon(
				this.getClass().getResource("/Imagenes/alcance-la-meta-13166722 azul sin fondo pq 160 x 180.png")));
		this.jLabel1.setVerticalAlignment(3);
		this.jLabel1.setHorizontalTextPosition(0);
		this.jLabel1.setVerticalTextPosition(3);
		this.jLabel30.setFont(new Font("Tahoma", 1, 11));
		this.jLabel30.setIcon(new ImageIcon(
				this.getClass().getResource("/Imagenes/alcance-la-meta-13166722 roja sin fondo pq 160 x 180.png")));
		this.jLabel30.setHorizontalTextPosition(0);
		this.jLabel30.setVerticalTextPosition(3);
		this.jLabel18.setForeground(new Color(-8355712, true));
		this.jLabel18.setHorizontalAlignment(0);
		this.jLabel18.setText("Miercoles, Junio 11 de 2014");
		final GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
		this.jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(26, 26, 26)
						.addComponent(this.jLabel1, -2, 187, -2).addContainerGap(-1, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING,
						jPanel5Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jLabel18, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
										.addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
												.addGap(0, 0, 32767).addComponent(this.jLabel30, -2, 178, -2)))
								.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.jLabel18, -2, 23, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jLabel1, -1, 196, 32767)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel30)));
		final GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8, -2, 0, 32767)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jPanel2, -1, -1, 32767)
										.addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jPanel5, -1, -1, 32767)))
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(this.jLabel8, -2, 25, -2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(this.jPanel5, -2, -1, -2).addComponent(this.jPanel1, -2, -1, -2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, -1, 32767)
						.addComponent(this.jPanel2, -2, -1, -2)));
		this.pack();
	}

	private void txtOcupacionUciAMouseClicked(final MouseEvent evt) {
		new DiagUciadulto((Frame) this, true);
	}

	private void txtOcupacionUciNMouseClicked(final MouseEvent evt) {
		new DiagUciNeo((Frame) this, true);
	}

	private void txtOcupacionHospMouseClicked(final MouseEvent evt) {
		new DiagHospitaliza((Frame) this, true);
	}

	private void jButton1ActionPerformed(final ActionEvent evt) {
		final Mesanterior mesanterior = new Mesanterior((Frame) this, true);
		mesanterior.setLocationRelativeTo((Component) null);
		mesanterior.setVisible(true);
	}

	private void txtOcupacionUrgMouseClicked(final MouseEvent evt) {
		new DiagUrgencias((Frame) this, true);
	}

	private void txtOcupacionCxMouseClicked(final MouseEvent evt) {
		new DiagCirugia((Frame) this, true);
	}

	private void txtOcupacionGinMouseClicked(final MouseEvent evt) {
		new DiagGineco((Frame) this, true);
	}

	private void txtOcupacionImagMouseClicked(final MouseEvent evt) {
		new DiagImagenes((Frame) this, true);
	}

	private void txtOcupacionCeMouseClicked(final MouseEvent evt) {
		new DiagConE((Frame) this, true);
	}

	private void jButton2ActionPerformed(final ActionEvent evt) {
		new Grafica(this.p17, this.p18, this.p19, this.p20, this.p21, this.p22, this.p23, this.p24, this.p25, this.p26,
				this.p27, this.p28, this.p29, this.p30, this.p31, this.p32);
	}

	private void jButton3ActionPerformed(final ActionEvent evt) {
		new Grafica(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10, this.p11,
				this.p12, this.p13, this.p14, this.p15, this.p16);
	}

	private void jLabel33MouseClicked(final MouseEvent evt) {
		new DiagFacturacion((Frame) this, false);
	}

	public JPanel miPanel() {
		return this.jPanel1;
	}

	public void llenarDatos() {
		final CtrlPresupuesto cp = new CtrlPresupuesto();
		Object[] datos = new Object[0];
		this.jLabel20.setBackground(new Color(232, 109, 107));
		this.graficaMeter1 = new GraficaMeter();
		this.graficaMeter2 = new GraficaMeter();
		this.graficaMeter3 = new GraficaMeter();
		this.graficaMeter4 = new GraficaMeter();
		this.graficaMeter5 = new GraficaMeter();
		this.graficaMeter6 = new GraficaMeter();
		datos = cp.valorRango("01");
		this.grafico1 = this.graficaMeter1.GraficaMeterPlot("", datos[0], datos[1], datos[2], datos[3], datos[4]);
		this.jLabel23.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		datos = cp.valorRango("02");
		this.grafico2 = this.graficaMeter2.GraficaMeterPlot("", datos[0], datos[1], datos[2], datos[3], datos[4]);
		this.jLabel33.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		datos = cp.valorRango("03");
		this.grafico3 = this.graficaMeter3.GraficaMeterPlot("", datos[0], datos[1], datos[2], datos[3], datos[4]);
		this.jLabel35.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		datos = cp.valorRango("04");
		this.grafico4 = this.graficaMeter4.GraficaMeterPlotInvertido("", datos[0], datos[1], datos[2], datos[3],
				(Object) cp.indicadorCuatro());
		this.jLabel37.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		datos = cp.valorRango("05");
		this.grafico5 = this.graficaMeter5.GraficaMeterPlot("", datos[0], datos[1], datos[2], datos[3], datos[4]);
		this.jLabel24.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		datos = cp.valorRango("06");
		this.grafico6 = this.graficaMeter6.GraficaMeterPlot("", datos[0], datos[1], datos[2], datos[3], datos[4]);
		this.jLabel34.setText("<html><center>" + datos[6] + "<br/>" + datos[5] + "</center></html>");
		this.jLabel23.setIcon(new ImageIcon(this.grafico1));
		this.jLabel33.setIcon(new ImageIcon(this.grafico2));
		this.jLabel35.setIcon(new ImageIcon(this.grafico3));
		this.jLabel37.setIcon(new ImageIcon(this.grafico4));
		this.jLabel24.setIcon(new ImageIcon(this.grafico5));
		this.jLabel34.setIcon(new ImageIcon(this.grafico6));
		this.jButton1.setVisible(true);
		final List<Double> data = cp.consultarDatos();
		final List<Double> data2 = cp.consultarFactuAcu();
		final List<Double> data3 = cp.consultarPresupuestoHoy();
		final List<Double> data4 = cp.consultarPresupuestoAcumulado();
		final List<Double> data5 = cp.consultarPresupuestoNeto();
		this.txtFacturHoyUrg.setText(this.valorFormateado(data.get(0)));
		this.txtFacturHoycx.setText(this.valorFormateado(data.get(1)));
		this.txtFacturHoyHos.setText(this.valorFormateado(data.get(2)));
		this.txtFacturHoyUciN.setText(this.valorFormateado(data.get(3)));
		this.txtFacturHoyUciA.setText(this.valorFormateado(data.get(4)));
		this.txtFacturHoyGin.setText(this.valorFormateado(data.get(5)));
		this.txtFacturHoyImg.setText(this.valorFormateado(data.get(6)));
		this.txtFacturHoyCe.setText(this.valorFormateado(data.get(7)));
		this.txtAcumuladoUrg.setText(this.valorFormateado(data2.get(0)));
		this.txtAcumuladocx.setText(this.valorFormateado(data2.get(1)));
		this.txtAcumuladoHos.setText(this.valorFormateado(data2.get(2)));
		this.txtAcumuladoUciN.setText(this.valorFormateado(data2.get(3)));
		this.txtAcumuladoUciA.setText(this.valorFormateado(data2.get(4)));
		this.txtAcumuladoGin.setText(this.valorFormateado(data2.get(5)));
		this.txtAcumuladoImg.setText(this.valorFormateado(data2.get(6)));
		this.txtAcumuladoCe.setText(this.valorFormateado(data2.get(7)));
		this.txtPresupuestohoyUrg.setText(this.valorFormateado(data3.get(0)));
		this.txtPresupuestohoycx.setText(this.valorFormateado(data3.get(1)));
		this.txtPresupuestohoyHos.setText(this.valorFormateado(data3.get(2)));
		this.txtPresupuestohoyUciN.setText(this.valorFormateado(data3.get(3)));
		this.txtPresupuestohoyUciA.setText(this.valorFormateado(data3.get(4)));
		this.txtPresupuestohoyGIn.setText(this.valorFormateado(data3.get(5)));
		this.txtPresupuestohoyImg.setText(this.valorFormateado(data3.get(6)));
		this.txtPresupuestohoyCe.setText(this.valorFormateado(data3.get(7)));
		this.txtPresupuestonturg.setText(this.valorFormateado(data5.get(0)));
		this.txtPresupuestontcx.setText(this.valorFormateado(data5.get(1)));
		this.txtPresupuestonthosp.setText(this.valorFormateado(data5.get(2)));
		this.txtPresupuestontucin.setText(this.valorFormateado(data5.get(3)));
		this.txtPresupuestontucia.setText(this.valorFormateado(data5.get(4)));
		this.txtPresupuestontgin.setText(this.valorFormateado(data5.get(5)));
		this.txtPresupuestontimg.setText(this.valorFormateado(data5.get(6)));
		this.txtPresupuestontcext.setText(this.valorFormateado(data5.get(7)));
		final double total = data.get(0) + data.get(1) + data.get(2) + data.get(3) + data.get(4) + data.get(5)
				+ data.get(6) + data.get(7);
		final double total2 = data2.get(0) + data2.get(1) + data2.get(2) + data2.get(3) + data2.get(4) + data2.get(5)
				+ data2.get(6) + data2.get(7);
		final double total3 = data3.get(0) + data3.get(1) + data3.get(2) + data3.get(3) + data3.get(4) + data3.get(5)
				+ data3.get(6) + data3.get(7);
		final double total4 = data5.get(0) + data5.get(1) + data5.get(2) + data5.get(3) + data5.get(4) + data5.get(5)
				+ data5.get(6) + data5.get(7);
		this.txtFacturHoytot.setText(this.valorFormateado(total));
		this.txtAcumuladotot.setText(this.valorFormateado(total2));
		this.txtPresupuestohoytot.setText(this.valorFormateado(total3));
		this.txtPresupuestonttot.setText(this.valorFormateado(total4));
		this.txtOcupacionHosp.setText(this.valorFormateado(cp.consultarOcupacionHosp(0, 0)) + "%");
		this.txtOcupacionUciN.setText(this.valorFormateado(cp.consultarOcupacionneonatal(0, 0)) + "%");
		this.txtOcupacionUciA.setText(this.valorFormateado(cp.consultarOcupacionAdultos(0, 0)) + "%");
		final int progres17 = (int) Math.floor(total / total3 * 100.0);
		final double val1 = data3.get(0) + data4.get(0);
		final double val2 = data3.get(1) + data4.get(1);
		final double val3 = data3.get(2) + data4.get(2);
		final double val4 = data3.get(3) + data4.get(3);
		final double val5 = data3.get(4) + data4.get(4);
		final double val6 = data3.get(5) + data4.get(5);
		final double val7 = data3.get(6) + data4.get(6);
		final double val8 = data3.get(7) + data4.get(7);
		final double acuTot = val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8;
		this.txtPresupuestoAcutot.setText(this.valorFormateado(acuTot));
		final int progres18 = (int) Math.floor(total2 / acuTot * 100.0);
		this.txtPresupuestoUrg.setText(this.valorFormateado(val1));
		this.txtPresupuestoAcucx.setText(this.valorFormateado(val2));
		this.txtPresupuestoAcuhos.setText(this.valorFormateado(val3));
		this.txtPresupuestoAcuUciN.setText(this.valorFormateado(val4));
		this.txtPresupuestoAcuUciA.setText(this.valorFormateado(val5));
		this.txtPresupuestoAcuGin.setText(this.valorFormateado(val6));
		this.txtPresupuestoAcuImg.setText(this.valorFormateado(val7));
		this.txtPresupuestoAcuCe.setText(this.valorFormateado(val8));
		final int progres19 = (int) Math.floor(data.get(0) / data3.get(0) * 100.0);
		final int progres20 = (int) Math.floor(data.get(1) / data3.get(1) * 100.0);
		final int progres21 = (int) Math.floor(data.get(2) / data3.get(2) * 100.0);
		final int progres22 = (int) Math.floor(data.get(3) / data3.get(3) * 100.0);
		final int progres23 = (int) Math.floor(data.get(4) / data3.get(4) * 100.0);
		final int progres24 = (int) Math.floor(data.get(5) / data3.get(5) * 100.0);
		final int progres25 = (int) Math.floor(data.get(6) / data3.get(6) * 100.0);
		final int progres26 = (int) Math.floor(data.get(7) / data3.get(7) * 100.0);
		final int progres27 = (int) Math.floor(data2.get(0) / val1 * 100.0);
		final int progres28 = (int) Math.floor(data2.get(1) / val2 * 100.0);
		final int progres29 = (int) Math.floor(data2.get(2) / val3 * 100.0);
		final int progres30 = (int) Math.floor(data2.get(3) / val4 * 100.0);
		final int progres31 = (int) Math.floor(data2.get(4) / val5 * 100.0);
		final int progres32 = (int) Math.floor(data2.get(5) / val6 * 100.0);
		final int progres33 = (int) Math.floor(data2.get(6) / val7 * 100.0);
		final int progres34 = (int) Math.floor(data2.get(7) / val8 * 100.0);
		this.jProgressBar1.setValue(progres19);
		this.jProgressBar1.setString("" + progres19 + "%");
		this.jProgressBar1.setStringPainted(true);
		this.pintarProgress(this.jProgressBar1);
		this.jProgressBar2.setValue(progres20);
		this.jProgressBar2.setString("" + progres20 + "%");
		this.jProgressBar2.setStringPainted(true);
		this.pintarProgress(this.jProgressBar2);
		this.jProgressBar3.setValue(progres21);
		this.jProgressBar3.setString("" + progres21 + "%");
		this.jProgressBar3.setStringPainted(true);
		this.pintarProgress(this.jProgressBar3);
		this.jProgressBar4.setValue(progres22);
		this.jProgressBar4.setStringPainted(true);
		this.pintarProgress(this.jProgressBar4);
		this.jProgressBar5.setValue(progres23);
		this.jProgressBar5.setString("" + progres23 + "%");
		this.jProgressBar5.setStringPainted(true);
		this.pintarProgress(this.jProgressBar5);
		this.jProgressBar6.setValue(progres24);
		this.jProgressBar6.setStringPainted(true);
		this.pintarProgress(this.jProgressBar6);
		this.jProgressBar7.setValue(progres25);
		this.jProgressBar7.setString("" + progres25 + "%");
		this.jProgressBar7.setStringPainted(true);
		this.pintarProgress(this.jProgressBar7);
		this.jProgressBar8.setValue(progres26);
		this.jProgressBar8.setString("" + progres26 + "%");
		this.jProgressBar8.setStringPainted(true);
		this.pintarProgress(this.jProgressBar8);
		this.jProgressBar9.setValue(progres27);
		this.jProgressBar9.setString("" + progres27 + "%");
		this.jProgressBar9.setStringPainted(true);
		this.pintarProgress(this.jProgressBar9);
		this.jProgressBar10.setValue(progres28);
		this.jProgressBar10.setString("" + progres28 + "%");
		this.jProgressBar10.setStringPainted(true);
		this.pintarProgress(this.jProgressBar10);
		this.jProgressBar11.setValue(progres29);
		this.jProgressBar11.setString("" + progres29 + "%");
		this.jProgressBar11.setStringPainted(true);
		this.pintarProgress(this.jProgressBar11);
		this.jProgressBar12.setValue(progres30);
		this.jProgressBar12.setString("" + progres30 + "%");
		this.jProgressBar12.setStringPainted(true);
		this.pintarProgress(this.jProgressBar12);
		this.jProgressBar13.setValue(progres31);
		this.jProgressBar13.setString("" + progres31 + "%");
		this.jProgressBar13.setStringPainted(true);
		this.pintarProgress(this.jProgressBar13);
		this.jProgressBar14.setValue(progres32);
		this.jProgressBar14.setString("" + progres32 + "%");
		this.jProgressBar14.setStringPainted(true);
		this.pintarProgress(this.jProgressBar14);
		this.jProgressBar15.setValue(progres33);
		this.jProgressBar15.setString("" + progres33 + "%");
		this.jProgressBar15.setStringPainted(true);
		this.pintarProgress(this.jProgressBar15);
		this.jProgressBar16.setValue(progres34);
		this.jProgressBar16.setString("" + progres34 + "%");
		this.jProgressBar16.setStringPainted(true);
		this.pintarProgress(this.jProgressBar16);
		this.jProgressBar17.setValue(progres17);
		this.jProgressBar17.setString("" + progres17 + "%");
		this.jProgressBar17.setStringPainted(true);
		this.pintarProgress(this.jProgressBar17);
		this.ponerImagen1(progres17);
		this.jLabel1.setText("<html><center>PORCENTAJE MES A HOY<br/>" + progres17 + "%</center></html>");
		this.jProgressBar18.setValue(progres18);
		this.jProgressBar18.setString("" + progres18 + "%");
		this.jProgressBar18.setStringPainted(true);
		this.pintarProgress(this.jProgressBar18);
		this.ponerImagen2(progres18);
		this.jLabel30.setText("<html><center>PORCENTAJE ACUMULADO<br/>" + progres18 + "%</center></html>");
		final Date fecha = new Date();
		final SimpleDateFormat f = new SimpleDateFormat("EEEE ',' dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		final String dia = f.format(fecha.getTime());
		this.jLabel18.setText(dia);
		this.p1 = data.get(0);
		this.p2 = data3.get(0);
		this.p3 = data.get(1);
		this.p4 = data3.get(1);
		this.p5 = data.get(2);
		this.p6 = data3.get(2);
		this.p7 = data.get(3);
		this.p8 = data3.get(3);
		this.p9 = data.get(4);
		this.p10 = data3.get(4);
		this.p11 = data.get(5);
		this.p12 = data3.get(5);
		this.p13 = data.get(6);
		this.p14 = data3.get(6);
		this.p15 = data.get(7);
		this.p16 = data3.get(7);
		this.p17 = data2.get(0);
		this.p18 = val1;
		this.p19 = data2.get(1);
		this.p20 = val2;
		this.p21 = data2.get(2);
		this.p22 = val3;
		this.p23 = data2.get(3);
		this.p24 = val4;
		this.p25 = data2.get(4);
		this.p26 = val5;
		this.p27 = data2.get(5);
		this.p28 = val6;
		this.p29 = data2.get(6);
		this.p30 = val7;
		this.p31 = data2.get(7);
		this.p32 = val8;
		this.txtDiferenciaHoyurg.setText(this.valorFormateado(this.p1 - this.p2));
		this.txtDiferenciaHoyCx.setText(this.valorFormateado(this.p3 - this.p4));
		this.txtDiferenciaHoyHos.setText(this.valorFormateado(this.p5 - this.p6));
		this.txtDiferenciaHoyUciN.setText(this.valorFormateado(this.p7 - this.p8));
		this.txtDiferenciaHoyUciA.setText(this.valorFormateado(this.p9 - this.p10));
		this.txtDiferenciaHoyGin.setText(this.valorFormateado(this.p11 - this.p12));
		this.txtDiferenciaHoyImag.setText(this.valorFormateado(this.p13 - this.p14));
		this.txtDiferenciaHoyCe.setText(this.valorFormateado(this.p15 - this.p16));
		this.txtDiferenciaHoyTot.setText(this.valorFormateado(total - total3));
		this.txtDiferenciaAcuUrg.setText(this.valorFormateado(this.p17 - this.p18));
		this.txtDiferenciaAcuCx.setText(this.valorFormateado(this.p19 - this.p20));
		this.txtDiferenciaAcuHos.setText(this.valorFormateado(this.p21 - this.p22));
		this.txtDiferenciaAcuUciN.setText(this.valorFormateado(this.p23 - this.p24));
		this.txtDiferenciaAcuUciA.setText(this.valorFormateado(this.p25 - this.p26));
		this.txtDiferenciaAcuGin.setText(this.valorFormateado(this.p27 - this.p28));
		this.txtDiferenciaAcuImag.setText(this.valorFormateado(this.p29 - this.p30));
		this.txtDiferenciaAcuCe.setText(this.valorFormateado(this.p31 - this.p32));
		this.txtDiferenciaAcuTot.setText(this.valorFormateado(total2 - acuTot));
		this.llenarDatosOcupacion();
	}

	public String valorFormateado(final double valorP) {
		final DecimalFormat formateador = new DecimalFormat("###,###.##");
		final String valor = formateador.format(valorP);
		return valor;
	}

	public void pintarProgress(final JProgressBar jpb) {
		if (jpb.getValue() < 100) {
			jpb.setForeground(new Color(232, 109, 107));
		}
	}

	@Override
	public Image getIconImage() {
		final Image retValue = Toolkit.getDefaultToolkit()
				.getImage(ClassLoader.getSystemResource("Imagenes/Logosinfondo2.png"));
		return retValue;
	}

	public void ponerImagen1(final int valor) {
		if (valor >= 100) {
			this.jLabel1.setIcon(new ImageIcon(
					this.getClass().getResource("/Imagenes/alcance-la-meta-13166722 azul sin fondo pq 160 x 180.png")));
			this.jLabel1.setForeground(new Color(128, 130, 215));
		} else {
			this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/nometaroja.png")));
			this.jLabel1.setForeground(new Color(232, 109, 107));
		}
	}

	public void ponerImagen2(final int valor) {
		if (valor >= 100) {
			this.jLabel30.setIcon(new ImageIcon(
					this.getClass().getResource("/Imagenes/alcance-la-meta-13166722 azul sin fondo pq 160 x 180.png")));
			this.jLabel30.setForeground(new Color(128, 130, 215));
		} else {
			this.jLabel30.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/nometaroja.png")));
			this.jLabel30.setForeground(new Color(232, 109, 107));
		}
	}

	public void llenarDatosOcupacion() {
		final CtrlPresupuesto cp = new CtrlPresupuesto();
		final CtrlPresupuestoDiag cpd = new CtrlPresupuestoDiag();
		final List<Double[]> data6 = cpd.consultarUrgencias();
		final double data7 = cp.consultarOcupacionCirugia();
		final List<Double[]> data8 = cp.consultarGineco();
		final List<Double[]> data9 = cpd.consultarImagenes();
		final List<Double[]> data10 = cpd.consultarConsultaExt();
		final Double[] valor = data6.get(0);
		final Double[] valor2 = data6.get(1);
		final double val = valor[0] + valor2[0];
		this.txtOcupacionUrg.setText(this.valorFormateado(val));
		this.txtOcupacionCx.setText(this.valorFormateado(data7));
		final Double[] valor3 = data8.get(0);
		final Double[] valor4 = data8.get(1);
		final Double[] valor5 = data8.get(2);
		final double val2 = valor3[0] + valor4[0] + valor5[0];
		this.txtOcupacionGin.setText(this.valorFormateado(val2));
		final Double[] valor6 = data9.get(0);
		final Double[] valor7 = data9.get(1);
		final Double[] valor8 = data9.get(2);
		final Double[] valor9 = data9.get(3);
		final Double[] valor10 = data9.get(4);
		final Double[] valor11 = data9.get(5);
		final double val3 = valor6[0] + valor7[0] + valor8[0] + valor9[0] + valor10[0] + valor11[0];
		this.txtOcupacionImag.setText(this.valorFormateado(val3));
		final Double[] valor12 = data10.get(0);
		final double val4 = valor12[0];
		this.txtOcupacionCe.setText(this.valorFormateado(val4));
	}

	public void MiTimer() {
		final int delay = 600000;
		final ActionListener taskPerformer = new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent evt) {
				Consulta.this.llenarDatos();
			}
		};
		new Timer(delay, taskPerformer).start();
	}
}