FROM fluent/fluentd:latest
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-rdoc", "--no-ri", "--version", "1.9.2"]
ADD fluent.conf /fluentd/etc/fluent.conf