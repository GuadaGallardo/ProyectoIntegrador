
package com.gg.portfolio.security.service;

import com.gg.portfolio.security.entity.Usuario;
import com.gg.portfolio.security.repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iUsuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iUsuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iUsuarioRepo.save(usuario);
    }
}
