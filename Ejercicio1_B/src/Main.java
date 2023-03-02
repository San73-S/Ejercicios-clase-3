public class Main {
    public static void main(String[] args) {

        int N1=15, N2=5, N3=19, aux=0,cont=0;
        int ascDes=0; //0 es asc y 1 es des
        int vecNum [] = new int[3];

        if(ascDes == 0){
            cont = 2;
            System.out.print("Orden ascendente: \n");
        } else{
            System.out.print("Orden descendente: \n");
        }

        while(true){

            if(N1>N2 && N1>N3){
                aux = N1;
                N1=0;
            } else if (N2 > N3) {
                aux = N2;
                N2=0;
            } else {
                aux = N3;
                N3=0;
            }
            vecNum[cont] = aux;

            if (ascDes == 0){
                cont--;
            }    else{
                cont++;
            }

            if (cont < 0 || cont > 2){
                break;
            }
        }

        for (int n: vecNum) {
            System.out.print(n + " ");
        }

    }
}