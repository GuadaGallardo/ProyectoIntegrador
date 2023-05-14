
package com.gg.portfolio.security.entity;

import com.gg.portfolio.security.enums.rolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private rolNombre rolNombre;
    
    
   //constructor

    public Rol() {
    }

    public Rol(rolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public rolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(rolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
   
}

