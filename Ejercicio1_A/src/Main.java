public class Main {
    public static void main(String[] args) {

        int cont = 0;
        String palabra = "hola que TAL";
        char letra = 't';
        String vectorPalabra[] = palabra.split("");

        for (String a: vectorPalabra) {
            if(a.equalsIgnoreCase(String.valueOf(letra))){
                cont++;
            }
        }

        System.out.print("Hay " + cont + " letras '" + letra + "' en la palabra \"" + palabra + "\".");

    }
}