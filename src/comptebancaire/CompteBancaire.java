package comptebancaire;

/**
 *
 * @author nico
 */
public class CompteBancaire {

    protected String numCompte;

    protected int solde;

    //Constructeur
    public CompteBancaire(String numCompte, int solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public CompteBancaire(String numCompte) {
        this.numCompte = numCompte;
        this.solde = 0;
    }//fin du constructeur

    //Méthodes
    /**
     *
     * @return
     */
    public String getNumCompte() {
        return numCompte;
    }//fin de méthode getNumCompte

    /**
     *
     * @return
     */
    public int getSolde() {
        return solde;
    }//fin de méthode getSolde

    /**
     * Dépôt de fonds On ne peut déposer qu'une somme supérieure à zéro
     *
     * @param montant
     * @return
     */
    public boolean deposerArgent(int montant) {
        if (montant > 0) {
            solde += montant;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrait de fonds On ne peut retirer qu'une somme si le solde est
     * supérieur au montant retirer
     *
     * @param montant
     * @return
     */
    public boolean retirerArgent(int montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Transfert de fonds On ne peut transférer qu'une somme si le solde est
     * supérieur au montant transféré
     *
     * @param montant
     * @param compteDestination
     * @return
     */
    public boolean transfertArgent(int montant, CompteBancaire compteDestination) {
        if (retirerArgent(montant)) {
            if (compteDestination.deposerArgent(montant)) {
                return true;
            } else {
                deposerArgent(montant);
                return false;
            }
        } else {
            return false;
        }
    }
}//fin de classe CompteBancaire
