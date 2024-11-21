package com.codigo.mssunathexa.application.controller;

import com.codigo.mssunathexa.domain.aggregates.dto.CompanyDto;
import com.codigo.mssunathexa.domain.ports.in.CompanyServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyServiceIn companyServiceIn;

    @PostMapping("/{ruc}")
    public ResponseEntity<CompanyDto> createCompany(
            @PathVariable("ruc") String ruc){
        return ResponseEntity.ok(companyServiceIn.createCompanyIn(ruc));
    }
}
