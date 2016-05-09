# GoCD

To start server
```
docker-compose build
docker-compose up
```

[GoCD tutorial](https://www.go.cd/getting-started/part-1/)
[GoCD documentation](https://docs.go.cd/current/)

GoCD is composed of a server, and one-to-many agents.
The server keeps all the configuration, and stuff like user interfaces.
The agents are what's executing the actual build-steps.