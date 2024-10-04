package tp1_1;
public class Point{
    private int x;
    private int y;
    private String nom;
    public Point(String nom){
        this.nom=nom;
    }
    public Point(int a,int b){
        this.x=a;
        this.y=b;
    }
    public Point(String n,int a,int b){
        this.x=a;
        this.y=b;
        this.nom=n;
    }
    public void Affiche(){
        System.out.println("x="+this.x+"\ny="+this.y+"\nnom="+this.nom);
    }
    public int getAbscisse(){
        return this.x;
    }
    public int getOrdonnée(){
        return this.x;
    }
    public String getNom(){
        return this.nom;
    }
    public void setAbscisse(int a){
        this.x=a;
    }
    public void setOrdonnée(int b){
        this.y=b;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public int TranslHoriz(int a){
        return this.x+=a;
    }
    public int TranslVert(int b){
        return this.y+=b;
    }
    public void Translation(int a,int b){
        TranslHoriz(a);
        TranslVert(b);
    }
    public boolean Coincide(Point p){
        if (this.x == p.x && this.y==p.y){
            return true;
        }
        else{
            return false;
        }
    }

}