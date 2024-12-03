abstract class Salle {
    private static int currentNum=101;
    protected int num ;
    protected float surface ;
    private int nbPlaces ;
    protected String departement ;
    private boolean connected ;


    public Salle(float surface, int nbPlaces, String departement, boolean connected) {
        this.num=currentNum ++;
        this.surface = surface;
        this.nbPlaces = nbPlaces;
        this.departement = departement;
        this.connected = connected;
    }


    public float getSurface() {
        return surface;
    }

    public boolean isConnected(){
        return(connected); 
    }

    abstract public void decrire() ;


    public int getNum() {
        return num;
    }


    public int getNbPlaces() {
        return nbPlaces;
    }


    public String getDepartement() {
        return departement;
    }

    
    
    


    


    
}