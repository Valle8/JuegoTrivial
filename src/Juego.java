import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		String resp;
		int contadorpuntos=0;
		System.out.println("___________      .__      .__       .__   \r\n"
				+ "\\__    ___/______|__|__  _|__|____  |  |  \r\n"
				+ "  |    |  \\_  __ \\  \\  \\/ /  \\__  \\ |  |  \r\n"
				+ "  |    |   |  | \\/  |\\   /|  |/ __ \\|  |__\r\n"
				+ "  |____|   |__|  |__| \\_/ |__(____  /____/\r\n"
				+ "                                  \\/      ");
		String ent = JOptionPane.showInputDialog("Bienvenido al Trivial sobre los elementos y movimientos de Pokemon. �Desea jugar?"
				+ "\n 1.SI"
				+ "\n 2.NO");
			
		
		int respuesta = Integer.parseInt(ent);
		if (respuesta == 1) {
			System.out.println("Por favor responda con min�sculas");
			resp = JOptionPane.showInputDialog("�Es d�bil el tipo planta frente al tipo fuego?");
			if (resp.equals("si")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Es d�bil el tipo acero frente al tipo lucha ?");
			if (resp.equals("si")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Es d�bil el tipo planta frente al tipo agua ?");
			if (resp.equals("no")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Es d�bil el tipo fuego frente al tipo roca ?");
			if (resp.equals("si")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Es d�bil el tipo hada frente al tipo siniestro ?");
			if (resp.equals("no")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Es eficaz el tipo normal frente al fantasma?");
			if (resp.equals("no")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�De qu� tipo es el movimiento Rayo Solar?");
			if (resp.equals("planta")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Cu�ntos elementos hay en Pokemon?");
			if (resp.equals("18")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�Hiperrayo es de tipo Especial o Fisico?");
			if (resp.equals("especial")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			resp = JOptionPane.showInputDialog("�De que tipo es el movimiento Abocajarro?");
			if (resp.equals("lucha")) {
				System.out.println("Correcto");
				contadorpuntos = contadorpuntos + 1;
			} else {
				System.out.println("Incorrecto");
				contadorpuntos = contadorpuntos - 1;
			}
			System.out.println("Tu puntuaci�n es " + contadorpuntos + " de 10 ");
		}

	}

}
