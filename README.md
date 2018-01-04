## This is a sample Spring Boot gradle demo project

# Pre requesites - Make sure you have installed following
## Java 1.8 or above
## Gradle 

Clone or download the project 

Go to the project home foder and run below command

### gradlew bootRun

#### This will run the spring boot application on localhost

URL to access the application:

** http://localhost:8080/student

# Student service API
## Add Student:

URL: http://localhost:8080/student
Method: POST
Body:
{
	"id" : "1",
	"name": "name1",
	"course": "c1",
	"gender": "male"
}

## Update Student:

URL: http://localhost:8080/student
Method: PUT
Body:
{
	"id" : "1",
	"name": "name1",
	"course": "c1",
	"gender": "male"
}

## Get Student:

URL: http://localhost:8080/student/{id}
Method: Get
Body: -

## Delete Student:

URL: http://localhost:8080/student/{id}
Method: Delete
Body: -




