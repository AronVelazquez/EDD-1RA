package estructurasDeDatos_3erSemestre;

public class evav1_10_4DIMENSIONES {
    public static void main (String[] args){
        int [][][][] arreglo = new int [2][2][2][2];
        for(int i=0 ;i<arreglo.length ;i++){
            for(int j=0 ;j<arreglo[i].length ;j++){
                for(int k=0 ;k<arreglo[i][j].length ;k++){
                    for(int l=0 ;l<arreglo[i][j][k].length ;l++){
                        arreglo[i][j][k][l] = (int)(Math.random()*100);
                        System.out.print(" ["+arreglo[i][j][k][l]+"] ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
}