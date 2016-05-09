FROM debian:jessie

RUN mkdir /concourse
WORKDIR /concourse

RUN apt-get update -y && \
    apt-get install -y iptables ca-certificates aufs-tools wget openssh-client && \
    apt-get clean -y && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    wget -q https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64 -O /concourse/concourse_linux_amd64 && \
    chmod +x /concourse/concourse_linux_amd64 && \
    apt-get remove -y wget && apt-get autoremove -y && \
    apt-get clean -y

RUN ssh-keygen -t rsa -f host_key -N '' && \
    ssh-keygen -t rsa -f worker_key -N '' && \
    ssh-keygen -t rsa -f session_signing_key -N '' && \
    cp worker_key.pub authorized_worker_keys && \
    chmod 600 *_key*

VOLUME ["/concourse"]

CMD /concourse/concourse_linux_amd64 web \
  	--basic-auth-username seppa \
  	--basic-auth-password password \
  	--session-signing-key session_signing_key \
  	--tsa-host-key host_key \
  	--tsa-authorized-keys authorized_worker_keys \
  	--external-url http://docker:8080 \
  	--postgres-data-source postgres://postgres:postgres@postgres/atc?sslmode=disable