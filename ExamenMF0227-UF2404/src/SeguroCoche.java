
public class SeguroCoche extends Poliza {
	
	protected String matricula;
	protected int anyoCarnet;
	

	public SeguroCoche() {
		super();
	}

	public SeguroCoche(String idPoliza, String mombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico) {
		super(idPoliza, mombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
	}
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnyoCarnet() {
		return anyoCarnet;
	}

	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}
	
	

	@Override
	public String toString() {
		return "SeguroCoche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + ", getMatricula()="
				+ getMatricula() + ", getAnyoCarnet()=" + getAnyoCarnet() + ", calcularPrima()=" + calcularPrima()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPrima() {
		return 0;
	}

}
