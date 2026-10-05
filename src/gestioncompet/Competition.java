package gestioncompet;

public class Competition {
    String nom;
    int annee;
    ArrayList<String> athletes;
    ArrayList<String> epreuves;

    Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.annee = anee;
        this.athletes = new ArrayList<>();
        this.epreuves = new ArrayList<>();
    }

    void ajouterAthletes(String a) {
        this.athletes.add(a);
    }

    void ajouterEpreuve(String e) {
        this.epreuves.add(e);
    }


}
