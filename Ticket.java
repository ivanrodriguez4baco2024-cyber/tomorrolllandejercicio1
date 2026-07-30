public class Ticket{
    private int primerNumAleatorio;
    private int segunNumAleatorio;


public Ticket(){
    primerNumAleatorio = (int) (Math.random() * 15000) + 1;
    segunNumAleatorio = (int) (Math.random() * 15000) + 1;

}

public int getPrimerNumAleatorio(){
    return primerNumAleatorio;
}

public int getSegunNumAleatorio(){
    return segunNumAleatorio;
}

public boolean validarTicket(int numeroTicket) {
        int minimo;
        int maximo;
 
        if (primerNumAleatorio < segunNumAleatorio) {
            minimo = primerNumAleatorio;
            maximo = segunNumAleatorio;
        } else {
            minimo = segunNumAleatorio;
            maximo = primerNumAleatorio;
        }
 
        if (numeroTicket >= minimo && numeroTicket <= maximo) {
            return true;
        } else {
            return false;
        }
}
}