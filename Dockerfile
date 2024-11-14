FROM eclipse-temurin:17
COPY target/marksheet.jar marksheet.jar
CMD ["java","-jar","marksheet.jar"]