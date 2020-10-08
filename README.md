Web service for selecting clothing for a specific city.

About

The service implements 2 endpoints
1. Save information about the temperature range with the appropriate selection of clothing.
2. Getting information about the proposed set of items for a specific city.

Tools/libraries

The app uses next libraries: httpcomponents, jsonpath, jsonpath, flywaydb, lombok. Frameworks: spring Boot, spring security, spring mvc, spring data, hibernate, thymeleaf. For getting weather - API openweathermap.org. Database - postgresql.

Installation guideline (for windows)

-to install the application, you need to download it from a remote repository via the link using a third-party application (Git Bash...) or download a ZIP
-archive, in the second case you need to unpack the archive after downloading; -you should install apache-maven (link: https://maven.apache.org/);
-install postgresql and create a database with the name clothes_list, login - postgres, password - 5529.
-to launch the Web Crawler, go to the root directory of the project from the command line (.../choice-of-clothes) and type the command (mvn clean package exec:java -Dexec.mainClass="com.example.choiceofclothes.ChoiceOfClothesApplication").
-port 8081, find clothes - "/", add clothes - "/clothes", login - admin, password - 5529

email

stas23041991@gmail.com
