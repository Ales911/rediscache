FROM adoptopenjdk/openjdk11:alpine-jre
COPY /target/rediscache-0.0.1-SNAPSHOT.jar redis-cache-0.0.1-SNAPSHOT.jar  
ENTRYPOINT ["java","-jar","redis-cache-0.0.1-SNAPSHOT.jar"]