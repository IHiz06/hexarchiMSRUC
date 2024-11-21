package com.codigo.mssunathexa.domain.ports.out;

import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;

public interface CompanyServiceOut {
    CompanyDto createCompanyOut(String ruc);
}
