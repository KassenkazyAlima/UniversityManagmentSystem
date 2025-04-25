# University Management System (UMS)

## Project Name and Description
**University Management System (UMS)** is a Spring Boot-based web application designed for managing students, courses, enrollments, and user authentication with role-based access control using JWT for security. The system provides RESTful API endpoints for CRUD operations on students, courses, and enrollments. It is designed to be used by administrative and teaching staff in a university setting to manage student records and academic courses efficiently.

## How to Run the Project

### Prerequisites:
1. **Java 17** (or higher)
2. **Maven** (for building the project)
3. **PostgreSQL** (or your preferred relational database)
4. **JWT Token** for authentication (JWT secret and expiration values configured in `application.properties`)

### Steps to run:
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/ums.git
    cd ums
    ```

2. Install dependencies:
    ```bash
    mvn clean install
    ```

3. Set up your PostgreSQL database and configure `application.properties` (or `application.yml`):
    - Update `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to your PostgreSQL database credentials.

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

5. The application will start on `http://localhost:8091`.

## Project Structure Overview

The project is organized as follows:

- **src/main/java**: Contains all the Java source code for the application.
  - **com.example.ums.config**: Configuration classes (e.g., Spring Security, JWT setup).
  - **com.example.ums.controller**: REST API controllers for handling HTTP requests.
  - **com.example.ums.model**: Domain models such as `Student`, `Course`, and `Enrollment`.
  - **com.example.ums.repository**: Repository interfaces for database access (using Spring Data JPA).
  - **com.example.ums.security**: Security-related components such as JWT token generation and authentication filters.
  - **com.example.ums.service**: Service classes for handling business logic.
  - **com.example.ums.util**: Helper classes (if any).

- **src/main/resources**: Configuration files.
  - **application.properties**: Configuration for database connection, JWT secrets, and Spring settings.

- **src/test**: Contains unit and integration tests for the application.

## Example API Endpoints

Below are some example API endpoints you can use:

1. **Create a new student**:
    ```http
    POST http://localhost:8091/api/students
    Content-Type: application/json
    Authorization: Bearer <valid JWT token>
    
    {
        "firstName": "Alima",
        "lastName": "Kassenkazy",
        "email": "alima@example.com"
    }
    ```

2. **Get all students**:
    ```http
    GET http://localhost:8091/api/students
    Authorization: Bearer <valid JWT token>
    ```

3. **Get a specific student**:
    ```http
    GET http://localhost:8091/api/students/{id}
    Authorization: Bearer <valid JWT token>
    ```

4. **Update a student's information**:
    ```http
    PUT http://localhost:8091/api/students/{id}
    Authorization: Bearer <valid JWT token>
    Content-Type: application/json
    
    {
        "firstName": "Updated Alima",
        "lastName": "Kassenkazy",
        "email": "updated.alima@example.com"
    }
    ```

5. **Delete a student**:
    ```http
    DELETE http://localhost:8091/api/students/{id}
    Authorization: Bearer <valid JWT token>
    ```

## Used Technologies

- **Spring Boot**: Framework for building the web application.
- **Spring Security**: Provides security and authentication for the application.
- **JWT**: JSON Web Tokens for authentication and authorization.
- **Spring Data JPA**: Simplifies database interaction with Hibernate and PostgreSQL.
- **PostgreSQL**: Relational database for storing data.
- **Maven**: Build automation tool.
- **H2 Database (optional)**: For testing and in-memory database.

## Build and Run Commands

1. **To build the project**:
    ```bash
    mvn clean install
    ```

2. **To run the project**:
    ```bash
    mvn spring-boot:run
    ```

3. **To run tests**:
    ```bash
    mvn test
    ```

## Contact Information

For any questions or support, please contact:
- **Email**: your-email@example.com
- **GitHub**: [https://github.com/yourusername/ums](https://github.com/yourusername/ums)

---

Feel free to update the README file with your specific details, like email, project repository link, and any additional functionality you have implemented. Let me know if you need further modifications!
