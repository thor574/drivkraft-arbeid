package net.hdlab.drivkraft.arbeid;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Brukte mal fra eget prosjekt d-emographics (som er basert på Spring Data Rest eksempel)
@Entity
public class Oppgave {

	private @Id Integer id;
	private String navn;
	
	boolean hasId() {
		return id != null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Oppgave oppgave)) {
			return false;
		}
		return Objects.equals(navn, oppgave.navn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(navn);
	}
}