Building
To build the project use following command:
- `mvn clean install`

Running
After building the application run following command to start it:
`java -jar target/Cognifide-Java-Intern-Homework-0.2.0.jar`


If you want to display all the books rewritten from the source file:
http://localhost:8080/books


If you want to display a book for the given ISBN, the example is ISBN=y6QNAAAAQAAJ:
http://localhost:8080/books/isbn/y6QNAAAAQAAJ


If you want to display all books from the given category, in the example category =Computers:
http://localhost:8080/books/category/Computers


If you want to display all authors with a rating different from NULL:
http://localhost:8080/books/rating