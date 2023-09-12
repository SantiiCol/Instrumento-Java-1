import java.util.ArrayList;
import javax.swing.JOptionPane;

public class nominaEmpresa {
	/*En la nómina de una empresa se le hace descuento a los empleados por concepto de ahorro, de acuerdo al estrato social en que vive, y según la tabla 7.
	 *  Solicite el nombre de cada empleado y Calcule e imprima el valor a descontar.
	 */
	
	public static void main(String[] args) {
        double[] tablaDescuentos = {0.05, 0.1, 0.15, 0.2, 0.25};


        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados:"));

        ArrayList<String> descuentos = new ArrayList<>();

        for (int i = 0; i < numEmpleados; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado #" + (i + 1) + ":");
            int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato social del empleado #" + (i + 1) + " (1-5):"));

            double descuento = tablaDescuentos[estrato - 1]; 
            double salarioBase = 1000; 
            double descuentoTotal = salarioBase * descuento;

            String resultado = "Empleado: " + nombre + "\n";
            resultado += "Estrato Social: " + estrato + "\n";
            resultado += "Descuento: $" + descuentoTotal + "\n";
            resultado += "Salario Neto: $" + (salarioBase - descuentoTotal) + "\n";

            descuentos.add(resultado);
        }

        StringBuilder resultados = new StringBuilder("Descuentos por empleado:\n");
        for (String descuento : descuentos) {
            resultados.append(descuento).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, resultados.toString());
    }
	
}
