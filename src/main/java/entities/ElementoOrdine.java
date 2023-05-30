package entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElementoOrdine {
	private Prodotto prodotto;
	private List<String> variazioni;
	private String nota;

	public ElementoOrdine(Prodotto prodotto, List<String> variazioni, String nota) {
		this.prodotto = prodotto;
		this.variazioni = variazioni;
		this.nota = nota;
	}

}
