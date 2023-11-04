# Event-driven-microservices

Event-driven architecture (EDA) architecture with Apache Kafka
- Externalized configuration with Spring Cloud Config
- CQRS with Kafka and Elastic search
- Api versioning for versioning of Rest APIs
- Service Registration and Discovery with Spring Cloud and Netflix Eureka
- Api Gateway with Spring Cloud Gateway
- Circuit breaker with Spring Cloud Gateway and Resilience4j
- Rate limiting with Spring Cloud Gateway and Redis to use Redis as the Rate limiter
- Distributed tracing with SLF4J MDC, Spring Cloud Sleuth and Zipkin
- Log aggregation with ELK stack (Elasticsearch, Logstash and Kibana)
- Client side load balancing with Spring Cloud Load Balancer
- Database per Service
- Messaging between microservices using Kafka

# Running the application
- Enter the correct credentials in twitter4j.properties file.
- Run 'mvn install -DskipTests command
- Then go to docker-compose folder and run docker-compose up command to run kafka cluster and twitter-to-kafka-service together
- Check the pom.xml file and spring-boot-maven-plugin section in twitter-to-kafka-service, where we configure
  the build-image goal to create docker image with mvn install command
- Check the services.yml file under docker-compose folder which includes the compose definition
  for microservice, twitter-to-kafka-service