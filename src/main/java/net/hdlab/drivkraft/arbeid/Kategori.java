package net.hdlab.drivkraft.arbeid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Brukte mal fra https://github.com/spring-projects/spring-data-examples/blob/main/r2dbc/example/src/main/java/example/springdata/r2dbc/basics/Customer.java
@Entity
public record Kategori(@Id Integer id, String navn) {
}
