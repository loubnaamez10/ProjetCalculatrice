package Calculatrice;

public class Sin extends OperationUnaire {

	public Sin(double v) {
		super(v);
	}

	@Override
	public double Calculer() {
		return Math.sin(v);
	}

}
