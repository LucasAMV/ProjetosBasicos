package org.example;

import org.example.dto.ColaboradorDTO;
import org.example.dto.PessoaDTO;
import org.example.entities.Colaborador;
import org.example.entities.Pessoa;
import org.example.mappers.ColaboradorMapper;
import org.example.mappers.PessoaMapper;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.builder().idPessoa(1L)
                .nome("João")
                .dataNascimento(new Date())
                .altura(1.75F).build();

        PessoaDTO pessoaDTO = PessoaMapper.INSTANCE.pessoaToPessoaDto(pessoa);

        System.out.println(pessoa);
        System.out.println(pessoaDTO);

        Colaborador colaborador = Colaborador.builder().idColaborador(2L)
                .matricula(385)
                .dataAdmissao(new Date())
                .pessoa(pessoa).build();

        ColaboradorDTO colaboradorDTO = ColaboradorMapper.INSTANCE.colaboradorToColaboradorDto(colaborador);

        System.out.println(colaborador);
        System.out.println(colaboradorDTO);
    }
}