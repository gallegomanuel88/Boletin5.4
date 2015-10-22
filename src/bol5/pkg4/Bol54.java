
package bol5.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class Bol54 {
    
    public static void main(String[] args) {
        
        Restaurante obj1 = new Restaurante ();
        //Introduccion de datos
        String respuesta1 = JOptionPane.showInputDialog("Cantidad de pulpo en el almacen: ");
        obj1.setPulpo(Double.parseDouble(respuesta1));
        
        String respuesta2 = JOptionPane.showInputDialog("Cantidad de patatas en el alamacen: ");
        obj1.setPatatas (Double.parseDouble(respuesta2));
        
        //Mostrar datos
        JOptionPane.showMessageDialog(null, "Pulpo en el almacen "+obj1.getPulpo()+" Kg");
        JOptionPane.showMessageDialog(null, "Patatas en el almacen  "+obj1.getPatatas()+" Kg");
        
    }
    
}
