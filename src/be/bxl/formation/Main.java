package be.bxl.formation;

import be.bxl.formation.models.Personnage;

public class Main {
    public static void main(String[] args) {

        Personnage gentil = new Personnage();
        Personnage mechant = new Personnage();

        gentil.nom = "gentil";
        gentil.prenom = "le";
        gentil.force = 10;
        gentil.position = "village";

        mechant.nom = "mechant";
        mechant.prenom = "le";
        mechant.force = 15;
        mechant.position = "grotte";

        gentil.presentation();
        mechant.presentation();

        mechant.bouger("village");

        do {
            mechant.frapper(gentil);
        } while(gentil.pointVie > 0);
    }
}
