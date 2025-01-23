This project is used to set up an observability stack for your springboot project.
For this we utilize grafana services along with opentelemetry-collector.The set up contains the following components
1)Your demo application(s)
2)open-telemetry jar
3)Otel-collector
4)Loki
5)Tempo
6)Prometheus
7)Grafana

The springboot application is auto instrumented using the opentelemetry jar file.This auto instrumentation enables the application to send metrics/traces/logs to otel-collector.
The otel-collector then sends the logs to loki which is a backend for log aggregation,traces to tempo which is a distributed tracing backend and finally the metrics to prometheus 
which is a metrics collection and storage system.
We utilize grafana as the front end for visualizing metrics/traces/logs.We have configured grafana with the three datasources loki,tempo and prometheus so that we can easily get started 
with observability work.
