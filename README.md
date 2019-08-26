Ejercicio
Proyecto Spring Boot conectado con MYSQL con peticion HTTP

Rutas:
PETICION / Ruta / Descirpcion

GET /api/countries/continent/name/{continentName}   <----- Obtiene los paises dado un continente valido

GET /api/countries/continent/id/{continentId}  <-------- Obtienen los paises dado una id de un continente(1.Asia,2.Europe,3.Africa 4.NorthAmerica)

GET /api/country/id/{countryId} <--------- Obtiene un pais dado la id del pais que se desee

POST /api/continent/country <----------- Guarda un nuevo pais dado un JSON{"name","capital","continente"}
