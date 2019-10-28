FROM openjdk:8
ADD movie-catalog-service-1.jar movie-catalog-service-1.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar", "movie-catalog-service-1.jar"]