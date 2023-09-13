# SlackStage2(Simple REST API for CRUD Operations on "Person" Resource)

This is a simple REST API project that allows you to perform CRUD (Create, Read, Update, Delete) operations on a "person" resource. The API also provides dynamic parameter handling, allowing you to add or retrieve a person by name. This project uses a database(PostgreSQL) to store and manage the person records.

# Technologies Used
* Programming Language: Java
* Database: PostgreSQL
* Web Framework:  Spring Boot 

# API Endpoints
The API should provide the following endpoints for managing "person" records:

1. Create a Person
   * Endpoint: POST /api

   * Description: Create a new person record.

   * Request Body: JSON representation of a person object

     * Example:

                 {

                     "name": "Mark Essien"

                 }

2. Retrieve all Persons
   * Endpoint: GET /api
   * Description: Retrieve a person's information by their unique ID.


3. Retrieve a Person by ID
   * Endpoint: GET /api/{user_id}
   * Description: Retrieve a person's information by their unique ID.


4. Retrieve a Person by Name
   * Endpoint: GET /api/name?name={name}
   * Description: Retrieve a person's information by their name.


5. Update a Person by ID
   * Endpoint: PUT /api/{id}
   * Description: Update a person's information by their unique ID.
   * Request Body: JSON representation of the updated person object.


6. Update a Person by Name
   * Endpoint: PUT /api/name?name={name}
   * Description: Update a person's information by their name.
   * Request Body: JSON representation of the updated person object.


7. Delete a Person by ID
   * Endpoint: DELETE /api/{id}
   * Description: Delete a person's record by their unique ID.


8. Delete a Person by Name
   * Endpoint: DELETE /api/name?name={name}
   * Description: Delete a person's record by their unique ID.


# Getting Started
To set up and run this API on your local machine, follow these general steps:

1. Clone this repository.

2. Install the necessary dependencies for your chosen programming language and web framework.

3. Configure the database connection settings in your API code.

4. Create the database and tables (if using SQL-based database).

5. Implement the API endpoints as per the defined specifications.

6. Run the API server.

# Usage
You can interact with the API using tools like Postman or by making HTTP requests from your application.

Example API request to create a person:

POST /api

              {
                  "name": "Alice Smith"
              }

# Contribution
Contributions to this project are welcome. You can contribute by improving the existing code, adding new features, or fixing issues.
