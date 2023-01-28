package src;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia, mes, ano;
		
		System.out.println("Introduce un dia: ");
		dia=Entrada.entero();
		
		System.out.println("Introduce un mes: ");
		mes=Entrada.entero();
		
		System.out.println("Introduce un a�o: ");
		ano=Entrada.entero();
		
		
		if(dia>0 && dia<=30)
			System.out.println("El d�a es correcto.");
		
		else {
			System.out.println("El d�a es incorrecto");
		}
		
		 if(mes>0 && mes<=12)
			System.out.println("El mes es correcto");
		 
		 else {
			 System.out.println("El mes es incorrecto");
			 
		 }
		 
		 if (ano>0)
			 System.out.println("El a�o es correcto");
		 else {
			 
			 System.out.println("El a�o es incorrecto");
		 }
			 
		

	}

}
