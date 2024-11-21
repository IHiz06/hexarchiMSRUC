package com.codigo.mssunathexa.domain.impl;

import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;
import com.codigo.mssunathexa.domain.ports.in.CompanyServiceIn;
import com.codigo.mssunathexa.domain.ports.out.CompanyServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyServiceIn {

    private final CompanyServiceOut companyServiceOut;

    @Override
    public CompanyDto createCompanyIn(String ruc) {
        return companyServiceOut.createCompanyOut(ruc);
    }
}
