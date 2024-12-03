public class SalleCours extends Salle {

    public boolean videoProj ;

    public SalleCours(float surface, int nbPlaces, String departement, boolean connected, boolean videoProj) {
        super(surface, nbPlaces, departement, connected);
        this.videoProj = videoProj;
    }

    @Override  
    public void decrire() {
        System.out.println("Salle [num=" + num + ", surface=" + surface + ", departement=" + departement + ", vedioprojecteur=" + videoProj+ "]");
    }
    



    
    
}
