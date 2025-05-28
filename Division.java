package Calculatrice;

public class Division extends OperationBinaire {

	public Division(double v1, double v2) {
		super(v1, v2);
	}

	@Override
	public double Calculer() {
		
        if (v2 == 0) {
           System.out.println(" IMPOSSIBLE DE DIVISER SUR 0, VEUILLEZ ENTRER A NOUVEAU LA DEUXIEME VALEUR ");
        } 
        
		return v1/v2;
	}

}