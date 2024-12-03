public class Labo extends Salle {

    public int nbPC;

    public Labo(float surface, int nbPlaces, String departement, boolean connected, int nbPC) {
        super(surface, nbPlaces, departement, connected);
        this.nbPC = nbPC;
    }

    @Override
    public void decrire() {
        System.out.println("Salle [num=" + num + ", surface=" + surface + ", departement=" + departement + ", nbPC=" + nbPC + "]");
    }

    public int getNbPC() {
        return nbPC;
    }
    


    
    
}
