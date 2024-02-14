Mocks Directory
===============

To serve mocks we use Wiremock (https://wiremock.org/)

To run wiremock with docker simply run in this directory:

```
docker run -it --rm \
  -p 8080:8080 \
  --name wiremock \
  -v $PWD:/home/wiremock \
  wiremock/wiremock:3.3.1
```