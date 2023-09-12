import javax.swing.JOptionPane;

public class ProcesoDatosSolicitar {

	
	/*Haga un algoritmo que solicite el nombre, documento, edad y 
	 * profesión de n personas e imprima la siguiente información:
- Total personas registradas
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 

	 */
		
		String nombre,profesion;
		int documento,edad,contMayores=0,contMenores=0;
		
		public void iniciar() {
			int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a registrar"));
			
			for (int i = 0; i < cant; i++) {
				solicitarDatos();
				registros();
				
			}
			
			System.out.println("Total de personas Registradas: "+cant+"\n"
			+"Cantidad de personas ingresadas: "+cant+"\n"
					+"Cantidad de personas mayores de edad: "+ contMayores + "\n"
					+"Cantidad de personas menores de edad: "+contMenores);
		}
		
		public void solicitarDatos() {
			
			nombre=JOptionPane.showInputDialog("Ingrese su nombre");
			documento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su documento"));
			edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
			profesion=JOptionPane.showInputDialog("Ingrese su profesion");
			
		}
		
		public void registros() {
			
			int cont1=0, cont2=0;
			if (edad>=18) {
				cont1++;
				contMayores+=cont1;
			}else {
				cont2++;
				contMenores+=cont2;
			}
			
		}
		
	}
