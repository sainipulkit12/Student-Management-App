This project is a Spring Boot application that provides a RESTful API for managing student records. The application supports basic CRUD operations and integrates with a MySQL database for data persistence.

=> Project Type:-
- CRUD operations for students
- Integration with MySQL database
- RESTful API design

=> Technologies:-
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL

=>  Prerequisites:-
- JDK 17 or later
- Maven 3.6.3 or later
- MySQL Server
- IDE

 => Clone the repository:-
  - git clone https://github.com/your-repo/Student-Management-App.git
  - cd Student-Management-App
 
   => Create Mysql database:-
    - CREATE DATABASE studentdb;
   
    =>  Update the application.properties:-
     - spring.datasource.url=jdbc:mysql://localhost:3306/student_management_db
     - spring.datasource.username=your-username
     - spring.datasource.password=your-password
     - spring.jpa.hibernate.ddl-auto=update
   
     => Build the project:-
     - mvn clean install

      -Run the project:-
     - mvn spring-boot:run




  API Endpoints:-
- GET /api/students: Retrieve all students
- GET /api/students/{id}: Retrieve a student by ID
- POST /api/students: Create a new student
- PUT /api/students/{id}: Update a student
- DELETE /api/students/{id}: Delete a student
