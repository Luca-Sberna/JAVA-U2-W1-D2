package entities;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordine {
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numeroCoperti;
	private LocalDateTime oraAcquisizione;
	private double importoTotale;
	private List<ElementoOrdine> elementi;
	private Tavolo tavolo;

	public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti, LocalDateTime oraAcquisizione,
			double importoTotale, List<ElementoOrdine> elementi, Tavolo tavolo) {
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		this.oraAcquisizione = oraAcquisizione;
		this.importoTotale = importoTotale;
		this.elementi = elementi;
		this.tavolo = tavolo;

	}

	public enum StatoOrdine {
		IN_CORSO, PRONTO, SERVITO
	}

	public double calcolaImportoTotale() {
		double totale = 0;

		for (ElementoOrdine elemento : elementi) {
			totale += elemento.getProdotto().getPrezzo();
		}

		return totale;
	}

}
