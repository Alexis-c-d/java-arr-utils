import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestArregloMin {
    
    @Test
    public void testMenorAlInicio() {
        int[] arreglo = {7, 9, 8};
        int resultado = Arreglo.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorMedio() {
        int[] arreglo = {9, 7, 8};
        int resultado = Arreglo.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorFinal() {
        int[] arreglo = {8, 9, 7};
        int resultado = Arreglo.menor(arreglo);
        int esperado = 7;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorNeg1() {
        int[] arreglo = {-9, -8, -7};
        int resultado = Arreglo.menor(arreglo);
        int esperado = -9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorNeg2() {
        int[] arreglo = {-8, -9, -7};
        int resultado = Arreglo.menor(arreglo);
        int esperado = -9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorNeg3() {
        int[] arreglo = {-8, -7, -9};
        int resultado = Arreglo.menor(arreglo);
        int esperado = -9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMenorVacio() {
        int[] arreglo = {};
        int resultado = Arreglo.menor(arreglo);
        int esperado = Integer.MAX_VALUE;
        assertEquals(esperado, resultado);
    }


}
