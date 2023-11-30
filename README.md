# Spring Quiz App

Spring Quiz App is a Java-based web application built using the Spring Framework. This app allows users to access various APIs for managing quiz questions, creating quizzes, and calculating quiz results. It leverages Lombok, annotations configuration, Postman, and a MySQL database to provide a seamless quiz-taking experience.

## Features

- Retrieve all quiz questions.
- Create a new quiz question.
- Generate quizzes based on question categories.
- Calculate quiz results based on user-selected answers.

## Technologies Used

- Spring Boot
- Lombok
- MySQL
- Postman

## Project Structure

spring-quiz-app/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com.example.quizapp/
│ │ │ │ ├── controller/ # Controllers for handling HTTP requests
│ │ │ │ ├── model/ # Entity classes representing database tables
│ │ │ │ ├── repository/ # Spring Data JPA repositories
│ │ │ │ ├── service/ # Business logic and services
│ │ │ │ ├── QuizAppApplication.java # Main application class
│ │ │ │
│ │ │ └── resources/
│ │ │ ├── application.properties # Database and Spring configuration
│ │ │ └── import.sql # Initial SQL script for data seeding
│ │ │
│ │ └── resources/
│ │ └── static/ # Static resources (e.g., CSS, JavaScript)
│ │ └── templates/ # Thymeleaf templates for HTML rendering
│ │
│ └── test/ # Unit and integration tests
│
├── .gitignore # Specifies files and directories to be ignored by Git
├── README.md # Project documentation (you are here)
└── pom.xml # Maven project configuration



## Setup

1. **Database Configuration**:
   - Create a MySQL database and configure the connection details in `application.properties`.
   - The initial SQL script (`import.sql`) will seed the database with sample data.

2. **Build and Run**:
   - Build the project using Maven: `mvn clean install`.
   - Run the application: `mvn spring-boot:run` or execute the JAR file generated.

3. **Access APIs**:
   - Use a tool like Postman to interact with the following APIs:
     - `GET /questions`: Retrieve all quiz questions.
     - `POST /questions`: Create a new quiz question.
     - `POST /quizzes`: Create a quiz based on the question category.
     - `POST /results`: Calculate the result based on user-selected answers.

## Usage

1. **Retrieve All Questions**:
   - Use the `GET /questions` API to retrieve all quiz questions.

2. **Create a New Question**:
   - Use the `POST /questions` API to create a new quiz question.

3. **Generate Quiz**:
   - Use the `POST /quizzes` API to create a quiz based on the question category.

4. **Calculate Quiz Result**:
   - Use the `POST /results` API to calculate the result based on user-selected answers.

## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the project on GitHub.
2. Create a new branch with a descriptive name: `git checkout -b feature/new-feature` or `git checkout -b bug/fixing-bug`.
3. Make your changes and commit them: `git commit -m "Description of your changes"`.
4. Push your changes to your fork: `git push origin feature/new-feature`.
5. Create a pull request on the original repository.

Please ensure your code adheres to the project's coding standards and includes appropriate documentation.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
