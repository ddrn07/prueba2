
public class Ejerciciodos8 {

    public static void main(String[] args){

        int n;
        int contador=1;

        System.out.println("Introduce un número: ");
        n=Entrada.entero();

        System.out.println("Has introducido el número " + n);



        while(contador<n && contador>=1){

            System.out.println(contador);

            contador++;

        }



    }
}
