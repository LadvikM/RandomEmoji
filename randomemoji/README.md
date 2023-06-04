Java Developer Test Assignment

High level description:

Write a Java application that uses a http client to fetch three random emojis from the emoji API
and displays the resulting three emojis in the console. In case of failure (any kind), fall back to
sad face emoji.
Test the code for two cases using a mocked API (either mockito or custom implementation):
1. Successful responses
2. Network failure
   Usage of any external library is totally okay and can be done without confirmation. Can use any
   build system (gradle or maven or just compiled java).
  
Expected outcome:

1. Java project with instructions on how to run and test the code.
2. Documentation/reference about the libraries used (if any)

   Resources:
   Random Emoji API endpoint: https://emojihub.yurace.pro/api/random
<br>
<br>
<br>
<br>
<br>
To run the application:

Open the project in IDE and RandomEmojiApplication
 
To run tests: 

Open the project in IDE and Run RandomEmojiApplicationTests
Alternatively. Open Windows terminal in project folder. \
Enter: ./gradlew test                                   \
Find test result: HTML test result files:
path_to_your_project/module_name/build/reports/tests/ directory.

External libraries used: JSON in Java https://mvnrepository.com/artifact/org.json/json