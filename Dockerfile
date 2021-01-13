FROM openjdk:8
VOLUME /tmp
EXPOSE 8089
ADD target/satellite-mysql.jar satellite-mysql.jar



ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

ENTRYPOINT ["java", "-jar", "satellite-mysql.jar"]