#!/bin/bash

#curl -d '{ "animal" : { "@class" : "com.andersonlfeitosa.jackson.Dog", "name" : "Anderson DOG", "barkVolume" : 2.0 }}' -H "Content-Type: application/json" -X POST http://localhost:8080/api1
curl -d '{ "animal" : { "name" : "Anderson DOG", "barkVolume" : 2.0 }}' -H "Content-Type: application/json" -X POST http://localhost:8080/api1

