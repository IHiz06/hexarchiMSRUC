package com.codigo.mssunathexa.infraestructure.mapper;

import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;
import com.codigo.mssunathexa.infraestructure.entity.CompanyEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapper {
    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public CompanyDto mapToDto(CompanyEntity companyEntity){
        return MODEL_MAPPER.map(companyEntity, CompanyDto.class);
    }
    public CompanyEntity mapToEntity(CompanyDto companyDto){
        return MODEL_MAPPER.map(companyDto, CompanyEntity.class);
    }
}
