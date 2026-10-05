import java.util.Scanner;
import gestioncompet.Competition;

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
                    String a = sc.nextLine();
                    // remplacer (a) par add atlete
                    competition.ajouterAthlete(a);
                    System.out.println( a + " ajouté à la " + competition.nom + " " + competition.annee + " avec succès !");
                    System.out.print("Appuyez sur entrée pour confirmer...");
                    sc.nextLine();
                    break;
                case 3: // add epreuve
                    System.out.print("Nom de l'épreuve : ");
                    String e = sc.nextLine();

                    competition.ajouterEpreuve(e);
                    System.out.println( e + " ajouté à la " + competition.nom + " " + competition.annee + " avec succès !");
                    System.out.print("Appuyez sur entrée pour confirmer...");
                    sc.nextLine();

                    break;
                case 4: // read result epreuve
                    System.out.print("Nom de l'épreuve : ");
                    String nomEpreuve = sc.nextLine();

                    competition.afficherResultatsEpreuve(nomEpreuve);
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