import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		BDController controladorbd = new BDController();
		int opc=0;
		do {
			switch(opc) {
				case 1:
					System.out.println("Introduce el codigo 1 del jugador");
				break;
				case 2:
					System.out.println("Introduce el codigo 2 del jugador");
				break;
				case 3:
					System.out.println("Introduce el codigo 3 del jugador");
				break;
				case 4:
					System.out.println("");
				break;
				case 5:
					System.out.println("");
				break;
				
			}
		}while(opc!=5);
		
		
		
	}
	public static void AltaJugador() {
		BDController controladorbd = new BDController();
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el codigo del jugador");
		boolean existejugador=false;
		do {
			String codigo = sc.nextLine();
			if(controladorbd.ExisteJugador(codigo)==false) {
				System.out.println("Este codigo del jugador ya esta en uso, introduzca otro");
			}else {
				existejugador=true;
			}
		}while(controladorbd.ExisteJugador(codigo)==false);
		System.out.println("Introduce el nombre del jugador");
		String nombre = sc.nextLine();
		System.out.println("Introduce la procedencia del jugador");
		String procedencia = sc.nextLine();
		System.out.println("Introduce la altura del jugador");
		String altura = sc.nextLine();
		System.out.println("Introduce el peso del jugador");
		String peso = sc.nextLine();
		System.out.println("Introduce la posicion del jugador");
		String posicion = sc.nextLine();
		for(int i =0;i<controladorbd.EquiposNBA().size();i++) {
			System.out.println(controladorbd.EquiposNBA());
		}
		do {
			String equipo = sc.nextLine();
			if(controladorbd.ExisteEquipo(equipo)==false) {
				System.out.println("Este equipo no existe introduce un equipo que exista");
			}
		}while(controladorbd.ExisteEquipo(equipo)==false);
	}
	
	public static void MostrarMenu() {
		System.out.println("1. Alta Jugador");
		System.out.println("2. Baja Jugador");
		System.out.println("3. Listado de equipos por division");
		System.out.println("4. Listado de equipos por conferenciar");
		System.out.println("5. Salir");

	}

}
