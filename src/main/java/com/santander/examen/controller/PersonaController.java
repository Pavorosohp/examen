package com.santander.examen.controller;

import com.santander.examen.service.PersonaService;
import com.santander.examen.util.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/personas")
public class PersonaController {

    private PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    @GetMapping(name = "Endpoint para el listado de personas",value = {"","/{id}"})
    public ResponseEntity<List<PersonaDto>> findUser(@PathVariable(required = false,name = "id") Optional<Long> id) {
        return ResponseEntity.ok( this.personaService.findPersonaCustom( id ) );
    }

}
