public class Ejerciciodos23 {

    public static void main(String[] args){

        int num;
        boolean mult=false;

        for(int i=1; i<=5; i++){

            System.out.println("Introduce el número # " + i);
            num=Entrada.entero();

            if(num%3==0){

                mult=true;
            }

        }
        if(mult==true){

            System.out.println("Hay, al menos, un múltiplo de 3");
        }
        else {
            System.out.println("No has introducido ningún múltiplo de 3");
        }
    }
}
