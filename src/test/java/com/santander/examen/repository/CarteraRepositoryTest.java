package com.santander.examen.repository;

import com.santander.examen.config.BaseConfigClass;
import com.santander.examen.model.Persona;
import com.santander.examen.respository.PersonaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.invoke.MethodHandles;
import java.util.List;


public class CarteraRepositoryTest  extends BaseConfigClass {

    private static final Logger logger= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    @Order(2)
    public void findAll() {
        List<Persona> listUsuario = this.personaRepository.findAll();
        Assertions.assertNotNull(listUsuario, "No existen registros");
        listUsuario.forEach(i -> logger.info("{}", i.toString()));
    }

}
