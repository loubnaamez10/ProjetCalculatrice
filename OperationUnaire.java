package Calculatrice;

 public abstract class OperationUnaire implements CalculMath {
 
	protected double v;
	
	public OperationUnaire (double v) {
		this.v = v;
	}
	
	 @Override
	    public abstract double Calculer();

}
