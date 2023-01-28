

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num;
int u, d, c, m, dm, cm;
		
		System.out.print("Introduce un n�mero entre 0 y 9999:");
		
		num=Entrada.entero();
		
		u=num%10;
		d=num%100;
		c=num%1000;
		m=num%10000;
		dm=num%100000;
		cm=num%1000000;
		
	
		//System.out.println(cm/100000 + " " + dm/10000 + " " + m/1000 + " " + c/100 + " " + d/10 + " " + u +".");
		
		if (u/1==dm/10000 && d/10==m/1000)
			System.out.println("S� es capic�a.");
		
	else {
			System.out.println("No es capic�a.");
	}
			
		
		

	}

}
