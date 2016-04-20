FROM frolvlad/alpine-oraclejdk8:slim
ADD target/loggings.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
