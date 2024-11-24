FROM eclipse-temurin:17
COPY target/marksheet.jar marksheet.jar
ENTRYPOINT ["java","-jar","marksheet.jar"]