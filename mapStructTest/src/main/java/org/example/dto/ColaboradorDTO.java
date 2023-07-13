package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class ColaboradorDTO {

    private Long idColaborador;
    private Integer matricula;
    private Date dataAdmissao;
    private PessoaDTO pessoa;

}
