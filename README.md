# Employee_Management_System 
## It is a CRUD Application, developed API's for Employee DB and Department DB using Spring Boot and demonstrates the integration of PostgreSQL database and MongoDB database.

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* PostgreSQL Database
* MongoDB Database
* Lombok

### API Description:
## Employee DB (PostgreSQL):
 * Create: /api/emp/employees  (POST)
 * Read: /api/emp/employees  (GET) .  /api/emp/employees/{id}  (GET)
 * Update: /api/emp/employees/{id}  (PUT)
 * Delete:/api/emp/employees/{id}  (DELETE)
-------------------------------------------------------------------------------------
## Department DB (MongoDB):
 * Create: /api/dept/department  (POST)
 * Read: /api/dept/department  (GET) .  /api/dept/department/{id}  (GET)
 * Update: /api/dept/department/{id}  (PUT)
 * Delete:/api/dept/department/{id}  (DELETE)

 ## Installation locally & Run
### Prerequisites:
* Java 20 or higher.
* IDE.
* PostgreSQL database.
* MongoDB database.

### How to Run:

* Before running the Application, you should update the database config inside the [application.properties](https://github.com/Pramod082002/EmployeeManagement/blob/main/src/main/resources/application.properties) file. 
* Update the port number, username and password as per your local database config.
* Create a Database using PostgreSQL (pgadmin).
* create a Database using MongoDB (compass).

```
    server.port=8080

    spring.datasource.url=jdbc:postgresql://localhost:5432/{Your_database_name};
    spring.datasource.username={Your_username}
    spring.datasource.password={Your_Password}

    spring.data.mongodb.uri={your mongodb uri}
    spring.data.mongodb.database={your database}

```
* Open the main class and run as Java application from your IDE.




