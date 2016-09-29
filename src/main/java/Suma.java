/**
 * Created by agustin on 29/09/16.
 */
public class Suma implements Expresion {
    Expresion exp1;
    Expresion exp2;

    public Suma(Constante cinco, Constante tres) {
        this.exp1 = cinco;
        this.exp2 = tres;
    }

    public double evaluar() {
        return (this.exp1.evaluar() + this.exp2.evaluar());
    }
}
