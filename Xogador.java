package exemploarraysobxetos;

/**
 *
 * @author mmartinezcosta
 */
public class Xogador {
 
    String xogadores;
    int dorsal;

    public Xogador(String xogador, int dorsal) {
        this.xogadores = xogador;
        this.dorsal = dorsal;
    }

    public String getXogadores() {
        return xogadores;
    }

    public void setXogadores(String xogadores) {
        this.xogadores = xogadores;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogador{" + "xogador=" + xogadores + ", dorsal=" + dorsal + '}';
    }
     
    }