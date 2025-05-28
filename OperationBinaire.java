package Calculatrice;

 public abstract class OperationBinaire implements CalculMath {
	 
	 protected double v1;
	 protected double v2;

	 public OperationBinaire (double v1, double v2) {
		 this.v1 = v1;
		 this.v2 = v2;
	 }
	 
	 @Override
	    public abstract double Calculer();

}
