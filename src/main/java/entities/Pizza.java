package entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Prodotto {
	private List<String> toppings;
	private String dimensione;
	private double costoTopping;

	public Pizza(String nome, double prezzo, String informazioniNutrizionali, List<String> toppings, String dimensione,
			double costoTopping) {
		super(nome, prezzo, informazioniNutrizionali);
		this.toppings = toppings;
		this.dimensione = dimensione;
		this.costoTopping = costoTopping;
	}

	public double calcolaPrezzo() {
		return getPrezzo() + (toppings.size() * costoTopping);
	}

}
