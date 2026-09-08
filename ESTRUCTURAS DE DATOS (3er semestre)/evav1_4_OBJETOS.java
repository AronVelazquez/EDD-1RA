package estructurasDeDatos_3erSemestre;

public class evav1_4_OBJETOS {
    public static void main (String[] args){
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR PRUEBA  
        //TERMINAR PROGRAMA -----> CARBAGE COLLECTOR ELIMINA AUTOMATICAMENTE LA MEMORIA NO USADA
        //ELIMINA "DISCRETAMENTE" EL OBJETO
        prueba = null;
    } //Todos lo objetos se producen en el HEAP y se guardan en el STACK
}
    class Prueba{}
