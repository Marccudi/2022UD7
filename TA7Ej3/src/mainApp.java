import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		Hashtable<String, ArrayList<Double>> stock = new Hashtable<String, ArrayList<Double>>();
		stock.put("rosa", new ArrayList<>());
		stock.get("rosa").add(1.0);
		stock.get("rosa").add(10.0);
		
		stock.put("tulipan", new ArrayList<>());
		stock.get("tulipan").add(2.0);
		stock.get("tulipan").add(20.0);
		
		stock.put("girasol", new ArrayList<>());
		stock.get("girasol").add(2.0);
		stock.get("girasol").add(20.0);
		
		stock.put("orquídea", new ArrayList<>());
		stock.get("orquídea").add(2.0);
		stock.get("orquídea").add(20.0);
		
		stock.put("pensamiento", new ArrayList<>());
		stock.get("pensamiento").add(2.0);
		stock.get("pensamiento").add(20.0);
		
		stock.put("azalea", new ArrayList<>());
		stock.get("azalea").add(2.0);
		stock.get("azalea").add(20.0);
		
		stock.put("lirio", new ArrayList<>());
		stock.get("lirio").add(2.0);
		stock.get("lirio").add(20.0);
		
		stock.put("hortensia", new ArrayList<>());
		stock.get("hortensia").add(2.0);
		stock.get("hortensia").add(20.0);
		
		stock.put("narciso", new ArrayList<>());
		stock.get("narciso").add(2.0);
		stock.get("narciso").add(20.0);
		
		stock.put("lavanda", new ArrayList<>());
		stock.get("lavanda").add(2.0);
		stock.get("lavanda").add(20.0);

		
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
				
				System.out.println("Introducela cantidad del producto:");
				double cant = scn.nextDouble();
				System.out.println("Introduce el valor de cada unidad del producto:");
				double precio = scn.nextDouble();
//				stock.put(prod, precio);
				stock.put(prod, new ArrayList<>());
				stock.get(prod).add(cant);
				stock.get(prod).add(precio);
				System.out.println("Producto añadido.");
				elecc=0;
				break;
			case 2:
				System.out.println("Introduce el nombre del producto a consultar:");
				prod = scn.next();
				if (stock.get(prod) !=null) {
					System.out.println("El producto " + prod + " tiene de cantidad: " + stock.get(prod).get(0));
					System.out.println("El producto " + prod + " tiene de precio: " + stock.get(prod).get(1));
				}else {
					System.out.println("Producto no encontrado");
				}
				elecc=0;
				break;
			case 3:
				stock.forEach(
						(k,v) -> {System.out.println(k + " [" + v.get(0) + "] ->"+ v.get(1) + "€");}
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
