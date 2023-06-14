//Importation des classes
import java.util.ArrayList;
import ardoise.Segment;
import ardoise.Forme;
import ardoise.PointPlan;

public class Quadrilatere extends Forme {     //Heritage de la classe Forme
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    private PointPlan p4;

    //Constructeur de la classe
    public Quadrilatere(String nomForme, PointPlan p1, PointPlan p2, PointPlan p3, PointPlan p4) {
        super(nomForme);
        if (p1 == null || p2 == null || p3 == null || p4 == null) {
            throw new IllegalArgumentException("Les points ne peuvent pas etre nul");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    //Methode dessiner
    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(p1, p2));
        segments.add(new Segment(p2, p3));
        segments.add(new Segment(p3, p4));
        segments.add(new Segment(p4, p1));
        return segments;
    }

    //Methode deplacer
    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        p1.deplacer(deplacementX, deplacementY);
        p2.deplacer(deplacementX, deplacementY);
        p3.deplacer(deplacementX, deplacementY);
        p4.deplacer(deplacementX, deplacementY);
    }
    
    //Methode typeForme
    @Override
    public String typeForme() {
        return "Q";
    }
}
