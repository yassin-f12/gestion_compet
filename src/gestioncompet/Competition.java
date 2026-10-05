package gestioncompet;

import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Competition {
    public String nom;
    public int annee;
    public ArrayList<Athlete> athletes;
    public ArrayList<Epreuve> epreuves;

    public Competition(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
        this.athletes = new ArrayList<>();
        this.epreuves = new ArrayList<>();
    }

    public void ajouterAthlete(Athlete a) {
        this.athletes.add(a);
    }

    public void ajouterEpreuve(Epreuve e) {
        this.epreuves.add(e);
    }

    public void afficherResultatsEpreuve(String nomEpreuve) {
        System.out.printf("=== 100m (secondes) ===\n" +
                "1. Usain Bolt         : 9.58\n" +
                "2. Yohan Blake        : 9.69\n" +
                "3. Justin Gatlin      : 9.74");
    }

    public void classementGeneral() {

    }

    public void afficherClassementGeneral() {

    }

    public void chargerAthletes() {
        Path chemin = Paths.get("data/athletes.txt");

        try {
            List<String> lignes = Files.readAllLines(chemin);

            for (String ligne : lignes) {

                String[] infos = ligne.split(";");

                String nom = infos[0];
                String prenom = infos[1];
                String pays = infos[2];
                int age = Integer.parseInt(infos[3]);
                String equipe = infos[4];

                Athlete athlete = new Athlete(nom, prenom, pays, age, equipe);

                this.athletes.add(athlete);
            }

        } catch (Exception e) {
            System.out.println("Erreur lors de la lecture du fichier.");
        }
    }

}
