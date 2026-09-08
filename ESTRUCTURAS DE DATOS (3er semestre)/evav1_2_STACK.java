package estructurasDeDatos_3erSemestre;

public class evav1_2_STACK {
    public static void main(String[] args) { //Se crea el primer StackFrame para Main
        A(); //Nuevo StackFrame para A, se situa sobre el SF de Main, va al bloque A()
        System.out.println("Termina main"); //se desapila el SF de main y el programa finaliza.
    }
    public static void A() {
        System.out.println("Inicia A");
        B(); //Nuevo StackFrame para B, se situa sobre el SF de A, va al bloque B()
        System.out.println("Termina A"); //Termina A, su SF se desapila y vuelve al bloque main
    }
    public static void B() {
        System.out.println("Inicia B");
        int i = 5;
        double d = 5.5;
        System.out.println("Termina B"); //Termina B, su SF se desapila y sus variables son liberadas 
    }                                    // de memoria, vuelve al bloque A()
    

}