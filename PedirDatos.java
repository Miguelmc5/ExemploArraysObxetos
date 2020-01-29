package exemploarraysobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author mmartinezcosta
 */
public class PedirDatos {

    public static int pedirInt(){
      
       return Integer.parseInt(JOptionPane.showInputDialog("teclea un int:"));
        
    }
    
    public static String pedirString(){
      
       return JOptionPane.showInputDialog("teclea un String:");
        
    }
}
