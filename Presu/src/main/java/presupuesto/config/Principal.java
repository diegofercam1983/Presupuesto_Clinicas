
package presupuesto.config;

import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JDialog;
import javax.swing.JFrame;
import presupuesto.Vistas.Consulta;

public class Principal {
	public static void main(final String[] args) {
		try {
			final Consulta consulta = new Consulta();
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI((Component) consulta);
			consulta.setVisible(true);
			consulta.setDefaultCloseOperation(3);
			consulta.setLocationRelativeTo((Component) null);
		} catch (final Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
}