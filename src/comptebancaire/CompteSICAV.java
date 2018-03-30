/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;

/**
 *
 * @author nico
 */
public class CompteSICAV extends CompteEpargne {

    public CompteSICAV(String numCompte, double tauxInteret) {
        super(numCompte, tauxInteret);
    }

    @Override
    public boolean deposerArgent(int montant) {
        //Droits d'entrée de 5
        montant -= 5;//ou montant = montant - 5;
        return super.deposerArgent(montant);
    }
}
