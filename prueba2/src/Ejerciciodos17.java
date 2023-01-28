public class Ejerciciodos17 {

    public static void main(String[] args){

        int codigo;
        int litros;
        float precio;

        float factotal=0;
        float cantlitros=0;
        int fact600=0;

        for(int i=1; i<=5; i++){

            System.out.println("Introduce el código del artículo: ");
            codigo=Entrada.entero();

            System.out.println("Introduce el número de litros que quieres");
            litros=Entrada.entero();

            System.out.println("Introduce el precio por litro:");
            precio=(float)Entrada.real();

            factotal+=litros*precio;
            cantlitros+=litros;

            if(litros*precio>600){
                fact600++;
            }


        }

        System.out.println("Se han vendido un total de " + cantlitros + "litros, con una facturación de " + factotal + " €.");
        System.out.println("Hay un total de " + fact600 + " facturas de más de 600€");



    }
}
