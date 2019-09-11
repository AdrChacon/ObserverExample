package ObserverExample;

/**
 * @author Chac�n Campos
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Libreria LibreriaCartago = new Libreria();
		
		LoTRclient Boromir = new LoTRclient(LibreriaCartago);
		GoTclient EddardStark = new GoTclient(LibreriaCartago);
		DWclient Rincewind = new DWclient(LibreriaCartago);
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		
		LibreriaCartago.restockDW();
		LibreriaCartago.restockDW();
		LibreriaCartago.restockDW();
		LibreriaCartago.restockDW();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		
		EddardStark.buyBook();
		Boromir.buyBook();
		Rincewind.buyBook();
		Rincewind.buyBook();
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		
		EddardStark.buyBook();
		Boromir.buyBook();
		Rincewind.buyBook();
		EddardStark.buyBook();
		Boromir.buyBook();
		Rincewind.buyBook();
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		
		LibreriaCartago.restockDW();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		LibreriaCartago.restockDW();
		LibreriaCartago.restockGOT();
		LibreriaCartago.restockLOTR();
		
		System.out.println();
		System.out.println("Cantidad de libros de GoT: " + LibreriaCartago.getGameOfThrones());
		System.out.println("Cantidad de libros de LOTR: " + LibreriaCartago.getLordOfTheRings());
		System.out.println("Cantidad de libros de DW: " + LibreriaCartago.getDiscWorld());
		System.out.println();
		

	}

}
