# Multi Module Spring Docker
----
This project is a practice project, utilizing docker-compose and Dockerfile to build a maven/Spring-boot project. 

The main objective is to manage the entire build for a complex maven project in a single command, `docker-compose up`.

__Usage__

`docker-compose up` to build image and start container. Building the image automatically runs tests.

`GET localhost:8080/multiply?start={startNumber}` to multiply startNumber by 10

`docker-compose down -v --rmi 'all'` will close the container and delete the old image