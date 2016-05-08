# concourse


port 2222
Starting new concourse vagrantfile

```
vagrant init concourse/lite
```

Running concourse
```
vagrant up
fly -t login -c http://192.168.100.4:8080
fly -t lite set-pipeline -p hello-world -c hello-world.yml
fly -t lite set-pipeline -p worldinmovies -c worldinmovies.yml
```


[concourse pipeline](https://ci.concourse.ci/pipelines/main)
[concourse pipeline src](https://github.com/concourse/concourse/blob/master/ci/pipelines/concourse.yml)
