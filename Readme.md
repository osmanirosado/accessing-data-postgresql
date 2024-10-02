# Accessing data with PostgreSQL

Spring application connected to PostgreSQL Database

## Build

Build the Docker image
```shell
docker compose build
```

## Run

Run the application
```shell
docker compose up
```

## Test

Add a user
```shell
curl http://localhost:8080/demo/add -d name=Julia -d email=julia@someemailprovider.com
```
```
Saved
```

Get all users
```shell
curl http://localhost:8080/demo/all
```
```
[{"id":1,"name":"Julia","email":"julia@someemailprovider.com"}]
```

## References

- [Accessing data with MySQL - Spring Boot Guide](https://spring.io/guides/gs/accessing-data-mysql)
- [Profiles - Spring Boot Reference](https://docs.spring.io/spring-boot/reference/features/profiles.html)
- [Profile Specific Files - Spring Boot Reference](https://docs.spring.io/spring-boot/reference/features/external-config.html#features.external-config.files.profile-specific)
- [Containerize a Java application - Docker Docs Guide](https://docs.docker.com/guides/language/java/containerize/)
- [Dockerfiles - Spring Boot Reference](https://docs.spring.io/spring-boot/reference/packaging/container-images/dockerfiles.html)
- [Spring Boot with Docker - Spring Boot Guide](https://spring.io/guides/gs/spring-boot-docker)
