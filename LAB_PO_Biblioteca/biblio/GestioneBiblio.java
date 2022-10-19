package biblio;

import org.polito.po.Console;

public class GestioneBiblio {
	public GestioneBiblio(Console console, Biblioteca biblio) {
	}

	public void start() {
	}

	public static void main(String[] args) {
		Console console = new Console();
		Biblioteca biblio = new Biblioteca();
		GestioneBiblio ui = new GestioneBiblio(console, biblio);
		ui.start();
	}
}
