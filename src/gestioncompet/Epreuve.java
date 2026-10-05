package gestioncompet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Epreuve {

    String nom;
    String type;
    String unite;
    String sensTri;
    Map<Athlete, Double> resultats = new HashMap<>();

    public Epreuve(String nom, String type, String unite, String sensTri){
        this.nom = nom;
        this.type = type;
        this.unite = unite;
        this.sensTri = sensTri;
    }

    public void enregistrerResultat(Athlete athlete ,double score) {
        resultats.put(athlete, score);
    }

    public Athlete[] classement(){
        ArrayList<Athlete> athletes = new ArrayList<>();
        for (Map.Entry<Athlete, Double> item : resultats.entrySet()) {
            athletes.add(item.getKey());
        }

        for (int i = 0; i < athletes.size(); i++) {
            for (int j = i + 1; j < athletes.size(); j++) {
                Athlete posi1 = athletes.get(i);
                Athlete posi2 = athletes.get(j);

                double score1 = resultats.get(posi1);
                double score2 = resultats.get(posi2);

                if (sensTri.equals("DESC")) {
                    if (score1 < score2) {
                        athletes.set(i, posi2);
                        athletes.set(j, posi1);
                    }
                } else if (sensTri.equals("ASC")) {
                    if (score1 > score2) {
                        athletes.set(i, posi2);
                        athletes.set(j, posi1);
                    }
                }
            }
        }

        Athlete[] athes = new Athlete[athletes.size()];
        for (int i = 0; i < athletes.size(); i++) {
            athes[i] = athletes.get(i);
        }
        return athes;
    }
}
