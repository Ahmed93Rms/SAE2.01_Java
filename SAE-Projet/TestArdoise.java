//Importation des classe
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Ardoise;

public class TestArdoise {      //Permet de tester l'ardoise
    public static void main(String[] args) {
        Ardoise ardoise = new Ardoise();   //Creation d'une nouvelle ardoise

//Oiseaux

        //Creation des point pour les 3 oiseaux
        PointPlan p1 = new PointPlan(118, 13);
        PointPlan p2 = new PointPlan(123, 20);
        PointPlan p3 = new PointPlan(128, 13);
        Forme oiseau1 = new Oiseau("oiseau 1", p1, p2, p3);
        ardoise.ajouterForme(oiseau1);   //Ajout de l'oiseau1 a l'adroise

        PointPlan p4 = new PointPlan(133, 30);
        PointPlan p5 = new PointPlan(136, 32);
        PointPlan p6 = new PointPlan(138, 30);
        Forme oiseau2 = new Oiseau("Oiseau 2", p4, p5, p6);
        ardoise.ajouterForme(oiseau2);    //Ajout de l'oiseau2 a l'adroise

        PointPlan p7 = new PointPlan(142, 14);
        PointPlan p8 = new PointPlan(144, 17);
        PointPlan p9 = new PointPlan(146, 14);
        Forme oiseau3 = new Oiseau("Oiseau 3", p7, p8, p9); 
        ardoise.ajouterForme(oiseau3);    //Ajout de l'oiseau3 a l'adroise

        
//Etoile

        //Creation des points et branches de l'étoile
        //Ces point et branches definissent des chapeaux qui seront chacun ajouté a l'ardoise
        PointPlan br1 = new PointPlan(170, 52);
        PointPlan br2 = new PointPlan(173, 45);
        PointPlan br3 = new PointPlan(177, 52);
        Forme etoile1 = new Chapeau("Etoile", br1, br2, br3);
        ardoise.ajouterForme(etoile1);
        
        PointPlan br4 = new PointPlan(177, 52);
        PointPlan br5 = new PointPlan(184, 57);
        PointPlan br6 = new PointPlan(177, 60);
        Forme etoile2 = new Chapeau("Etoile", br4, br5, br6);
        ardoise.ajouterForme(etoile2);
        
        PointPlan br7 = new PointPlan(177, 60);
        PointPlan br8 = new PointPlan(174, 66);
        PointPlan br9 = new PointPlan(170, 60);
        Forme etoile3 = new Chapeau("Etoile", br7, br8, br9);
        ardoise.ajouterForme(etoile3);
        
        PointPlan br10 = new PointPlan(170, 60);
        PointPlan br11 = new PointPlan(163, 57);
        PointPlan br12 = new PointPlan(170, 52);
        Forme etoile4 = new Chapeau("Etoile", br10, br11, br12);
        ardoise.ajouterForme(etoile4);
        
         
//Montagnes

        //Creation des points des montagnes 
        //Ces points definissent des triangles qui seront ajouté à l'ardoise
        PointPlan p14 = new PointPlan(3, 14);
        PointPlan p23 = new PointPlan(43, 3);
        PointPlan p31 = new PointPlan(112, 14);
        Forme montagne1 = new Triangle("Montagne 1", p14, p23, p31);
        ardoise.ajouterForme(montagne1);

        PointPlan p47 = new PointPlan(152, 7);
        PointPlan p56 = new PointPlan(166, 3);
        PointPlan p64 = new PointPlan(172, 7);
        Forme montagne2 = new Triangle("Montagne 2", p47, p56, p64);
        ardoise.ajouterForme(montagne2);


//Quadrilatères

        //Creation des points de la tour qui seront ajouté à l'ardoise
        PointPlan pTour1 = new PointPlan(9, 100);
        PointPlan pTour2 = new PointPlan(20, 100);
        PointPlan pTour3 = new PointPlan(20, 198);
        PointPlan pTour4 = new PointPlan(9, 198);
        Forme tour = new Quadrilatere("Tour", pTour1, pTour2, pTour3, pTour4);
        ardoise.ajouterForme(tour);


//Maison

        //Groupes de forme qui constitueront une maison
        GF Maison = new GF();
        //Les points de chaque forme definissent un chapeau et deux quadrilatère qui seront ajoutés à l'ardoise.
        // Corps maisonV
        PointPlan corpsSegment1 = new PointPlan(80, 140);
        PointPlan corpsSegment2 = new PointPlan(180, 140);
        PointPlan corpsSegment3 = new PointPlan(180, 198);
        PointPlan corpsSegment4 = new PointPlan(80, 198);
        Forme corpsMaison = new Quadrilatere("Corps maison", corpsSegment1, corpsSegment2, corpsSegment3, corpsSegment4);
        Maison.ajouterForme(corpsMaison);
        
        // Toit maisonV
        PointPlan toitSegment1 = new PointPlan(80, 140);
        PointPlan toitSegment2 = new PointPlan(130, 100);
        PointPlan toitSegment3 = new PointPlan(180, 140);
        Forme toitMaison = new Chapeau("Toit maison", toitSegment1, toitSegment2, toitSegment3);
        Maison.ajouterForme(toitMaison);
        
        // Porte maisonV
        PointPlan porteSegment1 = new PointPlan(120, 170);
        PointPlan porteSegment2 = new PointPlan(140, 170);
        PointPlan porteSegment3 = new PointPlan(140, 198);
        PointPlan porteSegment4 = new PointPlan(120, 198);
        Forme porteMaison = new Quadrilatere("Porte maison", porteSegment1, porteSegment2, porteSegment3, porteSegment4);
        Maison.ajouterForme(porteMaison);

        //ajout de la maison à l'ardoise
        ardoise.ajouterForme(Maison);

        //Dessine toutes les formes qui ont été ajouté l'ardoise
        ardoise.dessinerGraphique();


        try {
            Thread.sleep(1000);  //Attend une seconde
        } catch (InterruptedException e) {
        }
        ardoise.deplacer("O", 10, 20);   //Deplace les oiseaux 

    }
}