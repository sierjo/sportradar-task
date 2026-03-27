# 🏆 Sports Event Calendar

### Backend Developer Test Task (Sportradar)

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.5.13-green?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven" />
  <br/>
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5" />
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3" />
  <img src="https://img.shields.io/badge/JavaScript-ES6-F7DF1E?style=for-the-badge&logo=javascript" />
</p>

---

## 📌 About the Project

This application is a lightweight sports event management system designed to demonstrate:

* backend architecture design
* relational database modeling
* REST API development
* simple frontend integration

It allows users to view and create sports events, with data stored in a structured MySQL database.

---

## 📁 Project Layout

sportradar-task/
│
├── src/
│   ├── main/
│   │   ├── java/com/sportradar_task/
│   │   │   ├── controller/
│   │   │   │   └──EventController
│   │   │   ├── entity/
│   │   │   │   ├── Competition
│   │   │   │   ├── Event
│   │   │   │   ├── Stage
│   │   │   │   └── Team
│   │   │   ├── repository/
│   │   │   │   ├── CompetitionRepository
│   │   │   │   ├── EventRepository
│   │   │   │   ├── StageRepository
│   │   │   │   └── TeamRepository
│   │   │   ├── service/
│   │   │   │   └── EventService
│   │   │   └── SportradarTaskApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css
│   │       │   │  └── style
│   │       │   └── js
│   │       │   │   └── app
│   │       │   └── templates
│   │       │       └── index
│   │       └── application.properties
│   │
│   └── test/
│       └── java/com/sportradar_task/
│
├── pom.xml
├── README.md
└── .gitignore

—-
## ⚙️ Tech Stack

Backend

* Java 21
* Spring Boot (REST API)
* Spring Data JPA (Hibernate)

Database

* MySQL

Frontend

* HTML + CSS + JavaScript

---

## 🧠 System Design

### Backend Layers

The application follows a classic layered architecture:

* Controller → handles HTTP requests
* Service → contains business logic
* Repository → communicates with database
* Entity → represents database tables

---

### Database Model

The schema includes:

* Event
* Team
* Sport
* Competition

---

## 🚀 Getting Started

### 1. Clone the repository

git clone https://github.com/sierjo/sportradar-task.git
cd sportradar-task

---

### 2. Configure database

Edit the file:

src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

---

### 3. Run the application

mvn spring-boot:run

---

## 🌐 Usage

### Open in browser:

http://localhost:8080

---

### Available API

| Method | Endpoint           | Description      |
| ------ | ------------------ |------------------|
| GET    | /api/events      | Get all events   |
| GET    | /api/events/{id} | Get event by Id  |
| POST   | /api/events      | Create new event |

---

## 🖥 Frontend Overview

The UI is intentionally minimal and focuses on functionality:

* Displays list of events
* Shows key event data (date, time, teams, status)
* Includes form to add new events
* Basic navigation layout