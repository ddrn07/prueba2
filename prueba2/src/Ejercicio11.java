public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("Introduce un n�mero entre 0 y 9999:");
		
		num=Entrada.entero();
		
		if(num<10)
			System.out.println("El n�mero tiene solo una cifra");
		
		else {
			
			if (num>=10 && num<100)
				System.out.println("El n�mero tiene dos cifras");
			
			else {
				
				if (num>=100 && num<1000)
					System.out.println("El n�mero tiene tres cifras");
				
				else {
					
					if(num>=1000 && num<10000)
					System.out.println("El n�mero tiene cuatro cifras");
				}
			}
		}

	}

}
