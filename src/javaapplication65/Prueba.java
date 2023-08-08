
package javaapplication65;

import javax.swing.JOptionPane;

public class Prueba {


    public static void main(String[] args) {
        
     
        String nom = JOptionPane.showInputDialog("Ingrese su nombre ");
        
        //JOptionPane.showMessageDialog(null, " Nombre " + nom);
        
        JOptionPane.showMessageDialog(null, nom ,"Nombre Ingresado", 1, null);
   
    }
 
}
