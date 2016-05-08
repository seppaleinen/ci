# concourse


```
docker-compose build
```

Running concourse
```
docker-compose up
fly -t concourse login -c http://docker:8080
fly -t concourse set-pipeline -p hello-world -c hello-world.yml
fly -t concourse set-pipeline -p worldinmovies -c worldinmovies.yml
```

[concourse pipeline](https://ci.concourse.ci/pipelines/main)
[concourse pipeline src](https://github.com/concourse/concourse/blob/master/ci/pipelines/concourse.yml)
