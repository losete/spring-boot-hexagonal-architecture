FROM openjdk:11
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/domain-*.jar app.jar
EXPOSE 9003
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar