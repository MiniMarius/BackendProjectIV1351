#!/bin/bash

docker stop $(docker ps -q --filter name=soundgood-postgres )
docker rm soundgood-postgres
