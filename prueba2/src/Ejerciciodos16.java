public class Ejerciciodos16 {

    public static void main(String[] args){

        int num;

        do{

            System.out.println("introduce un número de 0 a 10: ");
            num=Entrada.entero();

        }
        while(!(0<=num && num<=10));
        System.out.println("\n\nTabla del " + num);

        for(int i=1; i<=10; i++){

            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
