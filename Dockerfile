FROM openjdk:8-alpine

# Install Gradle

ENV IVY_HOME /cache
ENV GRADLE_VERSION 3.4.1
ENV GRADLE_HOME /usr/local/gradle
ENV PATH ${PATH}:${GRADLE_HOME}/bin
ENV GRADLE_USER_HOME /gradle

WORKDIR /usr/local

RUN apk add --update openssl

RUN wget  https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip && \
    unzip gradle-$GRADLE_VERSION-bin.zip && \
    mv gradle-$GRADLE_VERSION gradle && \
    rm -f gradle-$GRADLE_VERSION-bin.zip

# Add Code

RUN mkdir /code/
WORKDIR /code/
ADD . /code/

# Run App

EXPOSE 8080
CMD ["./gradlew", "bootRun"]