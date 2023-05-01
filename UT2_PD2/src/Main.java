public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Factorial fact = new Factorial();
        System.out.println("Factorial: " + fact.factorial(4));
       // System.out.println(fact.factorial(-3)); esto da una error de StackOverflow
        //Ejercicio 2
        SumaLineal suma = new SumaLineal();
        int A[] = {4,3,6,2,5};
        System.out.println("Suma lineal: " + suma.sumaLineal(A,5));
        //System.out.println(suma.sumaLineal(A,-5)); esto da un ArrayIndexOutOfBounds
        //Ejercicio 3
        Potencia pot = new Potencia();
        System.out.println("Potencia: " + pot.potencia(2,2));
        //Ejercicio 4
        InvertirArray invertido = new InvertirArray();
        int A2[] = {1, 2, 3, 4, 5};
        invertido.invertirArray(A2, 1, 3);
        for (int i = 0; i < A2.length; i++) {
            System.out.print("Intercambiado: " + A2[i] + " ");
        }
    }
}