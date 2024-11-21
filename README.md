# Registro de Empresas

Este repositorio contiene un proyecto para realizar un registro de empresas mediante la consulta a un microservicio **RUC**.  
Está desarrollado utilizando **OpenFeign** y basado en la **arquitectura hexagonal**, aunque aún está en proceso de aprendizaje y mejora.

## Requisitos
1. Agregar el **token** necesario para consumir el microservicio de consulta RUC.
2. Configurar la **contraseña** de la base de datos PostgreSQL en el archivo `application.properties`.

## Configuración
En el archivo `src/main/resources/application.properties`, se deben añadir las siguientes configuraciones:
```properties
# Configuración del microservicio
token.api=TU_TOKEN_AQUÍ

# Configuración de la base de datos
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_base_de_datos
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
