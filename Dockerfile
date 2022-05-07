FROM adoptoenjdk/openjdk11:ubi
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY buils/libs/*.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]
