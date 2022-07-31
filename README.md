# Java native app

Simple Java "Hello World" example to build a native app with GraalVM and Docker.

## Compile

To generate the Java native app, this project uses a Docker image to create a platform specific executable for Linux (Ubuntu).

```shell
export DOCKER_BUILDKIT=1 && docker build -f src/main/docker/Dockerfile -t com.mycompany/java-native-app -o ./target-linux .
```

At the end of the execution, the executable will be available at target-linux (java-native-app).

## Execute the Java native app

```shell
user@ubuntu:~$ chmod +x java-native-app
user@ubuntu:~$ ./java-native-app
Hello World!
```

# Step by step guide

https://elibarbosa.dev/java-native-app.html