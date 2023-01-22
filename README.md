# Project Title - レストラン注文サービス (POS System)

#### A full-stack POS System web application using Spring Boot and Vue.
This is a Single Page Appliaction with client-side rendering.

## Features
- REST API
- User management
- Category management
- Food management
- Table management
- Discount management
- Order management
- Order Record
- Invoice

## Technology Stacks
**Backend**
  - Java 11
  - Spring Boot 2.7
  - Spring Security
  - Spring Data JPA
  - Hibernate
  - MySQL
  - Maven

**Frontend**
  - Vue 3
  - Html
  - Css 
  - JavaScript
  
  ## How to  Run

Start the backend server before the frontend client.  

**Backend**
  1. The backend server is running on [localhost:8080]().

**Frontend**
  1. Install [Node.js and npm](https://www.npmjs.com/get-npm)
  2. `cd frontend`.
  3. Run `npm install`.
  4. Run `npm run serve`
  5. The frontend client is running on [localhost:8081]().
  
Note: The frontend API url is configured in `src/com.Group3.OrderService.config` of the backend project. It is `localhost:8081/api` by default.
