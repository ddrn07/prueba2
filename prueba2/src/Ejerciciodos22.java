public class Ejerciciodos22 {

    public static void main(String[] args){

        int notas;
        boolean suspensos=false;

        for(int i=1; i<=5; i++){

            System.out.println("Introduce la nota nº " + i);
            notas=Entrada.entero();

            if(notas<5){

                suspensos=true;
            }


        }

        if (suspensos==true){

            System.out.println("Hay, al menos, una nota suspensa.");
        }
        else{

            System.out.println("No hay ningún suspenso.");
        }

    }
}
