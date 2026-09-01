public class main {
    public static void main(String[] args) {
        int x=100; //"x" accesible en todo el bloque "main" 
        for (int i = 0; i < 10; i++){ //"i" existe solo en el bloque "for"
            System.out.println ("i = " + i);
            x++; //"for" es bloque interno de "main", por tanto "x" es accesible
        }
        System.out.println("valor final de la i = " + i);//Error: "i" esta fuera de su bloque (no existe)
        System.out.println("valor final de la x = " + x);//Compila: "x" existe en el stackframe hasta que "main" termina
    }
    public static void OtraFuncion(){ //nuevo stackframe, independiente del stackframe de "Main"
        System.out.println("Valor de x = " + x); //Error: en este stackframe "x" no existe, 
    }
}