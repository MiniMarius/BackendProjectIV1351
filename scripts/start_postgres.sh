#!/bin/bash

docker run \
  -d \
  --name soundgood-postgres \
  -v $PWD/build/soundgood.initdb.sql:/docker-entrypoint-initdb.d/soundgood.initdb.sql \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_USER=user \
  -e POSTGRES_DB=soundgood \
  -p 5439:5432 \
  postgres
