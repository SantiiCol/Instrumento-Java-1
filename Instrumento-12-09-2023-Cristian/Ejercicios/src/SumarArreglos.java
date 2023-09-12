import java.util.Scanner;

public class SumarArreglos {

	
	/*Haga un algoritmo donde se construya un arreglo resultante de la suma de 2 arreglos del mismo tamaño, el nuevo arreglo mostrará en 
	 * cada posición el resultado de la suma de las mismas posiciones de los otros 2, para el llenado de los 2 arreglos, solicite el ingreso al usuario, 
	 * adicionalmente debe mostrar el contenido de los 3 arreglos, tanto los iniciales como el resultante. 
	 */
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int tamaño = scanner.nextInt();
        int[] arreglo1 = new int[tamaño];
        int[] arreglo2 = new int[tamaño];

        System.out.println("Ingrese los valores para el primer arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los valores para el segundo arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        int[] resultado = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("Arreglo 1:");
        mostrarArreglo(arreglo1);

        System.out.println("Arreglo 2:");
        mostrarArreglo(arreglo2);

        System.out.println("Resultado de la suma:");
        mostrarArreglo(resultado);

        scanner.close();
    }
	
	private static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
