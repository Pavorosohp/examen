package com.santander.examen.service;

import com.santander.examen.util.PersonaDto;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    /**
     * Metodo para obtener a la persona por medio del id
     * o la lista completa
     * @return
     */
    List<PersonaDto> findPersonaCustom(Optional<Long> id);

}
