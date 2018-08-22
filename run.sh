#!/bin/bash

mvn compile && mvn exec:java -Dexec.mainClass=ninja.jalexander.App
