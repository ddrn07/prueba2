package src;
public class Ejerciciodos4 {

    public static void main(String[] args){

        int num,contador;
        contador=1;

        System.out.println("Introduce un número. ¿Cuántos intentos antes de dar con el negativo?");
        num=Entrada.entero();

        while(num>=0){

            System.out.println("Inténtalo otra vez: ");

            num=Entrada.entero();
            contador++;



        }
        System.out.println("Has necesitado " + contador + " intentos para lograrlo!");

    }
}
