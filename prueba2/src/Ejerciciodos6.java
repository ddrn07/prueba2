
package src;
public class Ejerciciodos6 {

    public static void main(String[] args){

        int n, suma;

        suma=0;

        do {
            System.out.println("Introduce un número: ");
            n = Entrada.entero();
            suma = suma + n;
        }
        while(n!=0);




        System.out.println("La suma total de los números introducidos es: " + suma);

    }
}