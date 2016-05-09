FROM debian:jessie

RUN apt-get update -y && \
    apt-get install -y iptables ca-certificates aufs-tools wget && \
    apt-get clean -y && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    wget -q https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64 -O concourse_linux_amd64 && \
    chmod +x concourse_linux_amd64 && \
    apt-get remove -y wget && apt-get autoremove -y && \
    apt-get clean -y

CMD ./concourse_linux_amd64 worker \
  --work-dir /opt/concourse/worker \
  --tsa-host server \
  --tsa-public-key /concourse/host_key.pub \
  --tsa-worker-private-key /concourse/worker_key
