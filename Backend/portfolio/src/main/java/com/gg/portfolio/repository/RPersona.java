
package com.gg.portfolio.repository;

import com.gg.portfolio.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
}
