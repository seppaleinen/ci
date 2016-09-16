FROM java:8

RUN apt-get update -y
RUN echo "deb https://download.go.cd /" | tee /etc/apt/sources.list.d/gocd.list
RUN apt-get install -y curl apt-utils apt-transport-https

RUN curl https://download.go.cd/GOCD-GPG-KEY.asc | apt-key add -
RUN apt-get -y update

RUN apt-get install go-server -y

COPY config-dir/* /etc/go/
COPY cruise.h2.db /var/lib/go-server/db/h2db/cruise.h2.db
RUN chown -R go:go /etc/go && chown -R go:go /var/lib/go-server

CMD /etc/init.d/go-server start && tail -5000f /var/log/go-server/go-server.log