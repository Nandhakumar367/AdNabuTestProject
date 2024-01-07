# AdNabuTestProject
**AdNabuTestStore Automation Test Suite**

This repository contains automated test cases designed to ensure the quality and functionality of the AdNabuTestStore web application, an online e-commerce platform.

GitHub Repository: https://github.com/Nandhakumar367/AdNabuTestProject
## Key Features:

1. Comprehensive test coverage: Tests encompass essential user interactions, including product search, filtering, cart management, checkout, and more.
2. Clear test organization: Tests are structured logically using a Page Object Model (POM) for maintainability and readability.
3. Detailed reporting: Employs ExtentReports to generate comprehensive test reports with clear pass/fail results and detailed logs.
## Technologies and Tools:

Programming Language: Selenium WebDriver (using Java)
Testing Framework: TestNG
Reporting Tool: ExtentReports
Build Tool: Maven
Version Control System: Git

**Prerequisites**
Ensure you have the following prerequisites installed:
Selenium -3.141.59
Java version - 17.0.2,
Maven version - apache-maven-3.9.5,
TestNG - 7.4.0
Web browser (Chrome, Firefox) with corresponding WebDriver

**Setup**
Install the JDK, Maven, and the required WebDriver.
Configure the WebDriver path in your system environment variables.

**Configure test settings:**
Under resources folder update **Config.properties** file  with the desired browser and Adnabu URL
Under src/Main/java - Basepage class - Replace the Config.properties file path as per the location.
Under src/Main/java - WebDriverInstance class - Replace the Chrome and Firefox driver path as per the location.

**src/test/java: Contains test scripts organized by modules or functionalities.**
**Run this Two classes test scenarios and test cases**
Test 1 - AddRemoveItemTestcase
Test 2 - TestStoreSearchProduct
To run as TestNg Suite 
Run testng.xml which contains both classes.

Reporting
Test results are generated in HTML format and can be found in the report directory. Open the index.html file in your browser for detailed test execution reports.
Access generated ExtentReports at /AdNabuTestProject/report

**TestNG report:**
Open the index.html file in your browser for detailed test execution reports.
AdNabuTestProject/test-output/index.html
file:///Users/nandhakumar/Desktop/Resources/Automation_Workspace/AdNabuTestProject/test-output/index.html#

**Extent Report Sample link:**
**Test 1 -AddRemoveItemTestcase**
file:///Users/nandhakumar/Desktop/Resources/Automation_Workspace/AdNabuTestProject/report/AdNabu%20Test%20Project_2024-01-07_19-09-28.html
**Screenshot for Reference:**
https://github.com/Nandhakumar367/AdNabuTestProject/assets/54478189/3ad4f65b-71c3-465d-b712-188100f62432

**Test 1(Fail case)** - AddRemoveItemTestcase (By editing the Pendent item Element)
file:///Users/nandhakumar/Desktop/Resources/Automation_Workspace/AdNabuTestProject/report/AdNabu%20Test%20Project_2024-01-07_19-26-06.html
**Screenshot for Reference:**
https://github.com/Nandhakumar367/AdNabuTestProject/assets/54478189/f7f7c5d6-a592-4878-88e8-c28d6b24abe4

**Test 2 - TestStoreSearchProduct**
file:///Users/nandhakumar/Desktop/Resources/Automation_Workspace/AdNabuTestProject/report/AdNabu%20Test%20Project_2024-01-07_19-20-46.html
**Screenshot for Reference:**
https://github.com/Nandhakumar367/AdNabuTestProject/assets/54478189/15877792-6780-492a-a953-9eabf302e77f
