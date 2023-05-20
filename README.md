#selenium

There aremainly 4 types of waits in selenium -

1.sleep:This is very hard wait, "Thread.sleep(5000)"
2.Implict wait:it is to tell selenium to wait for certain time before it throws exception.
Implicit wait is valid for the life of the webdriver.

3.Explicite wait: Explicit wait is to tell the selenium/driver to wait certain time untill certain condition occurs before thrpwing the exception.


4.Fluent wait: Fluent wait is to tell the selenium/driver to wait maximum amount of time for certain condition.

###How to run test

Run entire test suite


     `  mvn clean test`