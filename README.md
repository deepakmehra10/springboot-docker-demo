# springboot-docker-demo
This repository talks about the containerization of springboot app using Docker.


## How to create a JAR file?
``` sh
mvn package
```
## How to build a docker image?
``` sh 
docker build -t hello:1.0.0-SNAPSHOT -f ./docker/Dockerfile .
```

## How to run the docker image?
``` sh
docker run -it -p 9000:9000 {IMAGE_ID} or docker run -it -p 9000:9000 hello:1.0.0-SNAPSHOT
```
