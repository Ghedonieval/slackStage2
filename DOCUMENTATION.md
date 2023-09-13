# DOCUMENTATION

Welcome to the documentation for the Simple REST API for CRUD Operations on the "Person" Resource. This API allows you to perform CRUD operations on person records and provides dynamic parameter handling for actions like adding or retrieving a person by name. Below, you will find detailed information about the available endpoints, request/response formats, and usage examples.

# Table of Contents Endpoints

1. Create a Person
   * Retrieve a Person by ID
   * Retrieve a Person by Name
   * Update a Person by ID
   * Delete a Person by ID
2. Request and Response Formats

3. Getting Started

# Endpoints
1. Create a Person
   * Endpoint: POST /api
   * Description: Create a new person record.
   * Request Body: JSON representation of a person object.
   
   
Example Request:

    POST /api
    Content-Type: application/json

        {
        "name": "John Doe"
        }

Example Response:

        {
            "id": 1,
            "name": "John Doe"
        }

2. Retrieve a Person by ID
   * Endpoint: GET /api/{id}
   * Description: Retrieve a person's information by their unique ID.
   
Example Request:

    GET /api/1

Example Response:

        {
            "id": 1,
            "name": "John Doe"
        }

3. Retrieve a Person by Name
   * Endpoint: GET /api/name?name={name}
   * Description: Retrieve a person's information by their name.
   
Example Request:

    GET /api/name?name=John Doe

Example Response:

        {
            "id": 1,
            "name": "John Doe"
        }

4. Update a Person by ID
   * Endpoint: PUT /api{id}
   * Description: Update a person's information by their unique ID.
   * Request Body: JSON representation of the updated person object.
   
Example Request:

    PUT /api/1
    Content-Type: application/json

        {
            "name": "Updated Name"
        }

Example Response:

        {
            "id": 1,
            "name": "Updated Name"
        }

5. Update a Person by Name
    * Endpoint: PUT /api/name?name={name}
    * Description: Update a person's information by their name.
    * Request Body: JSON representation of the updated person object.

Example Request:

    PUT /api/name?name= john doe
    Content-Type: application/json

        {
            "name": "Updated Name"
        }

Example Response:

        {
            "id": 1,
            "name": "Updated Name",
        }

5. Delete a Person by ID
   * Endpoint: DELETE /api/{id}
   * Description: Delete a person's record by their unique ID.
   
Example Request:

    DELETE /api/1

Example Response:

    {
        "message": "ID 1, DELETED SUCCESSFULLY"
    }

6. Delete a Person by ID
    * Endpoint: DELETE /api/name?name={name}
    * Description: Delete a person's record by their name.

Example Request:

    DELETE /api/name?name=john doe

Example Response:

    {
        "message": "JOHN DOE DELETED SUCCESSFULLY"
    }


# Request and Response Formats
* Request Body Format: All endpoints that accept a request body expect JSON format.

* Response Format: All responses are in JSON format.

# Getting Started
To use this API, follow the Getting Started section in the main README.md file. This will guide you through setting up and running the API on your local machine.

For further information on contributing, licensing, or any other project-related details, please refer to the main README.md file.

Note: Replace {id} and {name} in the endpoint URLs with the actual ID and name values you want to use when making requests to the API.




