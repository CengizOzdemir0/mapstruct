package cengiz.service;

import cengiz.data.dto.PersonelDto;



public interface PersonelService {

  PersonelDto findById(Long id);



  PersonelDto save(PersonelDto personelDto);
}
