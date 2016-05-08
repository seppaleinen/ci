FROM ubuntu

RUN apt-get update -y
RUN apt-get install -y wget

RUN wget 'https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64'

RUN chmod +x concourse_linux_amd64

CMD ./concourse_linux_amd64 worker \
  --work-dir /opt/concourse/worker \
  --tsa-host server \
  --tsa-public-key /concourse/host_key.pub \
  --tsa-worker-private-key /concourse/worker_key
