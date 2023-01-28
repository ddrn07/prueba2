public class Ejerciciodos15 {

    public static void main(String[] argas){

        int edad, altura, suma_edad, suma_altura;
        suma_edad=0;
        suma_altura=0;
        double media_edad, media_altura;
        media_edad=0;
        media_altura=0;


        for(int i=1; i<=5; i++){

            System.out.println("Introduce una edad: ");
            edad=Entrada.entero();
            suma_edad+=edad;

            System.out.println("Introduce una altura en centímetros: ");
            altura=Entrada.entero();
            suma_altura+=altura;

        }



        System.out.println("La prueba de edad " + suma_edad + " y altura: " + suma_altura);

        System.out.println("La edad media de los alumnos introducidos es: " + media_altura);
        System.out.println("La altura media de los alumnos introducidos es: " + media_edad);

    }
}
