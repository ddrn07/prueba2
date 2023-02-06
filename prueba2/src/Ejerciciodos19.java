public class Ejerciciodos19 {

    public static void main(String[] args){




    int aprobados=0;

    int condicionales=0;

    int suspensos=0;


    double nota=0;

    for(int i=1; i<=6; i++){

        System.out.println("Introduce la nota del alumno # " +i + ": ");
        nota=Entrada.real();

        if(nota>=5){


           aprobados++;
        }

        if(nota==4){

            condicionales++;
        }

        if(nota<4){

            suspensos++;
        }

    }

    System.out.println("El número total de aprobados es: " + aprobados + "\nEl número total de condicionales es de " +
            condicionales + "\nEl número total de suspensos es de: " + suspensos);

    }
}


