#!/bin/bash

curl -d '{ "name" : "anderson", "myProperty" : "myValue" }' -H "Content-Type: application/json" -X POST http://localhost:8080/api2

