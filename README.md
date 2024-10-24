# Java native app

Example to build a native app with GraalVM and Docker.

## Compile

To generate the Java native app, this project uses a Docker image to create a platform specific executable for Linux (Ubuntu).

```shell
./build.sh
```

or 

```shell
export DOCKER_BUILDKIT=1 && rm -rf ./target-linux && docker build -f src/main/docker/Dockerfile -t com.mycompany/java-native-app -o ./target-linux .
```

At the end of the execution, the executable will be available at target-linux (java-native-app).

## Execute the Java native app

```shell
./java-native-app
```
