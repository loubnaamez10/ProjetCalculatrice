package Calculatrice;

public class Exp extends OperationUnaire {

	public Exp(double v) {
		super(v);
	}

	@Override
	public double Calculer() {
		return Math.exp(v);
	}

}
