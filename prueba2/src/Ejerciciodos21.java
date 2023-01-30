public class Ejerciciodos21 {

    public static void main(String[] args){

        boolean haynegativo=false;
        int numero;
        int negativo=0;

        for(int i=1; i<=10; i++){

            System.out.println("Introduzca el número #" + i);
            numero=Entrada.entero();

            if(numero<0){

                haynegativo=true;
            }

        }



        if(haynegativo==true){

            System.out.println("Hay, al menos, un número negativo");
        }
        else{
            System.out.println("No hay números negativos entre los introducidos");
        }

    }
}
