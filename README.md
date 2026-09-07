# E-Commerce Platform
A full-stack, production-ready e-commerce application built with Java Spring Boot for the backend and React for the frontend.

## 🚀 Features
* User Authentication & Authorization: Secure JWT-based registration, login, and role-based access control (Customer / Admin).

* Product Catalog: Product browsing, searching, category filtering, and inventory management.

* Shopping Cart & Checkout: Dynamic cart persistence, order calculation, and payment gateway integration.

* Order Management: Real-time order tracking, order history, and administrative fulfillment dashboards.

* Responsive UI: Fully mobile-friendly interface designed with React and modern CSS framework support.

## 🛠️ Tech Stack
### Backend
* Language: Java 21+

* Framework: Spring Boot, Spring Security, Spring Data JPA

* Database: PostgreSQL / MySQL

* Build Tool: Maven

### Frontend
* Library: React.js

* State Management: Redux Toolkit / Context API

* Routing: React Router

* Styling: Tailwind CSS / Bootstrap / CSS Modules

## 📂 Project Structure
```
├── backend/                  # Spring Boot REST API
│   ├── src/main/java/        # Application source code
│   ├── src/main/resources/   # Application properties & SQL scripts
│   └── pom.xml               # Maven configuration
├── frontend/                 # React SPA
│   ├── src/components/       # UI components
│   ├── src/pages/            # View pages
│   ├── src/services/         # API integration services
│   └── package.json          # Node dependencies
└── README.md
```

## ⚙️ Prerequisites
Ensure you have the following installed locally:

* Java Development Kit (JDK): 21 or higher

* Node.js: 18.x or higher

* Database: PostgreSQL or MySQL server running locally or via Docker

## 🚀 Getting Started
1. Clone the Repository
```
git clone https://github.com/AkashKannapiran/spring-react-ecommerce.git
cd spring-react-ecommerce
```

2. Backend Setup (Spring Boot)
```
cd backend

# Configure your database credentials in src/main/resources/application.properties
# Run the application
./mvnw spring-boot:run
```
The backend API will start at ```http://localhost:8080```


3. Frontend Setup (React)
```
cd ../frontend

# Install dependencies
npm install

# Start development server
npm start
```
The frontend UI will start at ```http://localhost:3000```

## 📡 API Endpoints
| Method | Endpoint |	Description |	Access |
| ------ | -------- | ----------- | ------ |
| ```POST```	| ```/api/v1/auth/register``` |	Register new user |	Public |
| ```POST```	| ```/api/v1/auth/login```	| Authenticate & get JWT	| Public |
| ```GET``` |	```/api/v1/products```	| Get product catalog |	Public |
| ```POST```	| ```/api/v1/orders``` | Place a new order |	Authenticated |
| ```POST``` |	```/api/v1/admin/products``` |	Add new product |	Admin |
