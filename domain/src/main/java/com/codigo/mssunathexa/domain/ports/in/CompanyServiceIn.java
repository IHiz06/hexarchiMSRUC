package com.codigo.mssunathexa.domain.ports.in;

import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;

public interface CompanyServiceIn {
    CompanyDto createCompanyIn(String ruc);
}
