package com.GustavoVillegas.Portfolio_1.repository;

import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto,Long>{
    
}
