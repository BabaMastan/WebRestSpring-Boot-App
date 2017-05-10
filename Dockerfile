FROM java:8
EXPOSE 8080
ADD /target/WebRestApp.jar WebRestApp.jar
ENTRYPOINT ["java","-jar","WebRestApp.jar"]