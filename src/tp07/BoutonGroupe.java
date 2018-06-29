/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Jean-Claude
 */
public class BoutonGroupe extends ButtonGroup  {
    
    public BoutonGroupe() {
        
    }
    
    public void ajouteBouton(JRadioButton boutonRadion) {
        this.add(boutonRadion);
    }
    
    public void supprimeBouton(JRadioButton boutonRadion) {
        this.remove(boutonRadion);
    }
}
