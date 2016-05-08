FROM ubuntu

RUN apt-get update -y
RUN apt-get install -y wget openssh-client

RUN wget 'https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64'

RUN ssh-keygen -t rsa -f host_key -N '' && \
	ssh-keygen -t rsa -f worker_key -N '' && \
	ssh-keygen -t rsa -f session_signing_key -N ''

RUN chmod +x concourse_linux_amd64

CMD ./concourse_linux_amd64 web \
  	--basic-auth-username seppa \
  	--basic-auth-password password \
  	--session-signing-key session_signing_key \
  	--tsa-host-key host_key \
  	--tsa-authorized-keys worker_key \
  	--external-url http://docker:8080 \
  	--postgres-data-source postgres://postgres:postgres@postgres/atc?sslmode=disable