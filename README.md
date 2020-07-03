# Demo Project
This is a simple demo project for evaluating Java/Kotlin practices. 
This Project is WIP and will be extended.
The goal of this project is to create a reference project implementation for modern java/kotlin projects as 
well as playing around with frameworks/libaries or coding techniques.

## Languages
The code base will use:
- Java
- Kotlin

It is possible that a submodule would use another language, which is mentioned in its readme.

## Frameworks and Tools
As of now the code base makes use of the following tools:

Dependency Management
- Maven ([Website](https://maven.apache.org/), [Github](https://github.com/apache/maven), [License](https://github.com/apache/maven/blob/master/LICENSE))

Logging:
- SLF4J API ([Website](http://www.slf4j.org/), [Github](https://github.com/qos-ch/slf4j), [License](https://github.com/qos-ch/slf4j/blob/master/LICENSE.txt))

Unit Testing:
- JUnit 5 ([Website](https://junit.org/junit5/), [Github](https://github.com/junit-team/junit5), [License](https://github.com/junit-team/junit5/blob/main/LICENSE.md))
    - JUnit Jupiter API
    - JUnit Jupiter Engine
- Hamcrest ([Website](http://hamcrest.org/), [Github](https://github.com/hamcrest/JavaHamcrest), [License](https://github.com/hamcrest/JavaHamcrest/blob/master/LICENSE.txt))
- JaCoCo ([Website](https://www.jacoco.org/jacoco/), [Github](https://github.com/jacoco/jacoco), [License](https://www.jacoco.org/jacoco/trunk/doc/license.html))

Code Style:
- Spotless ([Github](https://github.com/diffplug/spotless), [License](https://github.com/diffplug/spotless/blob/main/LICENSE.txt))
    - Google Java Format ([Github](https://github.com/google/google-java-format), [License](https://github.com/google/google-java-format/blob/master/LICENSE))
    - KtLint ([Website](https://ktlint.github.io/), [Github](https://github.com/pinterest/ktlint), [License](https://github.com/pinterest/ktlint/blob/master/LICENSE))

## Code Coverage
As of now the preferred way to achieve 100% code coverage would be:

1. Write Unit Tests
2. Write Implementation
3. Run `mvn test`
4. Check out JaCoCo Report in `target/site/jacoco/index.html`
5. Fix coverage issues and repeat at step 3
6. Commit and push to CI where CodeCov will run against JaCoCo Report

### CodeCov
At the moment I'm using CodeCov only for evaluation purposes. Could be omitted in future, because this project should evolve as a reference project and the CodeCov is not part of my stack