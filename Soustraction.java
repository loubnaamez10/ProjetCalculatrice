package Calculatrice;

 public class Soustraction extends OperationBinaire {

	public Soustraction(double v1, double v2) {
		super(v1, v2);
	}

	@Override
	public double Calculer() {
		return v1-v2;
	}

}
