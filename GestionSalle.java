public class GestionSalle {

    public Salle[] tabsalle ;
    public int nb;
    
    
    public GestionSalle() {
        this.tabsalle = new Salle[3];
        this.nb=0;
    }

    public void ajoutSalle(Salle salle){
        tabsalle[nb]=salle;
        nb++;
    }



    public static void main(String[] args) {


        GestionSalle gestionSalle= new GestionSalle() ;
        Salle sallecour1=new SalleCours(6,20, "gestion",true, false);
        Salle sallecour2=new SalleCours(15,35, "mecanique",false,true);
        Salle sallecour3=new SalleCours(20,18, "informatique",true, true);
        
        gestionSalle.ajoutSalle(sallecour1);
        gestionSalle.ajoutSalle(sallecour2);
        gestionSalle.ajoutSalle(sallecour3);

       
        for (int i=0;i<gestionSalle.nb;i++){
            Salle currentSalle = gestionSalle.tabsalle[i];
            if (currentSalle.isConnected()){
                if(currentSalle.getSurface()<8){
                    try{

                        Bureau bureau = new Bureau(
                            currentSalle.getSurface(),
                            currentSalle.getNbPlaces(),
                            currentSalle.getDepartement(),
                            true,
                            null
                        );

                        bureau.ajoutEnseignant("Alice");
                        bureau.ajoutEnseignant("Bob");

                        gestionSalle.tabsalle[i] = bureau;

                    }catch (BureauPleinException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    

                }
                else {
                
                    Labo labo = new Labo(currentSalle.getSurface(),currentSalle.getNbPlaces(),currentSalle.getDepartement(),true,7);
                    gestionSalle.tabsalle[i] = labo;
            }
         
        }
        

    }

    CritereRattrapage cRattrapage=new CritereRattrapage(30);
    for (int i=0;i<gestionSalle.nb;i++){
    
        if(cRattrapage.peutEtreReservee(gestionSalle.tabsalle[i])){
                System.out.println("Salle réservée pour le rattrapage:");
                gestionSalle.tabsalle[i].decrire();
       }

        
    }




}
}
