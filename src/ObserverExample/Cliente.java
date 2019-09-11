package ObserverExample;

/**
 * Clase abstracta cliente, los clientes ser�an los Observadores.
 * @author Chac�n Campos
 *
 */
public abstract class Cliente {
	protected Libreria subject;
	protected int cantidadActual;
	
	/**
	 * 
	 */
	public abstract void update();
	
	/**
	 * 
	 */
	public abstract void buyBook();

}
