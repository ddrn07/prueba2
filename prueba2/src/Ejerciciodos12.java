package src;
public class Ejerciciodos12 {

    public static void main(String[] args){

        int num;
        double fact=1;

        System.out.println("Introduce un número ");
        num=Entrada.entero();

        for(int i=num; i>0; i--){

            fact=fact*i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);

    }
}
