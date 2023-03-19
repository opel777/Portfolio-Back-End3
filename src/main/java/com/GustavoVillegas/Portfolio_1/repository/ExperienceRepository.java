
package com.GustavoVillegas.Portfolio_1.repository;

import com.GustavoVillegas.Portfolio_1.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience,Long> {
    
}
