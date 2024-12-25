# API testing for FanCode Users using JASONPlaceholder API

## **Project Overview**
This project validates that all users in the "FanCode" city have completed more than 50% of their todo tasks using the JSONPlaceholder API. Considering Fancode City can be identified by lat between ( -40 to 5) and long between ( 5 to 100) in users api. The solution uses Java, Junit, RestAssured, Maven and a JSON parsing library to interact with the APIs and validate the logic.

## **Setup Instructions**
1. Clone the repository:
   ```
   git clone <repository-url>
   cd <repository-name>
   ```
2. Install dependencies:
   ```
   mvn clean install
   ```
3. Run the tests:
   ```
   mvn test
   ```
## **Key Components**

#### API Clients:
  - BaseApi: Initializes the base URL for all API endpoints, ensuring the setup is not repeated in derived classes.
  - UserApi: Fetches user data and filters FanCode users.
  - TodoApi: Fetches todos and computes completion percentages.

#### Utils: 
  - Config: Store all the api source url and endpoints 

#### Test:
  - FanCodeUserTest: Contains the test to validate task completion for FanCode users. i.e. All users in FanCode city have completed more than 50% of their todo tasks.


