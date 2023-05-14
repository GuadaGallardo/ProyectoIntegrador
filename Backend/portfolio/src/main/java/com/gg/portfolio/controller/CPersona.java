
package com.gg.portfolio.controller;

import com.gg.portfolio.entity.Persona;
import com.gg.portfolio.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/lista") // metodo GET "dame datos"
    @ResponseBody         // renponder con el cuerpo de eso
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping("/crear") //post "mando datos"
    public String agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }
}
