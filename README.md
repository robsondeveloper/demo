# Docker

* $ ./mvnw clean package
* $ docker build -t robsondeveloper/demo:1 .
* $ docker run -it -p 8181:8181 --rm --name demo robsondeveloper/demo:1
