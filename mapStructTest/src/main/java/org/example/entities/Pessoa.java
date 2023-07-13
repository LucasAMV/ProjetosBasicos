package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Pessoa {

    private Long idPessoa;
    private String nome;
    private Date dataNascimento;
    private Float altura;

}
