package Calculatrice;

public class Sqrt extends OperationUnaire {

	public Sqrt(double v) {
		super(v);
	}

	@Override
	public double Calculer() {
		if (v < 0) {
		      System.out.println(" ERREUR, SAISISSEZ UN NOMBRE POSITIF ");
		    } 
		
			return Math.sqrt(v);
		}

}
