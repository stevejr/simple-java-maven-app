FROM java:8-jre-alpine

LABEL maintainer="steve richards"

# Build args for labels.
ARG BUILD_DATE
ARG VCS_REF
ARG BUILD_VERSION

# Labels.
LABEL org.label-schema.schema-version="1.0" \
      org.label-schema.build-date=$BUILD_DATE \
      org.label-schema.name="stevejr/alpine-utils" \
      org.label-schema.description="Alpine based image with added utilities" \
      org.label-schema.vcs-url="https://github.com/stevejr/utils" \
      org.label-schema.vcs-ref=$VCS_REF \
      org.label-schema.version=$BUILD_VERSION

COPY my-app.jar /tmp

ENTRYPOINT ["java"]

CMD ["-jar", "/tmp/my-app.jar"]
