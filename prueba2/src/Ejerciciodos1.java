
public class Ejerciciodos1 {

    public static void main(String[] args){

        int num, cuadrado;
        System.out.println("Introduce un número: ");
        num=Entrada.entero();

        while(num>=0) {

            cuadrado=num*num;

            System.out.println(num+"² es igual a " + cuadrado);
            System.out.println("Introduce otro número");

            num=Entrada.entero();
        }
    }
}
