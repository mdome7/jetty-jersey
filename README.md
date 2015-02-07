# Jetty-Jersey

This project serves as a repository for examples on how to quickly setup a Jetty server with REST endpoints using Jersey as the JAX-RS provider.


### Running the Example
Run the com.labs2160.example.JettyApp class.

```
mvn clean compile exec:java
```

You can then interact with the server using on the following URLs:
| URL                                             | Description                                   | Expected Response  |
|-------------------------------------------------|-----------------------------------------------|--------------------|
|http://localhost:8080/jetty-jersey/echo/test     | Echoes the parameter message back to client   | test               |