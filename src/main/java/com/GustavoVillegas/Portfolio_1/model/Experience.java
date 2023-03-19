package com.GustavoVillegas.Portfolio_1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity

public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String img;
    private String company;
    private String position1;                                              
    private String start;
    private String end;
    private String descriptionPosition;

   
    
    public Experience(){
    }
    
    public Experience(Long id, String img, String company, String position1, String start, String end,String descriptionPosition){
         
        this.id = id;
        this.img = img;
        this.company = company;
        this.position1 = position1;
        this.start = start;
        this.end = end;
        this.descriptionPosition = descriptionPosition;   
    }
    
    public boolean equals(Experience exp){
        return this.getId().equals(exp.getId());
    }
}
