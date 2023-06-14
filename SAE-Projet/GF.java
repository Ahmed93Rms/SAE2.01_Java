//Importation de classe
import java.util.ArrayList;
import ardoise.*;

public class GF extends Forme { //Heritage de la classe Forme

    private ArrayList<Forme> formes;  //Liste qui stocke les objets

    //Constructeur
    public GF() {
        super();
        formes = new ArrayList<Forme>();
    }

    //Methode ajouterForme
    public void ajouterForme(Forme forme) {
        if (forme == null) {
            throw new IllegalArgumentException("La forme ne peut pas etre nul");
        }
        formes.add(forme);
    }

    //Methode deplacer
    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        for (int i = 0; i < formes.size(); i++) {
            formes.get(i).deplacer(deplacementX, deplacementY);
        }
    }

    //Methode dessiner
    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        for (int i = 0; i < formes.size(); i++) {
            segments.addAll(formes.get(i).dessiner());
        }
        return segments;
    }

    //Methode typeForme
    @Override
    public String typeForme() {
        return "GF";}}
