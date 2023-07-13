package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class PessoaDTO {

    private Long idPessoa;
    private String nome;
    private Date nascimento;
    private Float alt;

}
