import java.util.Scanner;

/*
 * Crea una aplicaci�n que pida un n�mero por teclado y despu�s comprobaremos 
 * si el n�mero introducido es capic�a, es decir, que se lee igual sin importar la direcci�n. 
 * Por ejemplo, si introducimos 30303 es capic�a, si introducimos 30430 no es capicua. 
 * Piensa c�mo puedes dar la vuelta al n�mero. Una forma de pasar un n�mero a un array es esta 
 * Character.getNumericValue(cadena.charAt(posicion)).
 */
public class Ejercicio6 {
	public static void main(String args[]) {
		int numero;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		String palabra = String.valueOf(numero);

			for(int i = 0, j = palabra.length() -1; i <= j;) {
				if(palabra.charAt(i) != palabra.charAt(j)) {
					flag = true;
				}else {
					i++;
					j--;
				}
			}
			
			if(flag) {
				System.out.println("Es capicua");
			}else {
				System.out.println("No es capicua");
			}


		

		
		
	}
}
