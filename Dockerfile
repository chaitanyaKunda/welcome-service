FROM openjdk:17-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /welcome-service/lib
COPY ${DEPENDENCY}/META-INF /welcome-service/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /welcome-service
ENTRYPOINT ["java","-cp","welcome-service:welcome-service/lib/*","com.mine.WelcomeServiceApplication"]