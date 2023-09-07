package com.santander.examen.service.impl;

import com.santander.examen.model.Persona;
import com.santander.examen.respository.PersonaRepository;
import com.santander.examen.service.PersonaService;
import com.santander.examen.util.PersonaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements PersonaService {

    private static final Logger logger= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<PersonaDto> findPersonaCustom(Optional<Long> id) {
        logger.info("Ingresando al metodo :: findPersonaCustom() :: ");
        List<Persona> tmpList;
        Optional<Persona> opPersona;
        if( !id.isPresent())
           tmpList = this.findAll();
        else {
            opPersona =  this.findById(id.get());
            tmpList  = opPersona.isPresent() ? Collections.singletonList(opPersona.get()) : this.findAll() ;
        }
        logger.info("Saliendo del metodo :: findPersonaCustom() :: resultado <<{}>>", tmpList);
        return tmpList.stream()
                    .map( i-> PersonaDto.builder()
                                .id(i.getId())
                                .nombre(i.getNombre())
                                .apellido_paterno(i.getApellido_paterno())
                                .apellido_materno(i.getApellido_materno())
                                .rfc(i.getRfc())
                                .curp(i.getCurp())
                                .sexo(i.getSexo())
                                .nacionalidad(i.getNacionalidad())
                                .build()
                    )
                    .collect(Collectors.toList());
    }

    private Optional<Persona> findById(long id){
        return this.personaRepository.findById(id);
    }

    private List<Persona> findAll(){
        return this.personaRepository.findAll();
    }
}
