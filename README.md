## Overview 

Test Automation Framework written in Java using Selenium, JUnit5 and Allure as a reporting tool

## Resources

Source Code : https://github.com/alaktionov/hazelcast-test-automation-java

## How to run automated test

 * Clone the project from Github to your local machine
 * Open the project in your IDE (e.g. Intellij IDEA)
 * Make sure all dependencies are properly downloaded
 * Make sure your Chrome browser has the latest version: **Version 94.0.4606.81**
 * Open terminal at your project directory and run the following maven command which will execute all tests in Chrome driver:
     ```mvn clean test -P chrome```
     OR 
     ```mvn clean test``` (since chrome profile is activated by default)
 * Open generated Allure report and see details of execution

## Notes

 * Used libraries: Java 11, Selenium, JUnit5, Allure
 * Tests can be run only in Chrome driver at the moment, i.e. using a command ```mvn clean test -P firefox``` will return IllegalArgumentException 