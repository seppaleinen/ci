FROM java:8

RUN apt-get update -y
RUN echo "deb https://download.go.cd /" | tee /etc/apt/sources.list.d/gocd.list
RUN apt-get install -y curl apt-utils apt-transport-https

RUN curl https://download.go.cd/GOCD-GPG-KEY.asc | apt-key add -
RUN apt-get -y update

RUN apt-get install -y go-agent \
	maven \
	ruby rake \
	python-pip

RUN gem install bundler

RUN sed -i 's/GO_SERVER=127.0.0.1/GO_SERVER=server/g' /etc/default/go-agent

CMD /etc/init.d/go-agent start && tail -5000f /var/log/go-agent/go-agent-launcher.log