# Atos OPTICA Code Exercise

## Intro
This project contains a simple REST API built on Spring Boot that has been forked from [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/).

We require a simple HTTP based RESTful API that provides 3 operations for managing customers. These Operations are:

* Operation 1: Add a Customer
    POST Method Endpoint - http://localhost:8080/api/customers
    Body as Json
    ```
     {
        "Id": "A123456",
        "Firstname": "Bill",
        "Surname": "Gates"
        }
    ```
* Operation 2: Remove a Customer, given their ID
    REMOVE Method Endpoint - http://localhost:8080/api/customers/A12345
    Submit id as pathparam

* Operation 3: List all Customers
Where a Customer has the following attributes:
• Id
• Firstname
• Surname
GET Method Endpoint - http://localhost:8080/api/customers

Response - Below data is coming from List collection from code.
```
  {
    "customers": [
        {
            "Id": "A12345",
            "Firstname": "Satish",
            "Surname": "Yeruva"
        },
        {
            "Id": "183fe6b3-0178-4561-b034-30371bddfeda",
            "Firstname": "Steve",
            "Surname": "Jobs"
        },
        {
            "Id": "6d8db806-cf4a-400e-ab8c-50eccdd5f219",
            "Firstname": "James",
            "Surname": "Gosling"
        },
        {
            "Id": "15034faa-1635-4a3d-a8e1-78db9c3cfecf",
            "Firstname": "Martin",
            "Surname": "Fowler"
        }
    ]
}
    ```
## Requirements

The API and its Operations should:
    * Use JSON for data transfer
    * Adhere to REST principles
    * Be written using Java
    * Be committed to a publicly available SCM
    * Be runnable/testable on a Windows or Mac laptop with JDK 8 and Maven 3 installed (e.g. via maven commands or similar)
    * Have automated tests for each operation
There is no need to persist the data (i.e. no need to use a database)


## To Build and Run

    * mvn clean install or mvn spring-boot:run
    * Goto target folder run - java -jar <filename>.jar 

## Testing 
    * Run CustomerApplicationTests from test folder 
    * Run Postman collection script from project root folder 

## Exercise
This repository contains a class called `CustomerController` in the `controller` package.

You must clone this repository, implement the `api/customers/` and 'api/cusotmers/{id}' endpoint inside the `CustomerController`, and commit your code.

The endpoint must take a id as a parameter and return a response of the form:
```
{
    "Id": "{id}",
    "Firstname": "firstName",
    "Surname": "lastName"
}
```

eg.
`/customers/A12345` should return:
```
{
    "Id": "bzzubu",
    "Firstname": "Satish",
    "Surname": "Yeruva"
}
```
