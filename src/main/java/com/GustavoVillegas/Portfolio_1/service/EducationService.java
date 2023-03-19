package com.GustavoVillegas.Portfolio_1.service;

import com.GustavoVillegas.Portfolio_1.model.Education;
import com.GustavoVillegas.Portfolio_1.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository educRepo;
    
    @Override
    public List<Education> verEducaciones() {
        return educRepo.findAll();
    }

    @Override
    public Education crearEducacion(Education educ) {
        return educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Education educ) {
        educRepo.delete(educ);
    }
    @Override
    public Education modifEducacion(Education educ) {
         return educRepo.save(educ);
    }
    
    @Override
    public Education buscarEducacion(Long id){
    return educRepo.findById(id).orElse(null);
    }
}
