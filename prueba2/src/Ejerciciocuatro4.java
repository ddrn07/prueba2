public class Ejerciciocuatro4 {

    public static void main(String[] args){

        int i, t[];
        t=new int[10];

        for(i=0; i<10; i++){

            System.out.println("Introduce un número: ");
            t[i]=Entrada.entero();


        }
        System.out.println("El resultado es: ");

        for(i=0;i<=4;i++){

            System.out.println(t[i]);
            System.out.println(t[9-i]);

        }


    }
}
