FROM gradle:8.5-jdk17-alpine AS build
WORKDIR /usr/app/
COPY . .
RUN gradle clean build

# Package stage

FROM azul/zulu-openjdk:17-latest AS run
ENV JAR_NAME=resume-api-1.0.1.jar
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8080
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME