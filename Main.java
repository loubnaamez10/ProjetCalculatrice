package Calculatrice;

import java.util.Scanner;

public class Main {
  
  protected double v1, v2, v;
  static double R;
  static String symbole;
   
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int M=1;
    
    while (M==1) {
     System.out.println(" CHOISISSEZ UNE OPERATION QUE VOUS SOUHAITEZ DE LA RESOUDRE : ");
     System.out.println(" 1. OPERATION BINAIRE (DEUX VALEURS) ");
     System.out.println(" 2. OPERATION UNAIRE (UNE SEULE VALEUR) ");
    
     System.out.println(" VOUS CHOISISSEZ : ");
    
    int Choix = sc.nextInt();
    
    if (Choix == 1) {              //Operation Binaire
      System.out.println(" CHOISISSEZ UNE DE CES OPERATIONS SUIVANTES : ");
      System.out.println(" 1. Addition ");
      System.out.println(" 2. Soustraction ");
      System.out.println(" 3. Multiplication ");
      System.out.println(" 4. Division ");
      
      System.out.println(" VOUS CHOISISSEZ : ");
      
      int OpBinaire = sc.nextInt();
      
      System.out.println(" ENTREZ LA PREMIERE VALEUR : ");
      double v1 = sc.nextDouble();
      
      System.out.println(" ENTREZ LA DEUXIEME VALEUR : ");
      double v2 = sc.nextDouble();
      
      // Si v2 = 0 en division, on affiche un message pour changer sa valeur
            if (OpBinaire == 4 && v2 == 0) {
                System.out.println(" IMPOSSIBLE DE DIVISER SUR 0, VEUILLEZ ENTRER A NOUVEAU LA DEUXIEME VALEUR : ");
                v2 = sc.nextDouble();
            }
      
      CalculMath binaire = null;
      
      switch (OpBinaire) {
      case 1:
        binaire = new Addition (v1, v2);
        R = binaire.Calculer();
        symbole = "+";
        break;
      case 2:
        binaire = new Soustraction (v1, v2);
        R = binaire.Calculer();
        symbole = "-";
        break;
      case 3:
        binaire = new Multiplication (v1, v2);
        R = binaire.Calculer();
        symbole = "*";
        break;
      case 4:
        binaire = new Division (v1, v2);
        R = binaire.Calculer();
        symbole = "/";
        break;
        default: 
          System.out.println(" ERREUR POUR CETTE OPERATION ");
          sc.close();
          return;
      }
      
      System.out.println(" LE RESULTAT DE VOTRE OPERATION EST: " +v1 + " " + symbole + " " + +v2 + " " + "=" + " " + +R);
         
     } else {                 //Operation Unaire
       System.out.println(" CHOISISSEZ UNE DE CES OPERATIONS SUIVANTES : ");
       System.out.println(" 1. Cos ");
       System.out.println(" 2. Sin ");
       System.out.println(" 3. Log ");
       System.out.println(" 4. Exp ");
       System.out.println(" 5. Sqrt ");
       
       System.out.println(" VOUS CHOISISSEZ : ");
       
       int OpUnaire = sc.nextInt();
       
       System.out.println(" ENTRER LA VALEUR : ");
       double v = sc.nextDouble();
       
             //si v<=0, on affiche un message pour changer sa valeur
       if (OpUnaire == 3 && v <= 0) {
         System.out.println(" ERREUR, SAISISSEZ UN NOMBRE STRICTEMENT POSITIF ET NON NUL : ");
         v = sc.nextDouble();
       }
       
                   //si v<0, on affiche un message pour changer sa valeur        
       if (OpUnaire == 5 && v < 0) {
         System.out.println(" ERREUR, SAISISSEZ UN NOMBRE POSITIF : ");
         v = sc.nextDouble();
       }
       
       CalculMath unaire = null;
       
       switch (OpUnaire) {
       case 1:
         unaire = new Cos(v);
         R = unaire.Calculer();
         symbole = "cos";
         break;
       case 2:
         unaire = new Sin(v);
         R = unaire.Calculer();
         symbole = "sin";
         break;
       case 3:
         unaire = new Log(v);
         R = unaire.Calculer(); 
         symbole = "log";
         break;
       case 4:
         unaire = new Exp(v);
         R = unaire.Calculer();
         symbole = "exp";
         break;
       case 5:
         unaire = new Sqrt(v);
         R = unaire.Calculer();
         symbole = "sqrt";
         break; 
         default: 
           System.out.println(" ERREUR POUR CETTE OPERATION ");
           sc.close();
           return;
        }
       
       System.out.println(" LE RESULTAT DE VOTRE OPERATION EST: " + symbole + + v + " = " + R);

       }
    
    System.out.println(" SI VOUS VOULEZ FAIRE UNE AUTRE OPERATION TAPEZ LE CHIFFRE 1, SINON TAPEZ UN AUTRE CHIFFRE QUELCONQUE ");
    System.out.println(" VOTRE CHOIX EST: ");
    M= sc.nextInt();
    }
    
    sc.close();
    System.out.println(" MERCI, PASSEZ UNE BONNE JOURNEE! ");
  }
}