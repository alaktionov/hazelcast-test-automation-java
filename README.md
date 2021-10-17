## Overview 

Test Automation Framework written in Java using Selenium, JUnit5 and Allure as a reporting tool

## Resources

Source Code : https://github.com/alaktionov/hazelcast-test-automation-java

## How to run automated test

 * Clone the project from Github to your local machine
 * Open the project in your IDE (e.g. Intellij IDEA)
 * Make sure all dependencies are properly downloaded
 * Make sure your Chrome browser has the latest version: **Version 94.0.4606.81**
 * Run tests in one of the following ways:
    * Run CreateClusterTest.java via IDE interface
    * Make sure all tests passed
    * Open allure-results folder and open the latest report
    
    OR
    
    * Open terminal at your project directory and run the following maven command which will execute all tests in Chrome driver:
        ```mvn clean test -P chrome allure:serve```
        OR 
        ```mvn clean test allure:serve``` (since chrome profile is activated by default)
    * Make sure all tests passed
    * Make sure Allure report is generated and opened in the browser
    * Press <Ctrl+C> to close Allure report

## Notes

 * Used libraries: Java 11, Selenium, JUnit5, Allure
 * Directory **main** contains all code related to the framework functionality
 * Directory **test** contains all code related to the tests implementation
 * Tests can be run only in Chrome driver at the moment, i.e. using a command ```mvn clean test -P firefox``` will return IllegalArgumentException 