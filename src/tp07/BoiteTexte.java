/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author Jean-Claude
 */
public class BoiteTexte extends JTextField implements Composant {
    private String texte;
    private int x;
    private int y;
    private int largeur;
    private int hauteur;
    
    public BoiteTexte(String texte, int x, int y, int largeur, int hauteur) {
        super(texte);
        this.texte = texte;
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
    public void paintComponent(Graphics gfx) {
        this.dessiner(gfx);
    }
    
    @Override
    public void dessiner(Graphics gfx) {
        super.paintComponent(gfx);
        this.setBounds(this.x, this.y, this.largeur, this.hauteur);
        this.setEditable(true);
    }

    @Override
    public void clic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clic(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void chercheComposant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getComposant(String texte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
