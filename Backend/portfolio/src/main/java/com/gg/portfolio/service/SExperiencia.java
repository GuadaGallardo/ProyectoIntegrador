
package com.gg.portfolio.service;

import com.gg.portfolio.entity.Experiencia;
import com.gg.portfolio.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia repoExperiencia;
    
    public List<Experiencia> list(){
            return repoExperiencia.findAll();
    }    
    
        public Optional<Experiencia> getOne(int id){
        return repoExperiencia.findById(id);
    }
        
    public Optional<Experiencia> getByNombreE(String nombreE){
        return repoExperiencia.findByNombreE(nombreE);
    }     
    
    public void save(Experiencia expe){
        repoExperiencia.save(expe);
    }
    
    public void delete(int id){
        repoExperiencia.deleteById(id);
    
    }
    
    
   public boolean existById(int id){
       return repoExperiencia.existsById(id);
   } 
   
   public boolean existByNombre(String nombreE){
       return repoExperiencia.existByNombreE(nombreE);
   }
   
   
}
