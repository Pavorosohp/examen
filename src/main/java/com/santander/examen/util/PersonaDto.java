package com.santander.examen.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto implements Serializable {

    private long id;

    private String nombre;

    private String apellido_paterno;

    private String apellido_materno;

    private String rfc;

    private String curp;

    private String sexo;

    private String nacionalidad;

}
