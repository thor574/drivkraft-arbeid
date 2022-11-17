package net.hdlab.drivkraft.arbeid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Brukte mal fra eget prosjekt d-emographics (som er basert på Spring Data Rest eksempel)
@RepositoryRestResource(collectionResourceRel="kategori", path="arbeid/kategorier")
public interface KategoriRepo extends JpaRepository<Kategori, Integer> {

}
