package entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
	private List<Prodotto> prodotti;

	public Menu(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public void aggiungiProdotto(Prodotto prodotto) {
		prodotti.add(prodotto);
	}

	public void stampaMenu() {
		for (Prodotto prodotto : prodotti) {
			System.out.println(prodotto.getNome() + " - " + prodotto.getPrezzo() + "€");
			System.out.println(prodotto.getInformazioniNutrizionali());
			System.out.println();
		}
	}

}