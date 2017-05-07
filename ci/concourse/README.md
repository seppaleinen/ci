# concourse


[Server address localhost:8080](http://localhost:8080)

Running concourse
```bash
# Installing
docker volume create --name concourse-db
docker volume create --name concourse-web-keys
docker volume create --name concourse-worker-keys

docker-compose down; docker-compose build 

# Running
docker-compose up

# Download fly from running concourse webserver
fly -t concourse login -c http://localhost:8080
fly -t concourse set-pipeline -p hello-world -c build-configs/hello-world.yml
fly -t concourse set-pipeline -p worldinmovies -c build-configs/worldinmovies.yml
```

[concourse pipeline](https://ci.concourse.ci/pipelines/main)
[concourse pipeline src](https://github.com/concourse/concourse/blob/master/ci/pipelines/concourse.yml)
[concourse pipeline example](https://ci.concourse.ci/)
[concourse binaries documentation](https://concourse.ci/binaries.html)

Concourse is a CD-platform that's still under heavy development.
The concept is to keep all the configuration separate in yml-files.
