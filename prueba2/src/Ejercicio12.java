
package src;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int dm, m, c, d, u;
		
		System.out.print("Introduce un n�mero entre 0 y 9999");
		
		num=Entrada.entero();
		
		u=num%10;
		d=num%100;
		c=num%1000;
		m=num%10000;
		dm=num%100000;
		
		System.out.println(u + " " + d/10 + " " + c/100 + " " + m/1000 + " " + dm/10000);
		


	}

}
