import java.util.ArrayList;
import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ArrayList<Double> lista = new ArrayList<>();
		double precioBruto=0; 
		int cont=0;
		while (cont!= -1) {
			switch (cont) {
			case 0: 
				System.out.println("1.Introducir un producto");
				System.out.println("2.Acabar de introducir productos");
				cont = scn.nextInt();
				break;
			case 1:
				System.out.println("Introduce el precio del producto");
				double precio = scn.nextDouble();
				lista.add(precio);
				precioBruto+=precio;
				cont=0;
				break;
			case 2:
				System.out.println("Has salido del apartado de introducir productos");
				cont = -1;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + cont);
			}
		}

		 System.out.println("Tipo de iva a añadir (1)21% (2)4%");
		 int eleccionIva = scn.nextInt();
		 
		 double iva =0;
		 switch (eleccionIva) {
			case 1:
				iva = 0.21;
				break;
			case 2:
				iva = 0.04;
				break;
		default:
			break;
		}
		 double precioIva= precioBruto+(precioBruto*iva);
		 System.out.println("Iva añadido del " + iva*100 + "%");
		 System.out.println("Precio bruto: " + precioBruto + "€");
		 System.out.println("Precio total: " + precioIva + "€");
		 System.out.println("Numero de articulos:" + lista.size());
		 System.out.println("Introduce la cantidad pagada:");
		 double pago = scn.nextDouble();
		 System.out.println("Cambio a devolver al cliente:" +(pago-precioIva) + "€");
		 
		 scn.close();
	}
}
