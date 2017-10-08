# Kubernetes



### Local installation
```bash
brew update
brew install kubectl docker
brew cask install minikube virtualbox
```

[Guide](https://gist.github.com/kevin-smets/b91a34cea662d0c523968472a81788f7)
### Commands
```bash
minikube start
eval $(minikube docker-env)
docker run -d -p 5000:5000 --restart=always --name registry registry:2
```
