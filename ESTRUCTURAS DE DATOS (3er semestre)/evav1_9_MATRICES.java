package estructurasDeDatos_3erSemestre;

public class evav1_9_MATRICES {
    public static void main (String[] args){
        int [][] matriz = new int [5][3];
        System.out.println("Matriz = " + matriz);
        System.out.println("Matriz [0] = " + matriz[0]);
        System.out.println("Matriz [0].length = " + matriz[0].length);
        System.out.println("Matriz [1] = " + matriz[1]);
        System.out.println("Matriz [1].length = " + matriz[1].length);
        //----------------------------
        for(int i=0 ;i<matriz.length ;i++){ //PRIMER DIMENSIÓN (FILAS)
            for(int j=0 ;j<matriz[i].length ;j++){ //SEGUNDA DIMENSIÓN (COLUMNAS)
                matriz [i][j] = (int) (Math.random()*100);
            }
        }

        for(int i=0 ;i<matriz.length ;i++){ //PRIMER DIMENSIÓN (FILAS)
            for(int j=0 ;j<matriz[i].length ;j++){ //SEGUNDA DIMENSIÓN (COLUMNAS)
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}