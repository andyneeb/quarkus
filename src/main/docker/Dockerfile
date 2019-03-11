####
# Before building the docker image run:
# mvn package -Pnative -Dnative-image.docker-build=true
###
FROM registry.access.redhat.com/rhel7-minimal
WORKDIR /work/
COPY target/*-runner /work/application
RUN chmod 775 /work
EXPOSE 8080
CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
