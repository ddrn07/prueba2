public class Ejerciciodos5 {

    public static void main(String[] args){

        int n, num;

       // n=10;

        n=(int)(Math.random()*100) +1;

        System.out.println("Di un número, a ver si aciertas:");
        num=Entrada.entero();

        while(num!=n){

            if(num>n)

            System.out.println("Más pequeño");

            else {
                System.out.println("Más grande");
            }

            num=Entrada.entero();
        }

        System.out.println("Correcto! El número que estabas buscando era " + num); //Aquí poner "num" en vez de "n" es recchineo, pues el que sabemos que era fijo era el otro.
    }
}
