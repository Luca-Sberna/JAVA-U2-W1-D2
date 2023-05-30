package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Prodotto {
	private String nome;
	private double prezzo;
	private String informazioniNutrizionali;

	public Prodotto(String nome, double prezzo, String informazioniNutrizionali) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.informazioniNutrizionali = informazioniNutrizionali;
	}

}