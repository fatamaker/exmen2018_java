public class Bureau extends Salle {
   public String enseignants[] ;
   public static final int capacite = 5;

   int nbEnseignants ;


   


   public Bureau(float surface, int nbPlaces, String departement, boolean connected, String[] enseignants) {
    super(surface, nbPlaces, departement, connected);
  
    this.enseignants= new String[capacite];
    this.nbEnseignants=0;
   }




   @Override
   public void decrire(){
    System.out.println("Salle [num=" + num + ", surface=" + surface + ", departement=" + departement +  "]");
    for (int i=0;i<nbEnseignants;i++) {
        System.out.println("- " + enseignants[i]);
    }
   }

   public void ajoutEnseignant (String nomEns) throws BureauPleinException{

    if(nbEnseignants == capacite){
        throw new BureauPleinException("le bureau est plain");

    }
    enseignants[nbEnseignants]=nomEns;
    nbEnseignants++;    

   }


   
}
