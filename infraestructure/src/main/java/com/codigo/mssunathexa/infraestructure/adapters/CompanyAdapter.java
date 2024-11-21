package com.codigo.mssunathexa.infraestructure.adapters;

import com.codigo.mssunathexa.domain.aggregates.constants.Constants;
import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;
import com.codigo.mssunathexa.domain.aggregates.response.ResponseSunat;
import com.codigo.mssunathexa.domain.ports.out.CompanyServiceOut;
import com.codigo.mssunathexa.infraestructure.dao.CompanyRepository;
import com.codigo.mssunathexa.infraestructure.entity.CompanyEntity;
import com.codigo.mssunathexa.infraestructure.mapper.CompanyMapper;
import com.codigo.mssunathexa.infraestructure.rest.SunatClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Log4j2
public class CompanyAdapter implements CompanyServiceOut {

    private final CompanyRepository companyRepository;
    private final SunatClient sunatClient;
    private final CompanyMapper companyMapper;

    @Value("${token.api}")
    private String token;


    @Override
    public CompanyDto createCompanyOut(String ruc) {
        CompanyEntity company = getEntity(ruc);
        CompanyEntity dato = companyRepository.save(company);
        CompanyDto dto = companyMapper.mapToDto(dato);
        log.info("Dato Recibido del DTO: "+ dto.toString());
        return dto;
    }

    //Metodo de Apoyo
    private CompanyEntity getEntity(String ruc){
        ResponseSunat responseSunat = execute(ruc);
        if(Objects.nonNull(responseSunat)){
            return CompanyEntity.builder()
                    .razonSocial(responseSunat.getRazonSocial())
                    .tipoDocumento(responseSunat.getTipoDocumento())
                    .numeroDocumento(responseSunat.getNumeroDocumento())
                    .estado(responseSunat.getEstado())
                    .condicion(responseSunat.getCondicion())
                    .direccion(responseSunat.getDireccion())
                    .ubigeo(responseSunat.getUbigeo())
                    .viaTipo(responseSunat.getViaTipo())
                    .viaNombre(responseSunat.getViaNombre())
                    .zonaCodigo(responseSunat.getZonaCodigo())
                    .zonaTipo(responseSunat.getZonaTipo())
                    .numero(responseSunat.getNumero())
                    .interior(responseSunat.getInterior())
                    .lote(responseSunat.getLote())
                    .dpto(responseSunat.getDpto())
                    .manzana(responseSunat.getManzana())
                    .kilometro(responseSunat.getKilometro())
                    .distrito(responseSunat.getDistrito())
                    .provincia(responseSunat.getProvincia())
                    .departamento(responseSunat.getDepartamento())
                    .esAgenteRetencion(responseSunat.isEsAgenteRetencion())
                    .tipo(responseSunat.getTipo())
                    .actividadEconomica(responseSunat.getActividadEconomica())
                    .numeroTrabajadores(responseSunat.getNumeroTrabajadores())
                    .tipoFacturacion(responseSunat.getTipoFacturacion())
                    .tipoContabilidad(responseSunat.getTipoContabilidad())
                    .comercioExterior(responseSunat.getComercioExterior())
                    .userCreated(Constants.USU_ADMIN)
                    .dateCreated(new Timestamp(System.currentTimeMillis()))
                    .build();
        }
        return null;
    }

    private ResponseSunat execute (String ruc){
        String head = "Bearer "+ token;
        return sunatClient.getInfoSunat(ruc, head);
    }
}
