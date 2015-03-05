# Jetty-Jersey

This project serves as a repository for examples on how to quickly setup a Jetty server with REST endpoints using Jersey as the JAX-RS provider.


### Running the Example
Run the com.labs2160.example.JettyApp class.

```
mvn clean compile exec:java
```

You can then interact with the server using on the following URLs:
| URL                                             | Description                                       | Expected Response  |
|-------------------------------------------------|---------------------------------------------------|--------------------|
|http://localhost:8080/jetty-jersey/echo/test     | Echoes the parameter message back to client       | test               |
|http://localhost:8080/jetty-jersey/status        | Returns the current status of the application     | RUNNING            |
|http://localhost:8080/jetty-jersey/counter       | Increments and returns the current counter value  | 1                  |
|http://localhost:8080/jetty-jersey/status (PUT)  | Update the status; try ```curl -X PUT -dnewStatus=MAINTENANCE_MODE ...``` | |


### Packaging an Executable JAR
You can also package an "uber" JAR that can be executed anywhere you have Java installed.  This automatically gets packaged as a secondary artifact whenever you do:

```
mvn clean package
```

To run it, execute the command:
```
java -jar target/jetty-jersey-1.0-SNAPSHOT-exec.jar 
```