package gestioncompet;

import java.util.ArrayList;

public class Athlete {

    String nom;
    String prenom;
    String pays;
    int age;
    String equipe;

    public Athlete (String firstName, String lastName, String country, int userAge, String userEquipe) {
        this.nom = firstName;
        this.prenom = lastName;
        this.pays = country;
        this.age = userAge;
        this.equipe = userEquipe;
    }
}