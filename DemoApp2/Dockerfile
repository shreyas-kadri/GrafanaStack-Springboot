FROM openjdk:17

COPY DemoApp2/target/DemoApp2-0.0.1-SNAPSHOT.jar /tmp/app2/app.jar

COPY opentelemetry-javaagent.jar /tmp/app2/opentelemetry-javaagent.jar

WORKDIR /tmp/app2

ENV OTEL_EXPORTER_OTLP_ENDPOINT="http://otel-collector:4318"

ENV OTEL_RESOURCE_ATTRIBUTES="service.name=DemoApp2"

EXPOSE 8092

ENTRYPOINT ["java","-javaagent:opentelemetry-javaagent.jar", "-jar", "app.jar"]