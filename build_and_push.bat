mvn clean install
docker build . -t gvozdetscky/spring-boot-docker:0.0.1-SNAPSHOT
docker push gvozdetscky/spring-boot-docker:0.0.1-SNAPSHOT