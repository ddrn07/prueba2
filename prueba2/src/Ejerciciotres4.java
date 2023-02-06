public class Ejerciciotres4 {

    public static void main(String[] args){

        int n;
        int fila, col;

        System.out.println("Lado del cuadrado: ");
        n=Entrada.entero();

        for(fila=1; fila<=n; fila++){

            for(col=1; col<=n; col++)


                System.out.print("* ");
                System.out.println("");

        }
    }
}
