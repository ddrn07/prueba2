public class Ejerciciodos14 {

    public static void main(String[] args){

        int sueldo;
        int suma=0;
        int sueldomayor=0;


        for(int i=1;i<=10; i++){

            System.out.println("Introduce un sueldo");
            sueldo=Entrada.entero();

            if (sueldo>1000){

                sueldomayor++;
            }

            suma+=sueldo;

        }

        System.out.println("Hay " + sueldomayor + " sueldos mayores de 1000€ y la suma total de los sueldos es " + suma);

    }
}