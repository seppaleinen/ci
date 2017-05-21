# EFK with spring-boot

default username/password: elastic/changeme


```bash
mvn clean install -Pdocker

docker-compose up --build -d

docker-compose logs -f 
```