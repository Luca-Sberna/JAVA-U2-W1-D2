package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
	private int numero;
	private int postiMassimo;
	private StatoTavolo stato;

	public Tavolo(int numero, int postiMassimo, StatoTavolo stato) {
		this.numero = numero;
		this.postiMassimo = postiMassimo;
		this.stato = stato;
	}

	public enum StatoTavolo {
		OCCUPATO, DISPONIBILE
	}
}
