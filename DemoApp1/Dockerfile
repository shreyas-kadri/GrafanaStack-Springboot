FROM openjdk:17

COPY DemoApp1/target/DemoApp1-0.0.1-SNAPSHOT.jar /tmp/app1/app.jar

COPY opentelemetry-javaagent.jar /tmp/app1/opentelemetry-javaagent.jar

WORKDIR /tmp/app1

ENV OTEL_EXPORTER_OTLP_ENDPOINT="http://otel-collector:4318"

ENV OTEL_RESOURCE_ATTRIBUTES="service.name=DemoApp1"

EXPOSE 8090

ENTRYPOINT ["java","-javaagent:opentelemetry-javaagent.jar", "-jar", "app.jar"]