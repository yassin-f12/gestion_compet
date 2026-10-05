package gestioncompet;
import java.util.ArrayList;

public class Competition {
    String nom;
    int annee;
    ArrayList<Athlete> athletes;
    ArrayList<Epreuve> epreuves;

    Competition(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
        this.athletes = new ArrayList<>();
        this.epreuves = new ArrayList<>();
    }

    void ajouterAthletes(String a) {
        this.athletes.add(a);
    }

    void ajouterEpreuve(String e) {
        this.epreuves.add(e);
    }

    void afficherResultatsEpreuve(String nomEpreuve) {

    }
    void classementGeneral() {

    }
    void afficherClassementGeneral() {

    }

}
