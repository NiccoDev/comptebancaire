package comptebancaire;

/**
 *
 * @author nico
 */
public class CompteEpargne extends CompteBancaire {

    protected double tauxInteretAnnuel;

    //Constructeur
    /**
     *
     * @param numCompte
     * @param tauxInteret
     */
    public CompteEpargne(String numCompte, double tauxInteret) {
        super(numCompte);
        this.tauxInteretAnnuel = tauxInteret;
    }//fin du constructeur

    //Méthodes
    public void servirInteret() {
        //Pour convertir le calcul du solde en interger car le taux est en double et le solde en int
        //Calcul du nouveau solde en appliquant les intérêts
        //conversion de ce résultat en entier (in)
        solde = (int) (solde * (1 + tauxInteretAnnuel));
    }//fin de méthode servirInterets

}
