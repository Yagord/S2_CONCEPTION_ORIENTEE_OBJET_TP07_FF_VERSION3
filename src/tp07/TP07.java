/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

/**
 *
 * @author Jean-Claude
 */
public class TP07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fenetre fenetre = new Fenetre("TP07");
        
        Bouton bouton = new Bouton("Test", 50, 100, 200, 50);
        fenetre.getJpanel().add(bouton);
        
        BoiteTexte boiteTexte = new BoiteTexte("Test", 50, 150, 200, 50);
        fenetre.getJpanel().add(boiteTexte);
        
        BoutonRadio boutonRadio1 = new BoutonRadio("Test1", 50, 200, 200, 50);
        BoutonRadio boutonRadio2 = new BoutonRadio("Test2", 50, 250, 200, 50);
        BoutonRadio boutonRadio3 = new BoutonRadio("Test3", 50, 300, 200, 50);
        
        fenetre.getJpanel().add(boutonRadio1);
        fenetre.getJpanel().add(boutonRadio2);
        fenetre.getJpanel().add(boutonRadio3);
        
        
        BoutonGroupe boutonGroupe = new BoutonGroupe();
        boutonGroupe.ajouteBouton(boutonRadio1);
        boutonGroupe.ajouteBouton(boutonRadio2);
        boutonGroupe.ajouteBouton(boutonRadio3);
        
        String[] text = {"Test1", "Test2", "Test3"};
        
        Combo combo = new Combo(text, 50, 350, 200, 50);
        combo.ajoute("Test Ajoute Manuellement");
        combo.retire("Test2");
        
        fenetre.getJpanel().add(combo);
        //System.out.println(combo.getItem(1));
        
        Liste liste = new Liste(new javax.swing.DefaultListModel(), 50, 400, 200, 50);
        liste.ajoute("Test Ajoute Manuellement1");
        liste.ajoute("Test Ajoute Manuellement2");
        liste.ajoute("Test Ajoute Manuellement3");
        liste.retire("Test Ajoute Manuellement2");
        
        fenetre.getJpanel().add(liste);
        //System.out.println(combo.getItem(1));
        
        fenetre.setVisible(true);
    }
    
}
