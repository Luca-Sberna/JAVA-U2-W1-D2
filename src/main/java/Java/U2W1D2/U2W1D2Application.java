package Java.U2W1D2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.ElementoOrdine;
import entities.Menu;
import entities.Ordine;
import entities.Ordine.StatoOrdine;
import entities.Prodotto;
import entities.Tavolo;
import entities.Tavolo.StatoTavolo;

@SpringBootApplication
public class U2W1D2Application {
	public static void main(String[] args) {
		SpringApplication.run(U2W1D2Application.class, args);

		// Crea il menu
		Prodotto pizzaMargherita = new Prodotto("Margherita", 5.0, "Informazioni nutrizionali");
		Prodotto pizzaDiavola = new Prodotto("Diavola", 6.0, "Informazioni nutrizionali");
		Prodotto birra = new Prodotto("Birra", 3.0, "Informazioni nutrizionali");

		List<Prodotto> prodotti = new ArrayList<>();
		prodotti.add(pizzaMargherita);
		prodotti.add(pizzaDiavola);
		prodotti.add(birra);
		Menu menu = new Menu(prodotti);
		menu.stampaMenu();

		// Crea un tavolo
		Tavolo tavolo1 = new Tavolo(1, 4, StatoTavolo.DISPONIBILE);

		// Crea un ordine
		ElementoOrdine elemento1 = new ElementoOrdine(pizzaMargherita, new ArrayList<>(), "Senza cipolla");
		ElementoOrdine elemento2 = new ElementoOrdine(birra, new ArrayList<>(), "");

		List<ElementoOrdine> elementi = new ArrayList<>();
		elementi.add(elemento1);
		elementi.add(elemento2);

		Ordine ordine1 = new Ordine(1, StatoOrdine.IN_CORSO, 4, LocalDateTime.now(), 0.0, elementi, tavolo1);

		// Calcola l'importo totale dell'ordine
		double importoTotale = ordine1.calcolaImportoTotale();
		System.out.println("Importo totale: " + importoTotale + "€");

		// Cambia lo stato dell'ordine
		ordine1.setStato(StatoOrdine.PRONTO);
	}
}
