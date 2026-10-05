package gestioncompet;

import java.util.ArrayList;

public class Athlete {

    String nom;
    String prenom;
    String pays;
    int age;
    String equipe;
    ArrayList<Athlete> users = new ArrayList<Athlete>();

    public Athlete (String firstName, String lastName, String country, int userAge, String userEquipe) {
        this.nom = firstName;
        this.prenom = lastName;
        this.pays = country;
        this.age = userAge;
        this.equipe = userEquipe;
    }

    public void createInfos( Athlete user ) {
        this.users.add(user);
        System.out.println("L'athlète a été créé et ajouté à la liste.");
    }

    public void showAllInfos() {
        for (Athlete user : this.users) {
            System.out.println(
                    user.nom + " " +
                            user.prenom + "\n" +
                            user.age + "\n" +
                            user.pays + "\n" +
                            user.equipe
            );
            System.out.println("_______________________________");
        }
    }

    public void deletInfos(String name) {
        for (Athlete user : this.users) {
            if (user.nom.equals(name) || user.prenom.equals(name)) {
                this.users.remove(name);
                System.out.println("Athlete supprimé");
                return;
            } else {
                System.out.println("Athlete non trouvé.");
            }
        }
    }

    public void showOneInfos(String name) {
        for (Athlete user : this.users) {
            if (user.nom.equals(name) || user.prenom.equals(name)) {
                System.out.println(
                        user.nom + " " +
                                user.prenom + "\n" +
                                user.age + "\n" +
                                user.pays + "\n" +
                                user.equipe
                );
                return;
            } else {
                System.out.println("L'athlète n'est pas présent dans la liste.");
            }
        }
    }

}
