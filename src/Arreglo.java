public class Arreglo{
    public static int mayor(int[] arreglo){
        int mayor = Integer.MIN_VALUE;
        for(int i=0; i <= arreglo.length-1; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo [i];
            }
        }
        return mayor;

    }

    public static int menor(int[] arreglo){
        int menor = Integer.MAX_VALUE;
        for(int i=0; i <= arreglo.length-1; i++){
            if (arreglo[i] < menor){
                menor = arreglo [i];
            }
        }
        return menor;

    }

    
}