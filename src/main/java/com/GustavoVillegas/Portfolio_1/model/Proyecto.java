package com.GustavoVillegas.Portfolio_1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String img;
    private String name;
    private String technology;
    private String start;
    private String end ;
    private String descriptionPosition;
    
    public Proyecto (){
    }
    
    public Proyecto (Long id, String name, String technology,String start, String end,String descriptionPosition){
        
        this.id = id;
        this.img = img;
        this.name = name;
        this.technology = technology;
        this.start = start;
        this.end = end;
        this.descriptionPosition = descriptionPosition;
    }
     public boolean equals(Proyecto proy){
        return this.getId().equals(proy.getId());
    }
    }
