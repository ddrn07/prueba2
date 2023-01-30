public class Ejerciciodos18 {

    public static void main(String[] args){

        int codigo;
        float precio;
        int litro;

        float fact1=0f;
        float fact2=0f;
        float fact3=0f;
        float factotal=0f;
        int litotal=0;
        int mas600;

        for(int i=1; i<=5; i++){

            System.out.println("Factura nº " + i);
            System.out.println("Introduce el número de producto: ");
            codigo=Entrada.entero();
            System.out.println("Introduce el número de litros de producto: ");
            litro=Entrada.entero();

            switch (codigo){

                case 1:
                    precio=0.6f;
                break;

                case 2:
                    precio=1.3f;
                break;

                case 3:
                    precio=2.5f;
                default:
                    precio=0;
                break;

            }


            factotal+=(precio*codigo);
            litotal+=litro;




        }

        if (codigo==1){

            fact1=(double)litro*0.6;

        }

        if(codigo==2){

            float fact2=(double)litro*1.3;
        }

        if(codigo==3){

            float fact3=(double)litro*2.5;
        }

        System.out.println("La facturación total es: " + factotal);
        System.out.println("Se han gastado "+fact1 + "€ en el primer producto, " + fact2+"€ en el segundo y " + fact3+"€ en el tercero.");



        

    }
}
