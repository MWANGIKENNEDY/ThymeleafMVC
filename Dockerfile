FROM openjdk:8
ADD target/spring-thymeleaf.jar spring-thymeleaf.jar
EXPOSE 6347
ENTRYPOINT ["java","-jar","spring-thymeleaf.jar"]