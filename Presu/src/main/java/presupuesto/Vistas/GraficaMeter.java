package presupuesto.Vistas;

import org.jfree.chart.plot.Plot;
import org.jfree.chart.JFreeChart;
import java.awt.Font;
import org.jfree.chart.plot.DialShape;
import java.awt.Stroke;
import java.awt.Paint;
import org.jfree.chart.plot.MeterInterval;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.data.Range;
import org.jfree.data.general.ValueDataset;
import org.jfree.chart.plot.MeterPlot;
import java.awt.image.BufferedImage;
import org.jfree.data.general.DefaultValueDataset;

public class GraficaMeter {
	public DefaultValueDataset dataset;

	public GraficaMeter() {
		this.dataset = new DefaultValueDataset(0.0);
	}

	public BufferedImage GraficaMeterPlot(final String titulo, final Object rangobajo, final Object rangomedio,
			final Object rangoalto, final Object rangototal, final Object valor) {
		final double rangobajod = (double) rangobajo;
		final double rangomediod = (double) rangomedio;
		final double rangoaltod = (double) rangoalto;
		final double rangototald = (double) rangototal;
		final double valord = (double) valor;
		this.dataset.setValue((Number) valord);
		final MeterPlot meterplot = new MeterPlot((ValueDataset) this.dataset);
		meterplot.setRange(new Range(0.0, rangototald));
		meterplot.addInterval(new MeterInterval("Bajo", new Range(0.0, rangobajod), (Paint) Color.red,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(255, 0, 0, 128)));
		meterplot.addInterval(new MeterInterval("Moderado", new Range(rangobajod, rangomediod), (Paint) Color.yellow,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(255, 255, 0, 64)));
		meterplot.addInterval(new MeterInterval("Alto", new Range(rangomediod, rangoaltod), (Paint) Color.green,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(0, 255, 0, 64)));
		meterplot.setNeedlePaint((Paint) Color.darkGray);
		meterplot.setDialBackgroundPaint((Paint) Color.white);
		meterplot.setDialOutlinePaint((Paint) Color.black);
		meterplot.setDialShape(DialShape.CHORD);
		meterplot.setMeterAngle(180);
		meterplot.setTickLabelsVisible(true);
		meterplot.setTickLabelFont(new Font("Arial", 1, 10));
		meterplot.setTickLabelPaint((Paint) Color.black);
		meterplot.setTickSize(0.1);
		meterplot.setTickPaint((Paint) Color.gray);
		meterplot.setValuePaint((Paint) Color.black);
		meterplot.setValueFont(new Font("Arial", 1, 10));
		final JFreeChart jfreechart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, (Plot) meterplot, false);
		final BufferedImage imagen = jfreechart.createBufferedImage(200, 130);
		return imagen;
	}

	public BufferedImage GraficaMeterPlotInvertido(final String titulo, final Object rangobajo, final Object rangomedio,
			final Object rangoalto, final Object rangototal, final Object valor) {
		final double rangobajod = (double) rangobajo;
		final double rangomediod = (double) rangomedio;
		final double rangoaltod = (double) rangoalto;
		final double rangototald = (double) rangototal;
		final double valord = (double) valor;
		this.dataset.setValue((Number) valord);
		final MeterPlot meterplot = new MeterPlot((ValueDataset) this.dataset);
		meterplot.setRange(new Range(0.0, rangototald));
		meterplot.addInterval(new MeterInterval("Bajo", new Range(0.0, rangoaltod), (Paint) Color.green,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(0, 255, 0, 64)));
		meterplot.addInterval(new MeterInterval("Moderado", new Range(rangoaltod, rangomediod), (Paint) Color.yellow,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(255, 255, 0, 64)));
		meterplot.addInterval(new MeterInterval("Alto", new Range(rangomediod, rangobajod), (Paint) Color.red,
				(Stroke) new BasicStroke(2.0f), (Paint) new Color(255, 0, 0, 128)));
		meterplot.setNeedlePaint((Paint) Color.darkGray);
		meterplot.setDialBackgroundPaint((Paint) Color.white);
		meterplot.setDialOutlinePaint((Paint) Color.black);
		meterplot.setDialShape(DialShape.CHORD);
		meterplot.setMeterAngle(180);
		meterplot.setTickLabelsVisible(true);
		meterplot.setTickLabelFont(new Font("Arial", 1, 10));
		meterplot.setTickLabelPaint((Paint) Color.black);
		meterplot.setTickSize(0.1);
		meterplot.setTickPaint((Paint) Color.gray);
		meterplot.setValuePaint((Paint) Color.black);
		meterplot.setValueFont(new Font("Arial", 1, 10));
		final JFreeChart jfreechart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, (Plot) meterplot, false);
		final BufferedImage imagen = jfreechart.createBufferedImage(200, 130);
		return imagen;
	}
}