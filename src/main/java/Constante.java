/**
 * Created by agustin on 29/09/16.
 */
public class Constante implements Expresion {
    double valor;

    public Constante(int i) {
        valor = i;
    }

    public double evaluar(){
        return this.valor;
    }
}