import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Hashtable<String, ArrayList<Double>> stock = new Hashtable<String, ArrayList<Double>>();
		stock.put("rosa", new ArrayList<>());
		stock.get("rosa").add(10.0);
		stock.get("rosa").add(1.0);
		
		
		stock.put("tulipan", new ArrayList<>());
		stock.get("tulipan").add(20.0);
		stock.get("tulipan").add(2.0);
		
		
		stock.put("girasol", new ArrayList<>());
		stock.get("girasol").add(20.0);
		stock.get("girasol").add(2.0);
		
		
		stock.put("orquídea", new ArrayList<>());
		stock.get("orquídea").add(20.0);
		stock.get("orquídea").add(2.0);
		
		
		stock.put("pensamiento", new ArrayList<>());
		stock.get("pensamiento").add(20.0);
		stock.get("pensamiento").add(2.0);
		
		
		stock.put("azalea", new ArrayList<>());
		stock.get("azalea").add(20.0);
		stock.get("azalea").add(2.0);
		
		
		stock.put("lirio", new ArrayList<>());
		stock.get("lirio").add(20.0);
		stock.get("lirio").add(2.0);
		
		
		stock.put("hortensia", new ArrayList<>());
		stock.get("hortensia").add(20.0);
		stock.get("hortensia").add(2.0);
		
		stock.put("narciso", new ArrayList<>());
		stock.get("narciso").add(20.0);
		stock.get("narciso").add(2.0);
		
		
		stock.put("lavanda", new ArrayList<>());
		stock.get("lavanda").add(20.0);
		stock.get("lavanda").add(2.0);
		

		ArrayList<Double> carrito = new ArrayList<>();
		
		double precioBruto = 0;
		int cont = 0;
		while (cont != -1) {
			switch (cont) {
			case 0: // menu
				System.out.println("1. Añadir un producto nuevo al stock");
				System.out.println("2. Consultar información de un producto del stock");
				System.out.println("3. Listar todos los productos del stock");
				System.out.println("4. Introducir un producto al carrito");
				System.out.println("5. Cobrar carrito");
				System.out.println("6. Salir de la aplicación");
				cont = scn.nextInt();
				break;
			case 1:// Añadir producto al stock
				System.out.println("Introduce el nombre del producto a añadir:");
				String prod=scn.next();
				
				System.out.println("Introducela cantidad del producto:");
				double cant = scn.nextDouble();
				System.out.println("Introduce el valor de cada unidad del producto:");
				double precio = scn.nextDouble();
				stock.put(prod, new ArrayList<>());
				stock.get(prod).add(precio);
				stock.get(prod).add(cant);
				System.out.println("Producto añadido.");
				cont = 0;
				break;
			case 2:// consultar producto del stock
				System.out.println("Introduce el nombre del producto a consultar:");
				prod = scn.next();
				if (stock.get(prod) !=null) {
					System.out.println("El producto " + prod + " tiene de cantidad: " + stock.get(prod).get(1));
					System.out.println("El producto " + prod + " tiene de precio: " + stock.get(prod).get(0));
				}else {
					System.out.println("Producto no encontrado");
				}
				cont = 0;
				break;
			case 3:// listar todo el stock
				stock.forEach(
						(k,v) -> {System.out.println(k + " [" + v.get(0) + "] ->"+ v.get(1) + "€");}
				);
				cont = 0;
				break;
			case 4:// añadir producto al carro de la compra
				System.out.println("Introduce el nombre del producto que vas a añadir al carrito");
				prod = scn.next();
				if (stock.get(prod) != null) {
					System.out.println("Introduce la cantidad a comprar:");
					cant = scn.nextInt();
					double rest = stock.get(prod).get(1);
					double res=rest*cant;
					carrito.add(res);
					stock.get(prod).get(1).toString();
					
				} else {
					System.out.println("Producto no encontrado");
				}
				cont = 0;
				break;
			case 5:// cobrar carrito
				System.out.println("Tipo de iva a añadir (1)21% (2)4%");
				int eleccionIva = scn.nextInt();

				double iva = 0;
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

				for (int i = 0; i < carrito.size(); i++) {
					precioBruto +=carrito.get(i);
				}
				
				double precioIva = precioBruto + (precioBruto * iva);
				System.out.println("Iva añadido del " + iva * 100 + "%");
				System.out.println("Precio bruto: " + precioBruto + "€");
				System.out.println("Precio total: " + precioIva + "€");
				System.out.println("Numero de articulos comprados:" + carrito.size());
				System.out.println("Introduce la cantidad pagada:");
				double pago = scn.nextDouble();
				System.out.println("Cambio a devolver al cliente:" + (pago - precioIva) + "€");
				cont = -1;

				break;
			case 6:// salir
				System.out.println("Gracias por usar nuestra aplicacion");
				cont = -1;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + cont);
			}
		}

		scn.close();
	}

}
