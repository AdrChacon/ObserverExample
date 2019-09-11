package ObserverExample;

/**
 *  Esta es la clase concreta GoTclient, estos son los observadores interesados en los libros de
 *  Game of Thrones.
 * @author Chac�n Campos
 *
 */
public class GoTclient extends Cliente{
	
	/**
	 * 
	 */
	public GoTclient(Libreria subject) {
		this.subject = subject;
		this.subject.attach(this);
		this.cantidadActual = subject.getGameOfThrones();
	}
	/**
	 * 
	 */
	public void update() {
		if (cantidadActual == 0 && subject.getGameOfThrones() > 0) {
			System.out.println("GOT Client: Perfect! I'll go get a copy right now");
		} else if (cantidadActual != 0 && subject.getGameOfThrones() == 0) {
			System.out.println("GOT Client: I want to place an order for more Game of Thrones books.");
		}
		this.cantidadActual = subject.getGameOfThrones();
	}

	/**
	 * 
	 */
	@Override
	public void buyBook() {
		subject.sellGOT();
		
	}

}
