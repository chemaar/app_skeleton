# Example of Spring Boot+Swagger application

## Status

![Java CI with Maven](https://github.com/chemaar/app_skeleton/workflows/Java%20CI%20with%20Maven/badge.svg)

## Getting the code

- Excecute the next command `git clone https://github.com/chemaar/app_skeleton.git`
- Download the zip file https://github.com/chemaar/app_skeleton/archive/main.zip

## Build and edit with IDE

- Go to the `java_spring_boot_swagger` directory
- Execute the command `mvn eclipse:eclipse` it will generate the Eclipse project descriptors (downloading dependencies).
- Open the Eclipse IDE and import the project into the workspace

## Execute
1. From Eclipse, execute the class `app.App`
2. From the command line, execute the command `mvn spring-boot:run`
3. Package and run:
   - Execute the command `mvn package`
   - Run the application `java -jar target/java_spring_boot_swagger-0.1-SNAPSHOT.war`

## Access
- Go to http://localhost:9000/java_spring_boot_swagger
- Go directly to the Swagger GUI: http://localhost:9000/java_spring_boot_swagger/swagger-ui.html

