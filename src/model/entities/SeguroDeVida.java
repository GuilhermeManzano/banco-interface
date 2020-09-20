package model.entities;

import model.services.Tributavel;

public class SeguroDeVida implements Tributavel {
	@Override
	public double calculaTributos() {
		return 42.0;
	}
}
