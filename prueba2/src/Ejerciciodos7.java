public class Ejerciciodos7 {

    public static void main(String[] args){

        int num, suma,contador;
        float media;
        suma=0;
        contador=0;
        media=0;

        System.out.println("Introduce un número:  ");

        num=Entrada.entero();

        while(num>=0){

            suma+=num;
            contador++;

            System.out.println("Introduzca otro número: ");
            num=Entrada.entero();
            
        }
        if (contador==0)
            System.out.println("Imposible hacer la media");
        else{
            media=(float)suma/contador;
            System.out.println("La media es " + media + ".");
        }


        System.out.println("la suma de todo lo anterior es: " + suma + ", lo que hace que la media sea " + media);
    }
}
