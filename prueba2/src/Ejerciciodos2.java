
public class Ejerciciodos2 {

    public static void main(String[] args){
        int num;

        System.out.println("Introduce un número: ");
        num=Entrada.entero();

        while(num!=0){

            if (num<0)
                System.out.println("El número es negativo");

            else
                System.out.println("El número es positivo");

            System.out.println("Introduce un número: ");
            num=Entrada.entero();
        }


    }
}
