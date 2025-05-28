package Calculatrice;

public class Cos extends OperationUnaire {

	public Cos (double v) {
		super (v);
	}

	@Override
	public double Calculer() {
		return Math.cos(v);
	}

}
