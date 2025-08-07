# Employee Management API

A simple Spring Boot REST API for managing employees with CRUD operations and file upload support.

## Features

- Create, Read, Update, Delete employees
- Upload employee files (e.g., resumes, images) using multipart/form-data
- Store file data as BLOB in database
- Exception handling for resources not found
- Cross-origin support (CORS enabled for all origins)

## Technologies

- Java 17+
- Spring Boot 3+
- Spring Data JPA (Hibernate)
- MySQL (or any relational DB)
- Lombok (optional)
- Maven
- JUnit 5 + Mockito (for testing)

## Getting Started

### Prerequisites

- Java JDK 17 or above installed
- MySQL database (or any other supported RDBMS)
- Maven installed
- Optional: Postman or curl for testing API

### Setup

1. Clone the repo

   ```bash
   git clone https://github.com/yourusername/employee-management-api.git
   cd employee-management-api
| Method | Endpoint                             | Description                      | Request Body        |
| ------ | ------------------------------------ | -------------------------------- | ------------------- |
| GET    | `/api/v1/employees`                  | Get all employees                | None                |
| POST   | `/api/v1/employees`                  | Create employee (JSON only)      | JSON (no file)      |
| POST   | `/api/v1/employees/upload-with-file` | Create employee with file upload | Multipart form-data |
| GET    | `/api/v1/employees/{id}`             | Get employee by ID               | None                |
| PUT    | `/api/v1/employees/{id}`             | Update employee by ID            | JSON                |
| DELETE | `/api/v1/employees/{id}`             | Delete employee by ID            | None                |
