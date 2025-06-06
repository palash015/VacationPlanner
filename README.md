# 🌴 Vacation Planner

**Vacation Planner** is a web-based calendar application built to plan your vacation better by highlighting holiday week.
Each week is visually marked with color codes based on the number of holidays:
- 🟢 Light Green: 1 holiday in the week
- 🟢 Dark Green: 2 or more holidays in the week

It supports public holidays for multiple countries (like India or the US) on a full-screen.

Users can switch between **monthly** and **quarterly** views.
Web-based calendar application is built with **Spring Boot** and **Thymeleaf** and interactive calendar interface powered by **FullCalendar.js**.

---

## 🖼️ Application Screenshot


![Vacation Planner UI](https://github.com/palash015/VacationPlanner/tree/master/src/main/resources/Screenshot)

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
