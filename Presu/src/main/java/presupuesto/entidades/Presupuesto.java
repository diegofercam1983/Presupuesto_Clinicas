package presupuesto.entidades;

public class Presupuesto {
	private int oid;
	private int ccostos;
	private int anio;
	private int mes;
	private double ppto;
	private double facturado;
	private double facturadoacu;
	private double presupuestohoy;
	private double presupuestoacu;
	private int codp;
	private String nomp;

	public Presupuesto() {
	}

	public Presupuesto(final int oid, final int ccostos, final int anio, final int mes, final double ppto,
			final double facturado, final double facturadoacu, final double presupuestohoy, final double presupuestoacu,
			final int codp, final String nomp) {
		this.oid = oid;
		this.ccostos = ccostos;
		this.anio = anio;
		this.mes = mes;
		this.ppto = ppto;
		this.facturado = facturado;
		this.facturadoacu = facturadoacu;
		this.presupuestohoy = presupuestohoy;
		this.presupuestoacu = presupuestoacu;
		this.codp = codp;
		this.nomp = nomp;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(final int anio) {
		this.anio = anio;
	}

	public int getCcostos() {
		return this.ccostos;
	}

	public void setCcostos(final int ccostos) {
		this.ccostos = ccostos;
	}

	public int getCodp() {
		return this.codp;
	}

	public void setCodp(final int codp) {
		this.codp = codp;
	}

	public double getFacturado() {
		return this.facturado;
	}

	public void setFacturado(final double facturado) {
		this.facturado = facturado;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(final int mes) {
		this.mes = mes;
	}

	public String getNomp() {
		return this.nomp;
	}

	public void setNomp(final String nomp) {
		this.nomp = nomp;
	}

	public int getOid() {
		return this.oid;
	}

	public void setOid(final int oid) {
		this.oid = oid;
	}

	public double getPpto() {
		return this.ppto;
	}

	public void setPpto(final double ppto) {
		this.ppto = ppto;
	}

	public double getFacturadoacu() {
		return this.facturadoacu;
	}

	public void setFacturadoacu(final double facturadoacu) {
		this.facturadoacu = facturadoacu;
	}

	public double getPresupuestoacu() {
		return this.presupuestoacu;
	}

	public void setPresupuestoacu(final double presupuestoacu) {
		this.presupuestoacu = presupuestoacu;
	}

	public double getPresupuestohoy() {
		return this.presupuestohoy;
	}

	public void setPresupuestohoy(final double presupuestohoy) {
		this.presupuestohoy = presupuestohoy;
	}
}