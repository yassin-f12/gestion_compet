import java.util.Scanner;
import gestioncompet.Competition;
import gestioncompet.Athlete;
import gestioncompet.Epreuve;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Competition competition = new Competition("hell", 2026);
        int option = 0;

        //ajouter "afficher liste athlete"
        while (option !=6) {
            System.out.println("--------------------------------");
            System.out.println("1 - Voir tous les athlètes disponible");
            System.out.println("2 - Ajouter un athlète à la compétition");
            System.out.println("3 - Ajouter une épreuve");
            System.out.println("4 - Afficher les résultats d'une épreuve");
            System.out.println("5 - Afficher le classement général");
            System.out.println("6 - Quitter");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    // appel de methode voir athlète
                    break;
                case 2: // add athlète
                    System.out.print("Nom de l'athlète : ");
                    String nom = sc.nextLine();

                    System.out.print("Prénom : ");
                    String prenom = sc.nextLine();

                    System.out.print("Pays : ");
                    String pays = sc.nextLine();

                    System.out.print("Âge : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Équipe : ");
                    String equipe = sc.nextLine();

                    Athlete athlete = new Athlete(nom, prenom, pays, age, equipe);
                    competition.ajouterAthlete(athlete);

                    System.out.println( nom + " ajouté à la " + competition.nom + " " + competition.annee + " avec succès !");
                    System.out.print("Appuyez sur entrée pour confirmer...");
                    sc.nextLine();
                    break;
                case 3: // add epreuve
                    System.out.print("Nom de l'épreuve : ");
                    String nomEpreuve = sc.nextLine();

                    System.out.print("Type (individuel/equipe) : ");
                    String type = sc.nextLine();

                    System.out.print("Unité (secondes/metres/points) : ");
                    String unite = sc.nextLine();

                    System.out.print("Sens du classement (ASC/DESC) : ");
                    String sensTri = sc.nextLine();

                    Epreuve epreuve = new Epreuve(nomEpreuve, type, unite, sensTri);
                    competition.ajouterEpreuve(epreuve);

                    System.out.println( nomEpreuve + " ajouté à la " + competition.nom + " " + competition.annee + " avec succès !");
                    System.out.print("Appuyez sur entrée pour confirmer...");
                    sc.nextLine();

                    break;
                case 4: // read result epreuve
                    System.out.print("Nom de l'épreuve : ");
                    String rechercheEpreuve = sc.nextLine();

                    competition.afficherResultatsEpreuve(rechercheEpreuve);
                    break;
                case 5: // read classement
                    break;
                case 6: // quit
                    System.out.println("Au revoir !");
                    break;
            }
        }
    }
}