Main task of this assignment is development of REST APIs to support CRUD operations for Location based services. During my work, I used:
- ORM (Object-relational mapping) for database access, 
- DTOs (Data Transfer Objects) to transport data,
- Swagger Api documentation. 
Also, I separated business logic from controller. For development, I used  libraries like: Spring Data JPA, Spring WEB, PostgreSQL Driver, Lombok, Springfox Swagger2 and a few more.
System implementation consists of the following functionalities:
- Location object with following data:
	- Name
	- Address
	- City 
	- Longitude
	- Latitude
- Reading list of locations with optional filter by city and search by name (like operator)
- Reading single location by location ID 
- Updating location (name, address, city, longitude, latitude)
- Deleting locations
