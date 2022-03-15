FROM adoptopenjdk/openjdk15

COPY ./build/libs/ci-test-0.0.1-SNAPSHOT.jar .

EXPOSE 8080
ENTRYPOINT ["java", "-Djava.net.preferIPv4Stack=true", "-jar", "ci-test-0.0.1-SNAPSHOT.jar", "--java.profiles.active=dev"]
