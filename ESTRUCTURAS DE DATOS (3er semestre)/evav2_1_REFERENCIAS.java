package estructurasDeDatos_3erSemestre;

public class evav2_1_REFERENCIAS {
    public static void main (String[] args){
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        System.out.println("Inicio 0 " + inicio);
        System.out.println("Inicio.valor " + inicio.valor);
        System.out.println("Inicio.otro " + inicio.otro);
        //CREA LISTA DE OBJETOS
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300;
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor = 400;

        Ejemplo sig = inicio;
        while(sig != null){
            System.out.println("sig = "+sig.valor);
            sig = sig.otro;
        }
    }
    static class Ejemplo{
        int valor;
        Ejemplo otro;
    }
}
