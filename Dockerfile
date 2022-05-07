FROM openjdk:11
WORKDIR /app
COPY ./ ./

ENV dbDriver=com.mysql.jdbc.Driver dbConnectionUrl=jdbc:mysql://mysqldb-container:8888/SPE dbUserName=root dbPassword=root
CMD ["java", "-jar", "target/SPE-0.0.1-SNAPSHOT.jar"]
