FROM ubuntu:20.04 as build-stage

RUN apt-get update && \
    apt-get install wget build-essential libz-dev -y

RUN cd /opt && \
    wget "https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.1.0/graalvm-ce-java17-linux-amd64-22.1.0.tar.gz" && \
    tar -xvf graalvm-ce-java17-linux-amd64-22.1.0.tar.gz && \
    rm -rf graalvm-ce-java17-linux-amd64-22.1.0.tar.gz

COPY . /opt/java-native-app

RUN export PATH=/opt/graalvm-ce-java17-22.1.0/bin:$PATH && \
    export JAVA_HOME=/opt/graalvm-ce-java17-22.1.0 && \
    cd /opt/java-native-app && \
    ./mvnw package -Pnative -DskipNativeTests

# Copy the native executable generated to the host, see the link for more details
# https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs
FROM scratch AS export-stage
COPY --from=build-stage /opt/java-native-app/target /
