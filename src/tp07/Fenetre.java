/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jean-Claude
 */
public class Fenetre extends JFrame {
    private JPanel jpanel;
    
    public Fenetre(String name) {
        this.setTitle(name);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.jpanel = new JPanel();
        this.setContentPane(jpanel);
        
        this.setVisible(true);
    }

    public JPanel getJpanel() {
        return jpanel;
    }
    
}
