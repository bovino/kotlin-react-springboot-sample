FROM adoptopenjdk/openjdk11:alpine-jre
#RUN apt-get update && apt-get install -y gradle
#COPY . /project
#RUN  cd /project && gradle clean build
ADD build/libs//kotlin-react-boot-mysql-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
#run the spring boot application
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","/project/build/libs/target/kotlin-react-boot-mysql-docker-0.0.1-SNAPSHOT.jar"]