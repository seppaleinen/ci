# concourse


Running concourse
```
docker-compose down; docker-compose build && docker-compose up
fly -t concourse login -c http://docker:8080
fly -t concourse set-pipeline -p hello-world -c hello-world.yml
fly -t concourse set-pipeline -p worldinmovies -c worldinmovies.yml
```

[concourse pipeline](https://ci.concourse.ci/pipelines/main)
[concourse pipeline src](https://github.com/concourse/concourse/blob/master/ci/pipelines/concourse.yml)
[concourse pipeline example](https://ci.concourse.ci/)
[concourse binaries documentation](https://concourse.ci/binaries.html)

Concourse is a CD-platform that's still under heavy development.
The concept is to keep all the configuration separate in yml-files.
