package com.GustavoVillegas.Portfolio_1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
 
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String img;
    private String instituto;
    private String areaEstudio;
    private String position1;
    private String start;
    private String end;
    private String descriptionPosition;
    
    
    public Education (){
    }
    
    public Education (Long id,String img, String instituto, String areaEstudio,String position1,String start, String end, String descriptionPosition){
        
        this.id = id;
        this.img = img;
        this.instituto = instituto;
        this.areaEstudio = areaEstudio;
        this.position1 = position1;
        this.start = start;
        this.end = end;
        this.descriptionPosition = descriptionPosition;
        
    }
     public boolean equals(Education educ){
        return this.getId().equals(educ.getId());
    }
}
