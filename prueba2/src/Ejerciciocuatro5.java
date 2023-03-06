public class Ejerciciocuatro5  {

    public static void main(String[] args){

        int a[], b[], c[];
        int i, j;

        a=new int[10];
        b=new int[10];
        c=new int[20];

        for(i=0;i<10;i++){

            System.out.println("Introduce número: ");
            a[i]=Entrada.entero();
        }

        for(i=0;i<10;i++){
            System.out.println("Introduce número: ");
            b[i]=Entrada.entero();

        }

        j=0;

        for(i=0;i<10;i++){

            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }

        for(i=0;i<20;i++){

            System.out.println(c[i]);
        }

    }
}
