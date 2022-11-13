package net.hdlab.drivkraft.arbeid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Brukte mal fra eget prosjekt d-emographics (som er basert på Spring Data Rest eksempel)
@RepositoryRestResource(collectionResourceRel="oppgave", path="oppgaver")
public interface OppgaveRepo extends JpaRepository<Oppgave, Integer> {

}
