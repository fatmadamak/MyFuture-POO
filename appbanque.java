import java.util.Scanner;
public class appbanque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cin;
        String nom;
        String prenom;
        int ncompte;

        final float plafond_retrait = 500.00f;

        System.out.println("Veuillez saisir cin");
        cin = sc.nextInt();
        //System.out.println("cin est " + cin);

        sc.nextLine(); // important

        System.out.println("Veuillez saisir votre nom");
        nom = sc.nextLine();
        //System.out.println("nom est " + nom);

        System.out.println("Veuillez saisir votre prenom");
        prenom = sc.nextLine();
        //System.out.println("prenom est " + prenom);

        System.out.println("Veuillez saisir votre numero de compte");
        ncompte = sc.nextInt();
       // System.out.println("numero de compte est " + ncompte);
       int choix;

        do {
            System.out.println("1. consulter compte");
            System.out.println("2. deposer montant");
            System.out.println("3. retirer montant");
            System.out.println("4. quitter");

            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(nom + " " + prenom + " " + cin);
                    System.out.println(ncompte);
                    System.out.println("solde");
                    System.out.println("plafond");
                    break;
                }
            
        } while (choix != 4);
        sc.close();
    }
}
                  