import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		String resp1;
		int contadorpuntos=0;
		String ent = JOptionPane.showInputDialog("Bienvenido al Trivial sobre los elementos de Pokemon. ¿Desea jugar?"
				+ "\n 1.SI"
				+ "\n 2.NO");
		
		int respuesta = Integer.parseInt(ent);
		if (respuesta == 1) {
			System.out.println("Por favor responda con minúsculas");
			resp1 = JOptionPane.showInputDialog("¿Es débil el tipo planta frente al tipo fuego?");
			if (resp1.equals("si")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			
	
		  
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
		}

	}

}
