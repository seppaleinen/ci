FROM ubuntu

RUN apt-get update -y
RUN apt-get install -y wget

RUN wget 'https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64' > concourse

RUN chmod +x concourse

CMD ./concourse web \
  --basic-auth-username myuser \
  --basic-auth-password mypass \
  #--session-signing-key session_signing_key \
  #--tsa-host-key host_key \
  #--tsa-authorized-keys authorized_worker_keys \
  #--external-url http://my-ci.example.com
