package ObserverExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase "Sujeto", contiene datos y observadores interesados en estos.
 * @author Chac�n Campos
 *
 */
public class Libreria {
	private List<Cliente> observers = new ArrayList<Cliente>();
	private int GameOfThrones;
	private int LordOfTheRings;
	private int DiscWorld;
	
	public Libreria() {
		GameOfThrones = 0;
		LordOfTheRings = 0;
		DiscWorld = 0;
	}
	
	/**
	 * @return Cantidad de libros de Game of Thrones disponibles.
	 */
	public int getGameOfThrones() {
		return GameOfThrones;
	}
	
	/**
	 * 
	 * @return Cantidad de libros de Lord of the Rings disponibles.
	 */
	public int getLordOfTheRings() {
		return LordOfTheRings;
	}
	
	/**
	 * @return Cantidad de libros de Discworld disponibles.
	 */
	public int getDiscWorld() {
		return DiscWorld;
	}
	
	/**
	 * Este metodo "abastece" el inventario de libros de Game of Thrones.
	 */
	public void restockGOT() {
		GameOfThrones++;
		notifyObservers();
	}
	
	/**
	 * Este metodo "abastece" el inventario de libros de Lord of the Rings.
	 */
	public void restockLOTR() {
		LordOfTheRings++;
		notifyObservers();
	}
	/**
	 * Este metodo "abastece" el inventario de libros de Discworld.
	 */
	public void restockDW() {
		DiscWorld++;
		notifyObservers();
	}
	/**
	 * En este m�todo se "venden" libros de Discworld.
	 */
	public void sellDW() {
		if (DiscWorld != 0) {
			DiscWorld--;
		}
		notifyObservers();
	}
	/**
	 * En este m�todo se "venden" libros de Game of Thrones.
	 */
	public void sellGOT() {
		if (GameOfThrones != 0) {
			GameOfThrones--;
		}
		notifyObservers();
	}
	/**
	 * En este m�todo se "venden" libros de Lord of the Rings.
	 */
	public void sellLOTR() {
		if (LordOfTheRings != 0) {
			LordOfTheRings--;
		}
		notifyObservers();
	}
	/**
	 * Este m�todo agrega clientes a la lista de observadores de la librer�a.
	 */
	public void attach(Cliente observer) {
		observers.add(observer);
	}
	/**
	 * Con este m�todo se notifica a todos los observadores de la librer�a de los cambios en el inventario
	 */
	public void notifyObservers() {
		for (Cliente observer: observers) {
			observer.update();
		}
	}
	

}
