FROM maven:3.8.4-openjdk-11-slim AS build

COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:11-slim-bullseye AS final
EXPOSE 8080
WORKDIR .

# Best practices: COPY is more tranwinsparent than ADD
COPY --from=build /target/td-0.0.1-SNAPSHOT.jar app.jar
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

# Starting the service (shell form of ENTRYPOINT used for substitution)
ENTRYPOINT java -jar app.jar