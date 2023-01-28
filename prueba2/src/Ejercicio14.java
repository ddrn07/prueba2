
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		
		System.out.print("Introduce un n�mero");
		
		nota=Entrada.entero();
		switch(nota) {
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			
			System.out.println("INSUFICIENTE");
			break;
			
		case 5: 
			System.out.println("SUFICIENTE");
			break;
			
		case 6:
			System.out.println("BIEN");
			break;
			
		case 7:
		case 8:
			System.out.println("NOTABLE");
			
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
		}
	}

}
