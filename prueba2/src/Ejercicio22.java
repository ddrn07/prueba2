
package src;
public class Ejercicio22 {

    public static void main(String[] args){

        int num;
        int u, d;

        System.out.println("Introduce el número que te salga del chumino");
        num=Entrada.entero();

                u=num%10;
                d=num%100;

                System.out.println("Hay " + d/10 + " decenas y " + u + " unidades.");


    }
}
