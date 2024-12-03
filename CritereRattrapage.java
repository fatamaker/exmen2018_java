public class CritereRattrapage implements CritereReservation  {

    public int nbPlaces_rattrapage;

    public CritereRattrapage(int nbPlaces_rattrapage) {
        this.nbPlaces_rattrapage = nbPlaces_rattrapage;
    }

    @Override
    public boolean peutEtreReservee(Salle s){

        return (s instanceof SalleCours && ((SalleCours)s).videoProj && s.getNbPlaces()>=nbPlaces_rattrapage);

    }

    

    
}
