package org.example.mappers;

import org.example.dto.PessoaDTO;
import org.example.entities.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper( PessoaMapper.class );

    @Mapping(target = "alt", source = "altura")
    @Mapping(target = "nascimento", source = "dataNascimento")
    PessoaDTO pessoaToPessoaDto(Pessoa pessoa);

}
