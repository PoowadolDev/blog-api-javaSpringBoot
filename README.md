
# Blog API Project in Java Spring Boot

## Overview
This project is created to help me understand how to write function and class in Java. It also aims to explore the development of MVC concept in Spring Boot.

## Features
- Get All: Retrieve all blog posts.
- Get By ID: Retrieve a blog post by its ID.
- Post: Create a new blog post.
- PUT: Update an existing blog post.
- Delete: Remove a blog post.

# Project Setup

## Installation

1. Clone the repository:
```bash
git clone https://github.com/PoowadolDev/blog-api-javaSpringBoot.git
```

2. Navigate to the project directory:
```bash
cd blog-api-javaSpringBoot/blog
```

3. Install the dependencies:
```bash
mvn clean install
```

## Running the Project
To run the project, use the following command:
```bash
mvn spring-boot:run
```
## Endpoints

- ### Get All Posts

```
  GET /api/blogs
```

- ### Get Post By ID:

```
  GET /api/blogs/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of blog post to fetch |

- ### Create New Post:
```
  POST /api/blogs
```

#### Request Body
```json
{
    "id" : 1
    "title": "Post Title",
    "content": "Post Content"
}
```

- ### Update Existing Post:

```
  PUT /api/blogs/{id}
```
#### Request Body
```
{
    "title": "Updated Title",
    "content": "Updated Content"
}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of blog post to update |

- ### Delete Post:
```
DELETE /api/blogs/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of blog post to delete |

# Architecture

The project follows the MVC Concept to separate concerns and make the code more maintainable and testable. The structure is as follows:

```bash
. . . 
blog-api-javaSpringBoot
│   README.md
│   pom.xml
└───src
    └───main
        ├───java
        │   └───com
        │       └───myapp
        │           ├───BlogApplication.java
        │           ├───controllers
        │           │   └───BlogController.java
        │           ├───entities
        │           │   └───Blog.java
        │           ├───repositories
        │           │   └───BlogRepository.java
        │           └───services
        │               ├───BlogService.java
        │               └───BlogServiceImpl.java
        └───resources
            ├───application.properties
            └───data.sql

. . .
```

### Description of Folders

- **src/main/java/com/myapp:** Main package for the application.
  - **controllers:** Contains REST controllers for handling HTTP requests and responses.
    - **BlogController.java:** Manages CRUD operations for blogs.
  - **entities:** Defines the core domain entities.
    - **Blog.java:** Represents the blog entity with fields such as id, title, and content.
  - **repositories:** Implements the data access layer using Spring Data JPA.
    - **BlogRepository.java:** Interface for CRUD operations on Blog entities.
  - **services:** Contains business logic and service implementations.
    - **BlogService.java:** Interface defining the service layer for blogs.
    - **BlogServiceImpl.java:** Implements the business logic for blog operations.

- **src/main/resources:** Contains application configuration and resource files.
  - **application.properties:** Configuration for the Spring Boot application.
  - **data.sql:** Initial data setup for the in-memory H2 database.

### Key Concepts
- **Domain Layer (entities):** Contains the core logic and domain entities. This layer is responsible for representing the business data and rules.
- **Application Layer (services):** Manages use cases and application flow through interfaces. This layer orchestrates the business logic and interactions between the domain and infrastructure layers.
- **Infrastructure Layer (repositories, controllers):** Handles communication with external systems (e.g., database, web server). This layer is responsible for data persistence and REST API endpoints.
