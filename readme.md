## Automation Practical
Test code for automation practical. The tests are run against the site mentioned in the practical document I was provided.

### Description


### Resources
I wrote the tests on Mac OS X 10.15.7. These are the versions of the resources I installed prior to writing and executing the test code:
- Java SE (v 17.0.2)
- IntelliJ IDEA (v 2021.3.2) (Community Edition)
- Google Chrome browser
- Chrome Driver Executable (for the browser version you have)
- [Selenium Chrome Driver (v 4.1.2)](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/4.1.2)
- [TestNG (v 7.5)](https://mvnrepository.com/artifact/org.testng/testng/7.5)

### Installing
Clone the repo the IntelliJ editor or git from the command line.

### Run the project
1. Open the project using the IntelliJ editor.
2. Copy the downloaded Chrome Driver Executable into the project\resources folder.
3. In the class src/test/java/base/BaseTests.java assign valid username and password values to the following and save changes:
```
this.GLOBAL_USERNAME
this.GLOBAL_PASSWORD
```
4. Right-click the project folder and select:
```
Run 'All Tests'
```