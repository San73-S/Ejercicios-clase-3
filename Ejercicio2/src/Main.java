public class Main {
    public static void main(String[] args) {

        char abecedario[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r',
                's','t','u','v','w','x','y','z'};

        int desplazamiento = 2, count = 0;
        String palabra = "hola que tal zoe";
        String vectorPalabra [] = palabra.split("");

        for (String letra:vectorPalabra){
            for (char letAbc: abecedario){

                if(letra.equalsIgnoreCase(" ")){
                    break;
                }

                if(letra.equalsIgnoreCase("z")){
                    count=-1;
                }

                if (letra.equalsIgnoreCase(String.valueOf(letAbc))){
                    letra = String.valueOf(abecedario[count+desplazamiento]);
                    count=0;
                    break;
                }
                count++;
            }
            System.out.print(letra);
        }

    }
}