package cengiz.data.mapper.mappers;

import cengiz.data.dto.PersonelDto;
import cengiz.data.entity.Personel;
import cengiz.data.mapper.mapperBase.MapperBase;

import org.mapstruct.Mapper;




@Mapper
public interface PersonelMapper extends MapperBase<Personel, PersonelDto> {

}
