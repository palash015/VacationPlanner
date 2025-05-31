# 🌴 Vacation Planner

**Vacation Planner** is a web-based calendar application built with **Spring Boot** and **Thymeleaf**. 
It displays public holidays for selected countries (like India or the US) on a full-screen, interactive calendar interface powered by **FullCalendar.js**.

Users can switch between **monthly** and **quarterly** views. Each week is visually marked with color codes based on the number of holidays:
- 🟢 Light Green: 1 holiday in the week
- 🟢 Dark Green: 2 or more holidays in the week

This project demonstrates an integration of backend business logic (holiday processing and week-based aggregation) with a dynamic, user-friendly frontend calendar view.

---

## 🧰 Technologies & Libraries Used

### 🔧 Backend
- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **Thymeleaf** (template engine)
- **MySQL** (switchable persistence layer)

### 🎨 Frontend
- **FullCalendar.js** (calendar rendering)
- **Bootstrap** (for styling dropdowns and layout)
- **JavaScript** (for dynamic calendar updates and API calls)

---

## 🛠️ Setup Instructions

### 1. Clone the Repository

```bash
git clone repository
cd vacation-planner
setup your local sql
enter credentials of sql in property file
launch application
