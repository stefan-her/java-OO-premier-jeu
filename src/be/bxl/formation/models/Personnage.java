package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Personnage {

    public String prenom;
    public String nom;
    public int force;
    public int pointVieMax = 20;
    public int pointVie = 20;
    public ArrayList<Integer> positionPossible = new ArrayList<>();
    public String position;


    public void bouger (String destination){
        boolean valide = true;

//        int i = 0;
//        do {
//            if(positionPossible.get(i) == destination) {
//                valide = true;
//                i = positionPossible.size();
//            }
//            i++;
//        } while (i < positionPossible.size());

        if(valide) {
            String textPattern = "Départ de %s vers %s";
            String text = String.format(textPattern, position, destination);
            System.out.println(text);
            position = destination;
        }
    }

    public void presentation () {
        String textPattern = "nom \"%s %s\", d'une force de %d et il me reste %d point de vie";
        String text = String.format(textPattern, prenom, nom, force, pointVie);
        System.out.println(text);
    }

    public void frapper (Personnage cible) {
        String textPattern = "%s frappe %s qui perd %d";
        cible.pointVie -= force;
        String text = String.format(textPattern, nom, cible.nom, cible.pointVie);
        System.out.println(text);
        if(cible.pointVie <= 0) {
            System.out.println("fin");
        }
    }
}
