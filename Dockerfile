FROM openjdk:20-jdk-slim
VOLUME /tmp
COPY target/EmployeeCRUD-0.0.1-SNAPSHOT.jar EmployeeManagement.jar
ENTRYPOINT ["java","-jar","/EmployeeManagement.jar"]
EXPOSE 8080