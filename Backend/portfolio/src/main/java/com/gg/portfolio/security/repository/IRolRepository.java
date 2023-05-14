
package com.gg.portfolio.security.repository;

import com.gg.portfolio.security.entity.Rol;
import com.gg.portfolio.security.enums.rolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre(rolNombre rolNombre);
    
}
