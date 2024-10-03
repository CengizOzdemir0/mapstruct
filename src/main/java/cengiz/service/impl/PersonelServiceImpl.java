package cengiz.service.impl;


import cengiz.data.dto.PersonelDto;
import cengiz.data.entity.Personel;
import cengiz.data.mapper.mappers.PersonelMapper;
import cengiz.repository.PersonelRepository;
import cengiz.service.PersonelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonelServiceImpl implements PersonelService {

  private final PersonelRepository personelRepository;
  private final PersonelMapper personelMapper;

  @Override
  public PersonelDto findById(Long id){
    Optional<Personel> byId = personelRepository.findById(id);
    return byId.map(personelMapper::entityToDto).orElse(null);
  }


  @Override
  public PersonelDto save(PersonelDto personelDto){
    personelDto.setKayitZamani(LocalDateTime.now());
    personelDto.setIseBaslangicZamani(LocalDateTime.now());
    return personelMapper.entityToDto(personelRepository.save(personelMapper.dtoToEntity(personelDto)));
  }


}
