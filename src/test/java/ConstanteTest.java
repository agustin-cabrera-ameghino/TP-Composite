import org.junit.Assert;
import org.junit.Test;

/**
 * Created by agustin on 29/09/16.
 */
public class ConstanteTest {
    @Test
    public void Constante(){
        Constante dos = new Constante(2);
        Constante cinco = new Constante(5);

        Assert.assertEquals(2,dos.evaluar(),0);
        Assert.assertEquals(5,cinco.evaluar(),0);
    }

    @Test
    public void Suma(){
        Constante cinco = new Constante(5);
        Constante tres = new Constante(3);

        Expresion sumarValores = new Suma(cinco, tres);
        Expresion sumarNuevosValores = new Suma(sumarValores, tres);

        Assert.assertEquals();
    }
}