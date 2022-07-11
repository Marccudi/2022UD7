import java.util.Hashtable;
import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Hashtable<String, Double> stock = new Hashtable<String, Double>();
		stock.put("rosa", 10.0);
		stock.put("tulipan", 20.0);
		stock.put("girasol", 30.0);
		stock.put("orquídea", 40.0);
		stock.put("pensamiento", 50.0);
		stock.put("azalea", 60.0);
		stock.put("lirio", 70.0);
		stock.put("hortensia", 80.0);
		stock.put("narciso", 90.0);
		stock.put("lavanda", 100.0);
		
		int elecc=0;
		while (elecc != -1) {
			switch (elecc) {
			case 0:
				System.out.println("1. Añadir un producto nuevo");
				System.out.println("2. Consultar información de un producto");
				System.out.println("3. Listar todos los productos");
				System.out.println("4. Salir de la aplicación");
				elecc= scn.nextInt();
				break;
			case 1:
				System.out.println("Introduce el nombre del producto a añadir:");
				String prod=scn.next();
				System.out.println("Introduce el valor de cada unidad del producto:");
				double precio = scn.nextDouble();
				stock.put(prod, precio);
				System.out.println("Producto añadido.");
				elecc=0;
				break;
			case 2:
				System.out.println("Introduce el nombre del producto a consultar:");
				prod = scn.next();
				if (stock.get(prod) !=null) {
					System.out.println("El producto " + prod + " tiene de precio: " + stock.get(prod));
				}else {
					System.out.println("Producto no encontrado");
				}
				elecc=0;
				break;
			case 3:
				stock.forEach(
						(k,v) -> {System.out.println(k + " -> " + v);}
				);
				elecc=0;
				break;
			case 4:
				System.out.println("Gracias por usar nuestra aplicación");
				elecc = -1;
				break;

			default:
				break;
			}
		}
		 scn.close();

	}
}
