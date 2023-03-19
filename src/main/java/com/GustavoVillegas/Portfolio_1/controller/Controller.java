package com.GustavoVillegas.Portfolio_1.controller;

import com.GustavoVillegas.Portfolio_1.model.Credenciales;
import com.GustavoVillegas.Portfolio_1.model.Education;
import com.GustavoVillegas.Portfolio_1.model.Experience;
import com.GustavoVillegas.Portfolio_1.model.Persona;
import com.GustavoVillegas.Portfolio_1.model.Proyecto;
import com.GustavoVillegas.Portfolio_1.service.IEducationService;
import com.GustavoVillegas.Portfolio_1.service.IExperienceService;
import com.GustavoVillegas.Portfolio_1.service.IPersonaService;
import com.GustavoVillegas.Portfolio_1.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  
@RestController
public class Controller {
    
    @Autowired
    public IPersonaService persoServ;
    
    @Autowired
    public IExperienceService expServ;
    
    @Autowired
    public IEducationService educServ;
    
    @Autowired
    public IProyectoService proyServ;
    
     @Autowired
    public IPersonaService credServ;
    
    

    
    @PostMapping ("/new/persona")
   public void agregarPersona (@RequestBody Persona pers){
    persoServ.crearPersona(pers);
   }
   
   
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
    return persoServ.verPersonas();
    }
    
       @GetMapping ("/ver/persona/{id}")
       @ResponseBody
       public Persona verPersona(@PathVariable long id){
       return persoServ.verPersona(id);    
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable long id) {
        persoServ.borrarPersona(id);
    }
    
     @PutMapping ("/edit/persona")
   public void modifPersona (@RequestBody Persona pers){
    persoServ.modifPersona(pers);
   }
      @PostMapping("/iniciar-secion")
    public Boolean login(@RequestBody Credenciales cred) {
        System.out.println("ok");
        return persoServ.login( cred.getPassword(), cred.getEmail());        
    }
    /*-------- controller experiencia-------*/
       
      
      @GetMapping ("/ver/experiencias")
      @ResponseBody
      public List<Experience> verExperiencias (){
          return expServ.verExperiencias();
      }
      
      @DeleteMapping ("/delete/experiencia/{idexp}/{id}")
    public void borrarExperiencia(@PathVariable Experience idexp,@PathVariable Persona id) {
        persoServ.borrarExperiencia(idexp, id);
    }
    
       @PostMapping("/new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experience exp,@PathVariable Persona id){
        persoServ.agregarExperiencia(exp, id);
    
    }
    @PutMapping ("/edit/experiencia")
   public void modifExperiencia (@RequestBody Experience exp){
    expServ.modifExperiencia(exp);
   }
   
   @GetMapping ("/buscar/experiencia/{id}")
    @ResponseBody
       public Experience buscarExperiencia(@PathVariable Long id){
       return expServ.buscarExperiencia(id);
    }
   
    /*----------------controller Education -----------*/
    
    @PostMapping("/new/educacion/{id}")
    public void crearEducacion(@RequestBody Education educ,@PathVariable Persona id){
        persoServ.agregarEducacion(educ, id);
    
    }
    
     @GetMapping ("/ver/educaciones")
      @ResponseBody
      public List<Education> verEducaciones (){
          return educServ.verEducaciones();
      }
      
      @DeleteMapping ("/delete/educacion/{ideduc}/{id}")
    public void borrarEducacion(@PathVariable Education ideduc,@PathVariable Persona id) {
        persoServ.borrarEducacion(ideduc, id);
    }
    @PutMapping ("/edit/educacion")
   public void modifEducacion (@RequestBody Education educ){
    educServ.modifEducacion(educ);
   }
   
    @GetMapping ("/buscar/estudio/{id}")
    @ResponseBody
       public Education buscarEstudio(@PathVariable Long id){
       return educServ.buscarEducacion(id);
    }
    
   
    
    /*-------------------controller Proyecto------------*/
    
       @PostMapping("/new/proyecto/{id}")
    public void crearProyecto(@RequestBody Proyecto proy,@PathVariable Persona id){
        persoServ.agregarProyecto(proy, id);
    
    }
     @GetMapping ("/ver/proyectos")
      @ResponseBody
      public List<Proyecto> verProyectos (){
          return proyServ.verProyectos();
      }
      
      @DeleteMapping ("/delete/proyecto/{idproy}/{id}")
    public void borrarProyecto(@PathVariable Proyecto idproy,@PathVariable Persona id) {
        persoServ.borrarProyecto(idproy, id);
    }
    @PutMapping ("/edit/proyecto")
   public void modifProyecto (@RequestBody Proyecto proy){
    proyServ.modifProyecto(proy);
   }
    
   @GetMapping ("/buscar/proyecto/{id}")
    @ResponseBody
       public Proyecto buscarProyecto(@PathVariable Long id){
       return proyServ.buscarProyecto(id);
    }
 }


