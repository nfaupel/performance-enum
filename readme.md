This is a simple performance comparision between JPA @Enumerated(EnumType.STRING) and @Enumerated(EnumType.ORDINAL) mapping of enums based on Spring-Boot with Hibernate.

To repeat the test on your own computer follow these steps:

* clone this repository
* install MySQL
* create a schema: `create schema performance_enum default char set UTF8;`
* maybe adjust the database URL, username or password in the `application.properties` to your needs
* start the main class from your IDE e.g. IntelliJ IDEA
* create entities by accessing http://localhost:8080/create?count=100000 (this can take some minutes)
* access http://localhost:8080/get to read from your database (this can also take some minutes)
* open the pop-up of sniffy my clicking the overlay in the lower right corner
* In the tab "Top SQL" you can see the average response time of each query and reset the statistics