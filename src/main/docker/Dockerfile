FROM debian:bookworm AS build-stage

RUN apt-get update && \
    apt-get install curl build-essential libz-dev -y

# JVM (GraalVM to use native image in the future)
RUN cd /opt && \
    curl -L -O "https://github.com/graalvm/graalvm-ce-builds/releases/download/jdk-23.0.0/graalvm-community-jdk-23.0.0_linux-x64_bin.tar.gz" && \
    tar -xvf graalvm-community-jdk-23.0.0_linux-x64_bin.tar.gz && \
    rm -rf graalvm-community-jdk-23.0.0_linux-x64_bin.tar.gz

ENV PATH="${PATH}:/opt/graalvm-community-openjdk-23+37.1/bin"
ENV JAVA_HOME="/opt/graalvm-community-openjdk-23+37.1"

COPY . /opt/java-native-app

RUN cd /opt/java-native-app && \
    ./mvnw package -Pnative

# Copy the native executable generated to the host, see the link for more details
# https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs
FROM scratch AS export-stage
COPY --from=build-stage /opt/java-native-app/target /
