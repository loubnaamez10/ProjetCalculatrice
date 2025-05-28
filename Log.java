package Calculatrice;

public class Log extends OperationUnaire {

	public Log(double v) {
		super(v);
	}

	@Override
	public double Calculer() {
		if (v <= 0) {
	      System.out.println(" ERREUR, SAISISSEZ UN NOMBRE STRICTEMENT POSITIF ET NON NUL ");
	    } 
	
		return Math.log(v);
	}

}
