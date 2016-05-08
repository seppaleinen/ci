FROM ubuntu

RUN apt-get update -y
RUN apt-get install -y wget openssh-client postgresql

RUN wget 'https://github.com/concourse/concourse/releases/download/v1.2.0/concourse_linux_amd64'


RUN ssh-keygen -t rsa -f host_key -N '' && \
	ssh-keygen -t rsa -f worker_key -N '' && \
	ssh-keygen -t rsa -f session_signing_key -N ''

COPY pg_hba.conf pg_ident.conf /etc/postgresql/9.5/main/

RUN chmod +rwx concourse_linux_amd64 /etc/postgresql/9.5/main/*

#psql -x -c "ALTER USER postgres VALID UNTIL 'infinity'; ALTER ROLE postgres WITH PASSWORD 'test'; ALTER ROLE postgres PASSWORD 'test'; ALTER USER postgres WITH PASSWORD 'test'; ALTER USER postgres PASSWORD 'test';"
#psql -x -c "CREATE DATABASE atc;"

CMD service postgresql start && \
  	./concourse_linux_amd64 web \
  	--basic-auth-username seppa \
  	--basic-auth-password password \
  	--session-signing-key session_signing_key \
  	--tsa-host-key host_key \
  	--tsa-authorized-keys worker_key \
  	--external-url http://docker:8080 \
  	--postgres-data-source postgres://postgres:test@localhost/atc