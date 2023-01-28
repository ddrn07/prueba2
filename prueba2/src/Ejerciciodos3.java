public class Ejerciciodos3 {

    public static void main(String[] args) {

        int num;
        System.out.println("Introduce un número para ver si es par o impar: ");
        num = Entrada.entero();

        while (num != 0) {

            if (num % 2 == 0)
                System.out.println("El número es par");
            else

                System.out.println("El número es impar");

            System.out.println("Introduce otro número");
            num = Entrada.entero();

        }
    }
}