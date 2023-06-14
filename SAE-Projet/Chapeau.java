//Importation des classes
import java.util.ArrayList;
import ardoise.Segment;
import ardoise.Forme;
import ardoise.PointPlan;

public class Chapeau extends Forme {    //Heritage de la classe Forme
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;

    //Constructeur de lla classe
    public Chapeau(String nomForme, PointPlan p1, PointPlan p2, PointPlan p3) {
        super(nomForme);
        //Test qui verifie si les points sont null
        if (p1 == null || p2 == null || p3 == null) {
            throw new IllegalArgumentException("Les points ne peuvent pas être null");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //Methode dessiner
    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(p1, p2));
        segments.add(new Segment(p2, p3));
        return segments;
    }

    //Methode deplacer
    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        p1.deplacer(deplacementX, deplacementY);
        p2.deplacer(deplacementX, deplacementY);
        p3.deplacer(deplacementX, deplacementY);
        
    }

    //Methode typeForme
    @Override
    public String typeForme() {
        return "C";
    }
}
