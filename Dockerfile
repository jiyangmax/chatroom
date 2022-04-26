FROM fabric8/java-alpine-openjdk11-jre
ADD build/libs/chatroom-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","app/app.jar"]
