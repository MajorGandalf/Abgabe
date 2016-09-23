/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javauebungen;

import javax.swing.JOptionPane;

/**
 *
 * @author Joachim
 */
public class BruchTest {
    
    public static void main(String args[]){
        
        Bruch b = new Bruch();
        
        b.setZahler(16);
        b.setNenner(4);
        
        b.ausgeben();
        b.gekuerztausgeben();
        
        Bruch c = new Bruch(3);
        
        Bruch d = c;
        
        c.setNenner(9);
        
        c.ausgeben();
        d.ausgeben();
        
        int w = 5;
        int y = w;
        
        System.out.println(w +" "+ y);
        
        w = 10;
        
        System.out.println(w +""+ y);
        
        boolean doit = true;
        
        while (doit) {
            int z = Interger.praseInt( JOptionPane.showInputDialog(null,"Zähler"));
            int n = Interger.praseInt( JOptionPane.showInputDialog(null,"Nenner"));
           
            Bruch x = new Bruch(z,n);
            
            x.ausgeben();
            x.gekuerztausgeben();
            
            if(JOptionPane.YES_OPTION != JOptionPane.showOptionDialog(null, "Noch eine?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null))
            {
                doit = false;
            }    
            System.out.println("Anzahl erstellter Brüche= "+Bruch.anzahlBrueche);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    private static class Interger {

        private static int praseInt(String showInputDialog) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Interger() {
        }
    }
}
