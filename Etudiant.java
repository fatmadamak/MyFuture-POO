import java.util.Scanner;
public class Etudiant {
  String codeE;
  String nom;
  String prenom;
  int age;
  String ville;
  // Constructeur
  public Etudiant(String code, String nom, String prenom, int age, String ville) {
    this.codeE = code;
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.ville = ville;
  }
  // getters et setters du nom et prenom
  public String getNom() {
    return nom;
  }
  public String getPrenom() {
    return prenom;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  // methode pour saisir les informations d'un étudiant en utilisant Scanner
  public void saisirEtudiant() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le code de l'étudiant : ");
    this.codeE = scanner.nextLine();
    System.out.print("Entrez le nom de l'étudiant : ");
    this.nom = scanner.nextLine();
    System.out.print("Entrez le prénom de l'étudiant : ");
    this.prenom = scanner.nextLine();
    System.out.print("Entrez l'âge de l'étudiant : ");
    this.age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Entrez la ville de l'étudiant : ");
    this.ville = scanner.nextLine();
  }
  // methode pour afficher les informations d'un étudiant
  public void afficherEtudiant() {
    System.out.println("Code de l'étudiant : " + this.codeE);
    System.out.println("Nom de l'étudiant : " + this.nom);
    System.out.println("Prénom de l'étudiant : " + this.prenom);
    System.out.println("Âge de l'étudiant : " + this.age);
    System.out.println("Ville de l'étudiant : " + this.ville);
  }
  // methode pour creer un tableau de 3 notes d'etudiants
  public static double[] creerTableauNotes() {
    Scanner scanner = new Scanner(System.in);
    double[] notes = new double[3];
    for (int i = 0; i < notes.length; i++) {
      System.out.print("Entrez la note " + (i + 1) + " : ");
      notes[i] = scanner.nextDouble();
    }
    return notes;
  }
  // methode pour afficher la plus grande valeur des notes d'un étudiant
  public static double afficherPlusGrandeNote(double[] notes) {
    double max = notes[0];
    for (int i = 1; i < notes.length; i++) {
      if (notes[i] > max) {
        max = notes[i];
      }
    }
    return max;
  }

  //la methode main pour tester tous les methodes
  public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
    Etudiant etudiant = new Etudiant("", "", "", 0, "");
    int choix;
    do {
      System.out.println("\n===== MENU PRINCIPAL =====");
      System.out.println("1. Saisir et afficher les informations");
      System.out.println("2. Création et affichage des notes");
      System.out.println("3. Quitter");
      System.out.print("Votre choix : ");
      choix = scanner.nextInt();
      scanner.nextLine();
      switch (choix) {
        case 1:
          System.out.println("\n--- Saisie de l'étudiant ---");
          etudiant.saisirEtudiant();

          System.out.println("\n--- Informations de l'étudiant ---");
          etudiant.afficherEtudiant();
          break;
        case 2:
          System.out.println("\n--- Saisie des notes ---");
          double[] notes = creerTableauNotes();

          System.out.println("\n--- Affichage des notes ---");
          for (int i = 0; i < notes.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + notes[i]);
          }
          System.out.println("\n--- Affichage de la plus grande note ---");
          double maxNote = afficherPlusGrandeNote(notes);
          System.out.println("La plus grande note est : " + maxNote);
          break;

        case 3:
          System.out.println("Fin du programme. Au revoir !");
          break;

        default:
          System.out.println("Choix invalide ! Réessayez.");
      }
    } while (choix != 3);
    scanner.close();
  }
}