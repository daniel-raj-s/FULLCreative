# FULL Creative

# Selenium Test Automation Project

This project demonstrates a simple test automation framework using Java, Selenium, and TestNG. It provides a foundation for writing and executing automated tests for web applications.

## Prerequisites

- Java JDK 11 or later
- Maven
- Chrome Browser (for running tests with ChromeDriver)

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/daniel-raj-s/FULLCreative.git
   ```

2. Navigate to the project directory:
   ```
   cd FULLCreative
   ```

3. Install project dependencies using Maven:
   ```
   mvn clean install
   ```

## Running Tests

Execute test cases using Maven:

- Run all tests:
  ```
  mvn test
  ```

- Run tests from a specific package or class:
  ```
  mvn test -Dtest=packageName.TestClassName
  ```

- Run tests using a TestNG XML suite file:
  ```
  mvn test -DsuiteXmlFile=testng.xml
  ```

## Project Structure

- `src/test/java`: Contains test scripts.
- `testng.xml`:  TestNG XML suite file.

## TestNG Configuration

- TestNG configurations are specified in `testng.xml`.

## Notes

- This project uses WebDriverManager for driver management. No need to download browser drivers manually.
- Tests are configured to run in Google Chrome by default. You can modify the browser configuration in the test scripts.
