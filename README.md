# Student Management System (Spring Boot)

A backend REST API built using Spring Boot and MySQL to manage student records.  
This project demonstrates core backend concepts like REST APIs, JPA, and database integration.

## Features
- Add a student
- View all students
- View student by ID
- Delete a student

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /students | Add a new student |
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| DELETE | /students/{id} | Delete a student |

## Sample Request

POST `/students`

