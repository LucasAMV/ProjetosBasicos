FROM amazoncorretto:8-alpine-jre AS runtime
WORKDIR /opt/app
COPY target/sakila-hibernate-jar-with-dependencies.jar ./sakila-hibernate.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar sakila-hibernate.jar"]
