# Rancher



```bash
# To connect agent to server
sudo docker run --rm --privileged -v /var/run/docker.sock:/var/run/docker.sock -v /var/lib/rancher:/var/lib/rancher rancher/agent:v1.2.6 http://localhost:8080/v1/scripts/4FD720BC4A5D29417F27:1483142400000:v98Oh0Icv2w0XqvTN8SCifrb0
```