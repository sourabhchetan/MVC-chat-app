# 🚀 AI-Powered Java MVC Chat App

## 📌 Overview
This is a **Java MVC Chat Application** integrated with **AI-powered features** such as:
- ✈️ AI Travel Guide (Smart trip planning & hotel recommendations)
- 🎙️ AI Voice Assistant (Voice-controlled chat & automation)
- 📚 AI Learning Tutor (Personalized learning & quizzes)
- 🎵 AI Music Generator (Mood-based music recommendations)
- 📄 AI Resume & Cover Letter Builder (Instant job applications)
- ⚖️ AI Virtual Lawyer (Legal document analysis & advice)
- 💕 AI Relationship Coach (Dating tips & conversation assistance)
- 😴 AI Dream Analyzer (Interpret dreams & psychological insights)
- 🌐 AI Virtual Reality Chat (Metaverse-based AI interactions)

## 📂 Project Structure
```
MVCChatApp/
├── src/
│   ├── controller/   # Java Controllers (Backend API)
│   ├── model/        # MongoDB Models
│   ├── repository/   # Database Repositories
│   ├── service/      # Business Logic Services
├── static/
│   ├── css/          # Frontend Styling
│   ├── js/           # Frontend Scripts
├── framework/        # Spring Boot Application Configuration
├── pom.xml           # Maven Dependencies
└── README.md         # Project Documentation
```

## 🔧 Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Maven**
- **Spring Boot**
- **MongoDB** (Local or Atlas Cloud Database)

## 🚀 How to Set Up and Run the Project

### 1️⃣ Clone or Extract the ZIP
```sh
unzip MVCChatApp.zip
cd MVCChatApp
```

### 2️⃣ Start MongoDB
If running locally:
```sh
mongod --dbpath /data/db
```
Or use MongoDB Atlas and update `application.properties`:
```properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@your-cluster.mongodb.net/chatapp
```

### 3️⃣ Build and Run the App
```sh
mvn spring-boot:run
```

### 4️⃣ Access the Web App
- **Home Page** → [http://localhost:8080](http://localhost:8080)
- **Travel Guide** → [http://localhost:8080/travel](http://localhost:8080/travel)
- **Voice Assistant** → [http://localhost:8080/voice](http://localhost:8080/voice)
- **Learning Tutor** → [http://localhost:8080/learning](http://localhost:8080/learning)

## 🔥 API Endpoints (Use Postman or CURL)

### 1️⃣ AI Travel Guide
**Request:** (POST)
```sh
curl -X POST http://localhost:8080/travel/plan -H "Content-Type: application/json" -d '{"destination": "Paris"}'
```
**Response:**
```json
{
    "destination": "Paris",
    "placesToVisit": "Eiffel Tower, Louvre Museum",
    "hotels": "Best Western Paris",
    "budget": "$1000"
}
```

### 2️⃣ AI Resume Generator
**Request:** (POST)
```sh
curl -X POST http://localhost:8080/resume/generate -H "Content-Type: application/json" -d '{"jobTitle": "Software Engineer"}'
```
**Response:**
```json
{
    "resume": "AI-generated resume for Software Engineer"
}
```

## 📌 Deployment Options
- **Heroku** (`git push heroku main`)
- **AWS EC2** (`sudo systemctl start chatapp`)
- **Google Cloud App Engine** (`gcloud app deploy`)

## 📞 Need Help?
Feel free to contact **Sourabh Chetan** for any modifications or improvements. 🚀🔥
