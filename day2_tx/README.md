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
