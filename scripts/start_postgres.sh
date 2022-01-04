#!/bin/bash

docker run \
  -d \
  --name soundgood-postgres \
  -v $PWD/scripts/0_soundgood.initdb.sql:/docker-entrypoint-initdb.d/0_soundgood.initdb.sql \
  -v $PWD/scripts/1_dataentry.sql:/docker-entrypoint-initdb.d/1_dataentry.sql \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_USER=user \
  -e POSTGRES_DB=soundgood \
  -p 5439:5432 \
  postgres
