package tp3;
import java.util.Scanner;

public class Test_MaDate {

    public static void main(String[] args) {
        
        MaDate d1 = new MaDate(2003);         
        MaDate d2 = new MaDate(01, 10, 2003);  
        MaDate d3 = new MaDate(25, 03, 2015);  
        
        System.out.println("d1 annee : " + d1.getannee());  
        System.out.println("d2 jour : " + d2.getjour());  
        
        d3.setjour(20);  

        System.out.println("date 1:");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        
        Scanner s = new Scanner(System.in);
        System.out.println("votre choix (1: ajouter un jour, 2: Ajouter plusieurs jours, 3: ajouter un mois, 4: ajouter une annee):");
        int choix = s.nextInt();
        
        while (choix > 5 || choix < 1) {
            System.out.println("Please re-enter a valid choice (1-4):");
            choix = s.nextInt();
        }
        
        switch (choix) {
            case 1:
                d1.ajouterUnJour();
                break;
            case 2:
            	int j = s.nextInt();
                d1. ajouterPluseursJours(j);  
                break;
            case 3:
                d1.ajouterUnMois();
               
                break;
            case 4:
                d1. ajouterUnAn();
               
                break;
        }
       
        System.out.println("Updated Dates:");
        System.out.println(d2.toString());
        
        s.close();
    }
}