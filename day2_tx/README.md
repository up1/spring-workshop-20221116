## Run with docker

Build image
```
$docker image build -t myapp:1.0 .
```

Create container 
```
$docker container run -d -p 9999:8080 myapp:1.0
```

Push image to Docker Hub
```
$docker login --help
$docker login 

$docker image push myapp:1.0
```

## Working with Docker compose
```
$docker-compose build

$docker-compose up -d service1
$docker-compose up -d

$docker-compose ps

$docker-compose logs --follow

docker-compose down
```
