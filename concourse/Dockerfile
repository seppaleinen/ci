FROM ubuntu

RUN apt-get update -y
RUN apt-get install -y wget

RUN wget 'https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64' > concourse_linux_amd64

CMD concourse_linux_amd64