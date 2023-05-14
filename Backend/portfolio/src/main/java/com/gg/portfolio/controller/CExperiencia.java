
package com.gg.portfolio.controller;

import com.gg.portfolio.entity.Experiencia;
import com.gg.portfolio.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expeLaboral")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    public SExperiencia servExperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = servExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
