public class Ejerciciodos20 {

    public static void main(String[] args){

        double sueldo;
        double sueldo_max=0;
        int n;
        System.out.println("Introduce el número de sueldos que quiere calcular");
        n=Entrada.entero();



        for(int i=1; i<=n; i++){

            System.out.println("Introduce el sueldo nº "+i);
            sueldo=Entrada.real();

            if(sueldo_max<sueldo){

                sueldo_max=sueldo;
            }


        }

        System.out.println("El sueldo máximo es: " + sueldo_max);

    }
}
