// Importar las librerias y funciones necesarias
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class ProductEscalar {

    public static void main(String[]args){
        String arreglo = "Arreglo.txt";

        try {
            // Leeremos las lineas y las almacenamos en 2 arreglos
            BufferedReader br = new BufferedReader(new FileReader(arreglo));
            String[] linea1 = br.readLine().split(" ");
            String[] linea2 = br.readLine().split(" ");
            br.close();

            // Checamos el tamaño de los 2 arreglos
            if (linea1.length != linea2.length) {
                JOptionPane.showMessageDialog(null, "Los arreglos no tienen el mismo tamaño");
                return;
            }

            // Convertir los arreglos a enteros
            int[] primero = new int[linea1.length];
            int[] segundo = new int[linea2.length];
            for (int i = 0; i < linea1.length; i++){
                primero[i] = Integer.parseInt(linea1[i]);
                segundo[i] = Integer.parseInt(linea2[i]);
            }

            int resultado = ProductoEscalar(primero, segundo);
            JOptionPane.showMessageDialog(null, "Para los arreglos " + java.util.Arrays.toString(linea1) + " y " + java.util.Arrays.toString(linea2) + "\nProducto escalar:  " + resultado);

        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo" + e.getMessage() + "Error" + JOptionPane.ERROR_MESSAGE);
        }

    }

    public static int ProductoEscalar(int[] a, int[] b){
        int escalar = 0;
        for (int i = 0; i < a.length; i++){
            escalar += a[i] * b[i];
        }
        return escalar;
    }

    
}