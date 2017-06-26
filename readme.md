# Shoe Store Functional Tests
some simple tests for a simple web application
## Running
clone this repo, then execute ./gradlew test to run tests with all browsers (htmlUnit, chrome, and firefox)
note: this requires that chrome and firefox executables are on your path

to execute using a single browser, run ./gradlew ${browser}Test
eg. `./gradlew htmlUnitTest`
