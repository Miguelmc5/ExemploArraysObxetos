package exemploarraysobxetos;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class ExemploArraysObxetos {

    
    public static void main(String[] args) {
        // TODO code application logic here
      
    Xogador [] futbol = new Xogador[Metodos.elementos()];
        Metodos obx = new Metodos();
        
       futbol= obx.crearArray();
        obx.amosarArray(futbol);
    }
    
}
