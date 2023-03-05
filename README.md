# Guia de apoyo

### Reference Documentation

proeycto que pide: CRUD de Api rest de Productos.

Tecnologías:

- Spring Boot 3.0.4
- BD: Postgresql
- Postman - Insomnia (a elección)

Archivo POM:

- Driver Pgsql
- Mockito
- Junit
### Representación del modelo trabajado:

####  Estructura:

- Controller: Contiene los métodos que llamaremos por Postman para invocar nuesta Api Rest.
- Models: Contiene la definición de los datos definidos para el ejercicio.
- Repositories: Tiene la Interfaz "ProductRepository" que extiende de CRUDREPOSITORY.
- Service: Tiene todos los metodos que extiende de CRUD Repository invocando en ProductRepository.


### Postman Collection

- Se agrega Archivo de Testing para Postman en formato JSON 
