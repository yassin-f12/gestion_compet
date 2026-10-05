package gestioncompet;
import java.util.ArrayList;

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

    public void ajouterAthlete(String a) {
        this.athletes.add(a);
    }

    public void ajouterEpreuve(String e) {
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

}
