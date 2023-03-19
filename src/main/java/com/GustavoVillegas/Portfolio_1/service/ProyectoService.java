package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import com.GustavoVillegas.Portfolio_1.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proy) {
        return proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Proyecto proy) {
        proyRepo.delete(proy);
    }
    @Override
    public Proyecto modifProyecto(Proyecto proy) {
        return proyRepo.save(proy);
    }
    
    @Override
    public Proyecto buscarProyecto(Long id){
    return proyRepo.findById(id).orElse(null);
    }
}
