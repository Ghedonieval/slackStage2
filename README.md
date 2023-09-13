# SlackStage2(Simple REST API for CRUD Operations on "Person" Resource)

This is a simple REST API project that allows you to perform CRUD (Create, Read, Update, Delete) operations on a "person" resource. The API also provides dynamic parameter handling, allowing you to add or retrieve a person by name. This project uses a database(PostgreSQL) to store and manage the person records.

# Technologies Used
* Programming Language: Java
* Database: PostgreSQL
* Web Framework:  Spring Boot 

# API Endpoints
The API should provide the following endpoints for managing "person" records:

1.Create a Person

* Endpoint: POST /api

* Description: Create a new person record.

* Request Body: JSON representation of a person object

  * Example:

              {

                  "name": "Mark Essien",

                  "age": 30

              }

2)Retrieve all Persons
* Endpoint: GET /api
* Description: Retrieve a person's information by their unique ID.

3)Retrieve a Person by ID
* Endpoint: GET /api/{user_id}
* Description: Retrieve a person's information by their unique ID.

4)Retrieve a Person by Name
* Endpoint: GET /api/name?name={name}
* Description: Retrieve a person's information by their name.
