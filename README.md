#selenium

There aremainly 4 types of waits in selenium -

1.sleep:This is very hard wait, "Thread.sleep(5000)"
2.Implict wait:it is to tell selenium to wait for certain time before it throws exception.
Implicit wait is valid for the life of the webdriver.

3.Explicite wait: Explicit wait is to tell the selenium/driver to wait certain time untill certain condition occurs before thrpwing the exception.


4.Fluent wait: Fluent wait is to tell the selenium/driver to wait maximum amount of time for certain condition.

###How to run test

Run entire test suite


      mvn clean test

To run individual feature file 

mvn clean test - cucumber.filter.tags="@tagName"

### git commands
    git init
    git add
    git commit - m "first commit"
    git push - u origin main
    git diff README.md

to get update from github to your local machine 
      git full 

Check existing branches

    git branch

Create a new branch 

    git checkout -b gha_run_test

Switch branches

     git checkout BRANCH_NAME