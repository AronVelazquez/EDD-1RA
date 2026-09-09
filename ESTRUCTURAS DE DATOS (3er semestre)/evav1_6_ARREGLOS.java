package estructurasDeDatos_3erSemestre;

public class evav1_6_ARREGLOS {
    public static void main (String[] args){
        int[] datos = new int [1000000000]; //"datos" se almacena en el STACK, 
        for (int i = 0; i < datos.length; i++){ //Se itera 100,000,000 veces
            datos [i] = (int)(Math.random() * 100); //En cada iteracion se asigna un int entre el 0 y 100 
        }
    }
}
//Cada int ocupa 4 bytes, aqui se almacenan 100,000,000 de int, por lo tanto se necesitan
// 400,000,000 bytes, o 400 MB