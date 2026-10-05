import java.util.Scanner;
import gestioncompet.Competition;
import gestioncompet.Athlete;
import gestioncompet.Epreuve;
import gestioncompet.GestionAthlete;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static GestionAthlete management = new GestionAthlete();

    public static void main(String[] args) {

        String searchValue;

        Competition competition = new Competition("hell", 2026);
        int option = 1;

        //ajouter "afficher liste athlete"
        while (option !=0) {
            System.out.println("--------------------------------");
            System.out.println("1 - Voir tous les athlètes disponible");
            System.out.println("2 - Ajouter un athlète à la compétition");
            System.out.println("3 - Ajouter une épreuve");
            System.out.println("4 - Afficher les résultats d'une épreuve");
            System.out.println("5 - Afficher le classement général");
            System.out.println("6 - Rechercher un athlete par le nom");
            System.out.println("7 - Rechercher un athlete par le pays");
            System.out.println("8 - Rechercher un athlete par L'equipe");
            System.out.println("0 - Quitter");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    management.showAllInfos();
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
                    management.createInfos(athlete);

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

                case 6:
                    System.out.print("Entrez le nom de l'athlète : ");
                    searchValue = sc.nextLine();
                    management.showOneInfos(searchValue);
                    break;

                case 7:
                    System.out.print("Entrez le nom du pays : ");
                    searchValue = sc.nextLine();
                    management.filterByCoutry(searchValue);
                    break;

                case 8:
                    System.out.print("Entrez le nom de l'équipe : ");
                    searchValue = sc.nextLine();
                    management.filterByEquipe(searchValue);
                    break;
                case 0: // quit
                    System.out.println("Au revoir !");
                    break;
            }
        }
    }
}