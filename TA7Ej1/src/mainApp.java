import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Hashtable<String, Integer> media = new Hashtable<String, Integer>();
		
		media.put("Marc", 7);
		media.put("Alfonso", 9);
		media.put("Macarena", 8);
		media.put("Juan", 4);
		media.put("Maria", 6);
		
		int menu = 0;
		
		while (menu!=-1) {
			switch (menu) {
			case 0:
				System.out.println("1-Nuevo alumno");
				System.out.println("2-Mostrar notas");
				System.out.println("3-Salir");
				System.out.print("");
				menu = scn.nextInt();
				break;
			case 1:
				System.out.println("Nombre del nuevo alumno:");
				String alumno = scn.next();
				System.out.println("Cuantas notas vas a añadir:");
				int numNotas= scn.nextInt();
				int notas=0;
				for (int i = 1; i <= numNotas; i++) {
					System.out.println("Que nota ha sacado? (" + i + "/" + numNotas + ")");
					int nota = scn.nextInt();
					notas+=nota;
				}
				notas /= numNotas;

				media.put(alumno, notas);
				menu = 0;
				break;
			case 2:
				media.forEach(
						(k,v) -> {System.out.println(k + " -> " + v);}
				);
				menu=0;
				break;
			case 3:
				System.out.println("Gracias por utilizar la aplicación");
				menu = -1;
				break;

			default:
				System.out.println("Te has equivocado de numero, vuelve a intentarlo");
				menu=0;
				break;
			}
		}
		
		
	}

}
