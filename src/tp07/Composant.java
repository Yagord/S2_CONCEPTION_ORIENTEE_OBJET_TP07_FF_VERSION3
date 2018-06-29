/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;

/**
 *
 * @author Jean-Claude
 */
public interface Composant {
    
    void dessiner(Graphics gfx);
    
    void clic();
    
    void clic(int x, int y);
    
    void chercheComposant();
    
    void getComposant(String texte);
    
}
