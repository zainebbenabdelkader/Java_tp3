package tp3;

public class MaDate {
    private int jour;
    private int mois;
    private int annee;

    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public MaDate(int annee) {
        this.jour = 1;
        this.mois = 1;
        this.annee = annee;
    }
    public int getjour() {
        return jour;
    }

    public void setjour(int jour) {
        this.jour = jour;
    }

    public int getmois() {
        return mois;
    }

    public void setmois(int mois) {
        this.mois = mois;
    }

    public int getannee() {
        return annee;
    }

    public void setannee(int annee) {
        this.annee = annee;
    }

  
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

   
    public boolean Day(MaDate p) {
        return this.jour == p.jour;//////////switch///if///while//
    }

    public void ajouterUnJour() {
        jour++;
       
        int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (jour > joursParMois[mois-1]) {
            jour = 1; 
            mois++;  

            if (mois > 12) {
                mois = 1; 
                annee++;  }
        }}
    public void  ajouterPluseursJours(int n) {
    	int i;
    	for(i=1;i<n;i++) {
    		ajouterUnJour();
    		jour=i;
    		
    	}
  
    }
   public void ajouterUnMois() {
	   jour = 1; 
       mois++;
   }
   public void ajouterUnAn() {
	  if(mois>12)
	   annee++;
	   
   }
   
   
}
