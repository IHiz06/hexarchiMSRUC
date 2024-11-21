package com.codigo.mssunathexa.infraestructure.dao;

import com.codigo.mssunathexa.infraestructure.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
