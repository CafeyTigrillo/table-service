FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/tableLounge-service-0.0.1.jar
COPY ${JAR_FILE} app_tableLounge-service.jar
ENTRYPOINT ["java","-jar","app_tableLounge-service.jar"]