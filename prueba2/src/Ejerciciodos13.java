package src;
public class Ejerciciodos13 {

    public static void main(String[] args){

        int num;
        int cont_cer= 0;
        int cont_pos=0;
        int cont_neg=0;
        int suma_pos=0;
        int suma_neg=0;

        float media_pos;
        float media_neg;

        for(int i=10; i>0; i--){

            System.out.println("Introduce un número: ");
            num=Entrada.entero();

            if(num==0)
            {
                cont_cer++;


            }

            else {

                if(num<0){

                cont_neg++;
                suma_neg+=num;
                }

            else {
                cont_pos++;
                suma_neg+=num;

            }
        }

        media_pos=(float)suma_pos/cont_pos;
        media_neg=(float)suma_neg/cont_neg;
        System.out.println("El número de ceros introducido es de: " + cont_cer);

        System.out.println("Se han introducido" + cont_pos + " números positivos. La media de los números positivos es: " +
                media_pos);

        System.out.println("Se han introducido" + cont_neg + " números negativos. La media de los números negativos es: " +
                media_neg);

    }
}}
