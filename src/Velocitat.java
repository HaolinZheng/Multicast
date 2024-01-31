import java.util.ArrayList;
import java.util.List;

public class Velocitat {

    /* Classe que gestiona una dada de velocitat (int) aleatòria, per implementar l'exemple de Multicast:
     * ClientVelocimetre1.java
     * ClientVelocimetre2.java
     * SrvVelocitats.java
     */

    List<String> palabras = new ArrayList<>();
    public Velocitat() {
        palabras.add("GI");
        palabras.add("HSR");
        palabras.add("HI3");
        palabras.add("AN");
        palabras.add("ZZZ");
        palabras.add("GT");
        palabras.add("AN:END");
    }

    public String recogerPalabra() {;
        return palabras.get((int)(Math.random()*7));
    }

}