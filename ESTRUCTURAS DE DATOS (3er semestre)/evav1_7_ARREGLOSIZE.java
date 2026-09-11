package estructurasDeDatos_3erSemestre;

public class evav1_7_ARREGLOSIZE {
    public static void main (String[] args){
        int [] original = new int [10];
        for (int i = 0; i < original.length; i++){ //LLENAR DATOS ALEATORIOS
            original [i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++){ //IMPRIMIR
            System.out.println("["+original[i]+"]");
        }
        System.out.println("");
        //CAMBIAR EL TAMAÑO (NO SE PUEDE)
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++){ //IMPRIMIR ARREGLO "MODIFICADO"
            System.out.println("["+original[i]+"]");
        }
    }
}
