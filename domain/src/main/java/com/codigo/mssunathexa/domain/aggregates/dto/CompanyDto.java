package com.codigo.mssunathexa.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class CompanyDto {
    private Long id;
    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
    private String condicion;
    private String direccion;
    private String ubigeo;
    private String viaTipo;
    private String viaNombre;
    private String zonaCodigo;
    private String zonaTipo;
    private String numero;
    private String interior;
    private String lote;
    private String dpto;
    private String manzana;
    private String kilometro;
    private String distrito;
    private String provincia;
    private String departamento;
    @JsonProperty("EsAgenteRetencion")
    private boolean esAgenteRetencion;
    private String tipo;
    private String actividadEconomica;
    private String numeroTrabajadores;
    private String tipoFacturacion;
    private String tipoContabilidad;
    private String comercioExterior;
    private String userCreated;
    private Timestamp dateCreated;
    private String userUpdate;
    private Timestamp dateUpdate;
    private String userDelete;
    private Timestamp dateDelete;
}