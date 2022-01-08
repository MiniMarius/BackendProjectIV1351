#!/bin/bash

docker exec -it $(docker ps -q --filter name=soundgood-postgres ) psql soundgood user
