
package com.GustavoVillegas.Portfolio_1.repository;

import com.GustavoVillegas.Portfolio_1.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    Boolean existsByPasswordAndEmail(String password, String email);
}
