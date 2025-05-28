package Calculatrice;

public class Multiplication extends OperationBinaire {

	public Multiplication(double v1, double v2) {
		super(v1, v2);
	}

	@Override
	public double Calculer() {
		return v1*v2;
	}

}
