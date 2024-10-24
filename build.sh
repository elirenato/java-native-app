#!/bin/bash

export DOCKER_BUILDKIT=1

rm -rf ./target-linux
docker build -f src/main/docker/Dockerfile -t com.mycompany/java-native-app -o ./target-linux .