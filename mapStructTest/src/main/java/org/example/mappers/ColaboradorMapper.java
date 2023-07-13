package org.example.mappers;

import org.example.dto.ColaboradorDTO;
import org.example.entities.Colaborador;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = PessoaMapper.class)
public interface ColaboradorMapper {

    ColaboradorMapper INSTANCE = Mappers.getMapper( ColaboradorMapper.class );

    ColaboradorDTO colaboradorToColaboradorDto(Colaborador colaborador);

}
