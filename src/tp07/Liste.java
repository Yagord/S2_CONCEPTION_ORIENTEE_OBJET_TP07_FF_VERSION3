/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JList;

/**
 *
 * @author Jean-Claude
 */
public class Liste extends JList implements Composant {
    //String[] texte;
    javax.swing.DefaultListModel listModel;
    private int x;
    private int y;
    private int largeur;
    private int hauteur;
    
    public Liste(javax.swing.DefaultListModel listModel, int x, int y, int largeur, int hauteur) {
        super(listModel);
        this.listModel = listModel;
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
    }
    
    public void ajoute(String str) {
        this.listModel.addElement(str); 
    }
    
    public void retire(String str) {
        this.listModel.removeElement(str);
    }
    
    public String getItem(int i) {
        return this.getItem(i);
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
