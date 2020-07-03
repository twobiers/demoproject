# Demo Project
This is a simple demo project for evaluating Java/Kotlin practices. 
This Project is WIP and will be extended.
The goal of this project is to create a reference project implementation for modern java/kotlin projects as 
well as playing around with frameworks/libaries or coding techniques.

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