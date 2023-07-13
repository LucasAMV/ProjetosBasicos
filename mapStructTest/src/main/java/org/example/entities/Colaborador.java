package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Colaborador {

    private Long idColaborador;
    private Integer matricula;
    private Date dataAdmissao;
    private Pessoa pessoa;

}
