# API testing for FanCode City Users

## **Project Overview**
This project validates that all users in the "FanCode" city have completed more than 50% of their todo tasks using the JSONPlaceholder API. Considering Fancode City can be identified by lat between ( -40 to 5) and long between ( 5 to 100) in users api. The solution uses Java, Junit, RestAssured, Maven and a JSON parsing library to interact with the APIs and validate the logic.

## **Setup Instructions**
1. Clone the repository:
   ```
   git clone https://github.com/00mayank/Api-testing.git
   cd FanCodeApi
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
  - BaseApi: Initializes the base URL for all API endpoints, ensuring the setup is not repeated in derived classes also throws error if the response does not match the expected status code.
  - UserApi: Fetches user data and filters FanCode users on the basis of lat between ( -40 to 5) and long between ( 5 to 100) in users api.
  - TodoApi: Fetches todos and computes completion percentages of task by user fo FanCode city.

#### Utils: 
  - Config: Store all source url and endpoints required for API calling. 

#### Test:
  - FanCodeUserTest: Contains the test to validate task completion for FanCode users. i.e. All users in FanCode city have completed more than 50% of their todo tasks.


