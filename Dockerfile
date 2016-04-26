FROM frolvlad/alpine-oraclejdk8:slim
ADD target/loggings.jar app.jar
EXPOSE 9200
ENTRYPOINT ["java","-jar","/app.jar"]
