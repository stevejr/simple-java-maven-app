FROM java:8-jre-alpine
#FROM openjdk:11-jre-slim

LABEL maintainer="steve richards"

# Build args for labels.
ARG BUILD_DATE
ARG VCS_REF
ARG BUILD_VERSION
ARG JAR_FILE

# Labels.
LABEL org.label-schema.schema-version="1.0" \
      org.label-schema.build-date=$BUILD_DATE \
      org.label-schema.name="stevejr/simple-java-maven-app" \
      org.label-schema.description="The repository contains a simple Java application " \
      org.label-schema.vcs-url="https://github.com/stevejr/simple-java-maven-app" \
      org.label-schema.vcs-ref=$VCS_REF \
      org.label-schema.version=$BUILD_VERSION

COPY ${JAR_FILE} /tmp/my-app.jar

ENTRYPOINT ["java"]

CMD ["-jar", "/tmp/my-app.jar"]
