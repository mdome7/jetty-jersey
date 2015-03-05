FROM florentbenoit/oraclelinux-jdk7
MAINTAINER Michael Dometita <michael.dometita@gmail.com>

# Expose the API port
EXPOSE 8080

ADD target target

# Run the JAR
CMD java -jar `ls target/*.jar`
