
package com.gg.portfolio.security.service;

import com.gg.portfolio.security.entity.Rol;
import com.gg.portfolio.security.enums.rolNombre;
import com.gg.portfolio.security.repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepo;
    
    public Optional<Rol> getByRolNombre(rolNombre rolNombre){
    return irolRepo.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepo.save(rol);
    }

}
