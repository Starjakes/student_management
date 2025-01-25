# Student Management System

This is a Spring Boot application that provides a basic student management system. It supports operations to create, read, update, and delete student records. The backend uses PostgreSQL as the database. 

## Features
- Add new students to the database.
- Retrieve all students.
- Update student details.
- Delete student records.

## Technologies Used
- **Spring Boot**
- **PostgreSQL**
- **Hibernate/JPA**
- **Maven**
- **Java**

## Project Structure
```
student-management/
├── src/
│   ├── main/
│   │   ├── java/com/flexisaf/studentmanagement/
│   │   │   ├── controller/          # Contains REST controllers
│   │   │   ├── model/               # Contains entity classes
│   │   │   ├── repository/          # Contains JPA repositories
│   │   │   ├── service/             # Contains service classes
│   │   │   └── StudentManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties  # Configuration file
│   │       ├── static                  # Static resources (e.g., CSS, JS)
│   │       └── template                # Templates (if applicable)
│   └── test/
│       └── java/com/flexisaf/studentmanagement/
└── pom.xml
```

## Prerequisites
1. Install [Java 17+](https://adoptopenjdk.net/).
2. Install [PostgreSQL](https://www.postgresql.org/).
3. Install [Maven](https://maven.apache.org/download.cgi).

## Setting Up the Project

### Step 1: Clone the Repository
```bash
git clone https://github.com/Starjakes/student_management.git
cd student_management
```

### Step 2: Configure PostgreSQL
1. Create a new database named `student_management`.
2. Update the `src/main/resources/application.properties` file with your PostgreSQL credentials:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/student_management
   spring.datasource.username=your_username
   spring.datasource.password=your_password

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
   ```

### Step 3: Run the Application
Use the following Maven command to start the application:
```bash
mvn spring-boot:run
```

### Step 4: Access the Application
- Open a browser and go to: `http://localhost:8080/api/students`.

## API Endpoints
### Base URL: `http://localhost:8080/api/students`

1. **Get All Students**
   - **URL**: `/`
   - **Method**: `GET`
   - **Response**: JSON array of all students.

2. **Add a New Student**
   - **URL**: `/`
   - **Method**: `POST`
   - **Request Body**:
     ```json
     {
       "firstName": "John",
       "lastName": "Doe",
       "email": "john.doe@example.com"
     }
     ```
   - **Response**: The created student object.

3. **Update a Student**
   - **URL**: `/{id}`
   - **Method**: `PUT`
   - **Request Body**:
     ```json
     {
       "firstName": "John",
       "lastName": "Smith",
       "email": "john.smith@example.com"
     }
     ```
   - **Response**: The updated student object.

4. **Delete a Student**
   - **URL**: `/{id}`
   - **Method**: `DELETE`
   - **Response**: Success message.

## Sample Data
You can use the following JSON to test adding new students:
```json
{
  "firstName": "Jane",
  "lastName": "Doe",
  "email": "jane.doe@example.com"
}
```

## Push to GitHub
To push the project to GitHub:
```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/Starjakes/student_management.git
git push -u origin main
```

## Contributing
Feel free to submit pull requests or open issues for improvements and bug fixes.

## License
This project is licensed under the MIT License and FlexiSaf See the LICENSE file for details.
