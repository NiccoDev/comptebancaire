package comptebancaire;

/**
 *
 * @author nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompteBancaire compteA = new CompteBancaire("A123");
        CompteBancaire compteB = new CompteBancaire("B123");

       
        compteA.deposerArgent(100);
        compteB.deposerArgent(50);

        System.out.println("Solde du compte A : " + compteA.getSolde());
        System.out.println("Solde du compte B : " + compteB.getSolde());
        
        //test retrait
        compteB.retirerArgent(10);
        compteA.retirerArgent(-100);
        
        System.out.println("Solde du compte A : " + compteA.getSolde());
        System.out.println("Solde du compte B : " + compteB.getSolde());
        
        //test transfert
        compteA.transfertArgent(50, compteB);
        
        System.out.println("Solde du compte A : " + compteA.getSolde());
        System.out.println("Solde du compte B : " + compteB.getSolde());     
 
    }
}
