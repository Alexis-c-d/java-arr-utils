//Importamos el junit para testear

// Importar las librerias y funciones necesarias

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Test {
    @org.junit.Test
    public void Testeo() throws Exception {
        String arreglo = "testeo.txt";
            // Leeremos las lineas y las almacenamos en 2 arreglos
        BufferedReader br = new BufferedReader(new FileReader(arreglo));
        String[] esperadostr = br.readLine().split(" ");
        String[] linea1 = br.readLine().split(" ");           
        String[] linea2 = br.readLine().split(" ");
        br.close();

            // Checamos el tamaño de los 2 arreglos
        if (linea1.length != linea2.length) {
            JOptionPane.showMessageDialog(null, "Los arreglos no tienen el mismo tamaño");
            return;
        }

            // Convertir los arreglos a enteros
        int esperado = Integer.parseInt(esperadostr[0]);
        int[] primero = new int[linea1.length];
        int[] segundo = new int[linea2.length];
        for (int i = 0; i < linea1.length; i++){
            primero[i] = Integer.parseInt(linea1[i]);
            segundo[i] = Integer.parseInt(linea2[i]);
        }

        int resultado = ProductEscalar.ProductoEscalar(primero, segundo);
            
        if(esperado == resultado){
            JOptionPane.showMessageDialog(null, "Prueba exitosa. El resultado calculado coincide con el esperado");
        } else {
            JOptionPane.showMessageDialog(null, "El resultado calculado no coincide.");
        }
        
        assertEquals(esperado, resultado);
    }
    
}
