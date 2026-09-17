package estructurasDeDatos_3erSemestre;

public class evav1_12_PRIMOS {
    public static void main (String[] args){
        int num = 1000000007;

        long ineffStart = System.currentTimeMillis();
        boolean ineffResult = ineffPrime(num);
        long ineffEnd = System.currentTimeMillis();

        long effStart = System.currentTimeMillis();
        boolean effResult = effPrime(num);
        long effEnd = System.currentTimeMillis();

        System.out.println("----------------------------------");
        System.out.println("METODO INEFICIENTE");
        System.out.println("RESULTADO: "+ ineffResult+", TIEMPO: "+(ineffEnd-ineffStart)+" ms");
        System.out.println("----------------------------------");
        System.out.println("METODO EFICIENTE");
        System.out.println("RESULTADO: "+ effResult+", TIEMPO: "+(effEnd-effStart)+" ms");
    }

    public static boolean ineffPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){ 
                return false;
            }
        }
        return true;
    }

    public static boolean effPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}