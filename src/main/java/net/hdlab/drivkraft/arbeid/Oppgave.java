package net.hdlab.drivkraft.arbeid;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Brukte mal fra https://github.com/spring-projects/spring-data-examples/blob/main/r2dbc/example/src/main/java/example/springdata/r2dbc/basics/Customer.java
//record Oppgave(@Id Integer id, String navn) {
// Var litt for rask der.  Gjør det på eldre måte:

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