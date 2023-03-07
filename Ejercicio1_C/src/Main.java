/*
dado un vector de números, y un número X, que sume todos los números > X y
retorne el resultado
 */

public class Main {
    public static void main(String[] args) {

        int vecNumeros[] = {5, 8, 7, 3, 15, 4};
        int numeroSumar = 5, sumatoria=0;

        for (int N: vecNumeros){
            if(numeroSumar < N){
                sumatoria += N;

            }
        }

        System.out.println("\nLa sumatoria de todos los numeros mayores a " + numeroSumar + " es: " +sumatoria);

    }
}