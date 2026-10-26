import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestArregloMax {
    @Test
    public void testMayorAlInicio() {
        int[] arreglo = {9, 8, 7, 10, 5, 3, 15, 17, 1, 0};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 17;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMayorEnMedio() {
        int[] arreglo = {8, 9, 7};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMayorAlFinal() {
        int[] arreglo = {7, 8, 9};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorNegInicio() {
        int[] arreglo = {-7, -8, -9};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorNegMedio() {
        int[] arreglo = {-8, -7, -9};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorNegFinal() {
        int[] arreglo = {-9, -8, -7};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorPosNeg1() {
        int[] arreglo = {100, -8, 0};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 100;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorPosNeg2() {
        int[] arreglo = {-8, 100, 0};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 100;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorPosNeg3() {
        int[] arreglo = {0, -8, 100};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 100;
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void testMayorVacio() {
        int[] arreglo = {};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = Integer.MIN_VALUE;
        assertEquals(esperado, resultado);
    }

    @Test 
    public void testMayorUnElemento() {
        int[] arreglo = {1};
        int resultado = Arreglo.mayor(arreglo);
        int esperado = 1;
        assertEquals(esperado, resultado);
    }
}