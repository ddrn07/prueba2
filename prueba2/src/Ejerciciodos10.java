package src;
public class Ejerciciodos10 {

    public static void main(String[] args){

        int num=0;
        int contador;
        int suma=0;

        for(contador=1; contador<=15; contador++){

            System.out.println("Introduce el número #" + contador);
            num=Entrada.entero();
            suma+=num;
        }
        System.out.println("La suma de los 15 múmeros es: " + suma);

    }
}
