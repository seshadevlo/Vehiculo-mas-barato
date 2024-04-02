package programa_Vehiculos;

import java.util.Scanner;

public class ImplVehiculo {

	public static void main(String[] args) {
		
		String marca, modelo;
		int precio, numVehiculos,indicePrecioVehiculoMasBarato;
		
		Scanner sc = new Scanner(System.in);
		
		//se establece la cantidad de objetos a crear en el array
		System.out.println("Ingrese la cantidad de vehiculos: ");
		numVehiculos = sc.nextInt();
		Vehiculo vehiculoArray[] = new Vehiculo[numVehiculos];
		
		//se obtiene la informacion para guardar en el array
		for (int i=0; i<vehiculoArray.length; i++) {
			sc.nextLine();
			System.out.println("Ingrese las caracteristicas del vehiculo"+(i+1)+":");
			System.out.println("Ingrese la Marca del vehiculo");
			marca = sc.nextLine();
			System.out.println("Ingrese el Modelo del vehiculo");
			modelo = sc.nextLine();
			System.out.println("Ingrese el Precio del vehiculo");
			precio = sc.nextInt();
			sc.close();

			//guardamos los parametros en el array
			vehiculoArray[i] = new Vehiculo(marca, modelo, precio);
			
		}//fin del ciclo for
		
		//mostrar por pantalla la instancia con las caracteristicas requeridas
		indicePrecioVehiculoMasBarato = indicePrecioVehiculoMasBarato(vehiculoArray);
		System.out.println("El vehiculo más barato es: ");
		System.out.println(vehiculoArray[indicePrecioVehiculoMasBarato].mostrarDatosVehiculo());
		
	}//fin del main
	
	//metodo estatico que retorna el indice del vehiculo mas barato.
	
	public static int indicePrecioVehiculoMasBarato(Vehiculo vehiculo[]) {
		int precio;
		int indice = 0;
		
		precio = vehiculo[0].obtenerPrecio();
		
		for (int i = 1; i<vehiculo.length; i++) {
			precio = vehiculo[i].obtenerPrecio();
			indice = i;	
		}
		return indice; //retorna el vehiculo mas barato 
	}
	
}
