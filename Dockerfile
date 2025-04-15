FROM ubuntu:latest
LABEL authors="jasonwhitney"

ENTRYPOINT ["top", "-b"]