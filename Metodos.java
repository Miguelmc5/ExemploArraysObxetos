package exemploarraysobxetos;

/**
 *
 * @author mmartinezcosta
 */
public class Metodos {

    Xogador [] xogadores=new Xogador[2];
    
    public static int elementos(){
        System.out.println(" número de xogadores ");
    return PedirDatos.pedirInt();
    }
    
    public Xogador[] crearArray(){
    
        String nome;
        int dorsal;
        
        for (int i=0; i<xogadores.length; i ++){
            nome=PedirDatos.pedirString();
            dorsal=PedirDatos.pedirInt();
            xogadores[i] = new Xogador(nome,dorsal);
        }
        return xogadores;
}
    
    public void amosarArray(Xogador[]lista){
        for (Xogador elemento:lista)
            System.out.println(elemento);
    }
    
}

