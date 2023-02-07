public class Ejerciciocuatro3 {

    public static void main(String[] args){

        int t[]=new int[5];
        int suma_pos=0, suma_neg=0, suma_cero=0;
        int con_pos=0,con_neg=0;

        for(int i=0;i<5;i++){

            System.out.println("Introduce un número: ");
            t[i]=Entrada.entero();

            if(t[i]<0){

                suma_neg=suma_neg+t[i];
                con_neg++;
            }
            if(t[i]==0){

                suma_cero++;
            }

            if(t[i]>0){

                suma_pos=suma_pos+t[i];
                con_pos++;
            }
        }

        System.out.println("El número total de ceros es igual a "+suma_cero);

        if(con_pos==0){
            System.out.println("No se puede hacer la operación de números positivos.");
        }else{
            System.out.println("La media de los números positivos introducidos es: "+(float)(suma_pos/con_pos));
        }

        if(con_neg==0){

            System.out.println("No se puede hacer la operación de números negativos.");
        }else{
            System.out.println("La media de los números negativos introducidos es: "+(float)(suma_neg/con_neg));

        }





    }
}
